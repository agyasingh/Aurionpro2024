package com.aurionpro.jpacrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.BankDto;
import com.aurionpro.jpacrud.entities.Bank;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.repositories.BankRepository;
import com.aurionpro.jpacrud.repositories.SalaryAccountRepository;

@Service
public class BankServiceImpl implements BankService{
	
	@Autowired
	private BankRepository bankrepo;
	
	@Autowired
    private SalaryAccountRepository salaryAccountRepository;

	@Override
	public Bank addBank(BankDto bankDto) {
	    Bank bank = new Bank();
	    System.out.println("Bank Name: " + bankDto.getBankName());
	    System.out.println("IFSC No: " + bankDto.getIfscno());
	    bank.setBankName(bankDto.getBankName()); 
	    bank.setIfscno(bankDto.getIfscno());   
	    return bankrepo.save(bank);
	}


	@Override
	public void deleteBank(long bankId) {
		// TODO Auto-generated method stub
		bankrepo.deleteById(bankId);
	}

//	@Override
//	public Bank updateBank(BankDto bankDto) {
//		// TODO Auto-generated method stub
//		return
//	}

	@Override
	public List<Bank> getAllBanks() {
		// TODO Auto-generated method stub
		return bankrepo.findAll();
	}


	@Override

    public Bank allocateSalaryAccount(long bankId, List<SalaryAccount> salaryAccounts) {
        // Fetch the Bank entity by bankId
        Optional<Bank> optionalBank = bankrepo.findById(bankId);
        if (!optionalBank.isPresent()) {
            // Handle case where bank is not found
            return null;
        }

        Bank bank = optionalBank.get();

        // Iterate over the list of SalaryAccounts
        for (SalaryAccount salaryAccount : salaryAccounts) {
            // Fetch the SalaryAccount entity by its accountNumber
            Optional<SalaryAccount> optionalSalaryAccount = salaryAccountRepository.findById(salaryAccount.getAccountNumber());
            if (optionalSalaryAccount.isPresent()) {
                SalaryAccount existingSalaryAccount = optionalSalaryAccount.get();
                
                // Associate the existing SalaryAccount with the Bank
                existingSalaryAccount.setBank(bank);
                
                // Save the updated SalaryAccount entity
                salaryAccountRepository.save(existingSalaryAccount);
            } else {
                // Handle case where salary account is not found
                // Optionally, return a different response or log an error
                return null;
            }
        }

        // Save and return the updated Bank entity
        return bankrepo.save(bank);
    }
}
