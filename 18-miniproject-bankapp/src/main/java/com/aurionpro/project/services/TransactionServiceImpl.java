package com.aurionpro.project.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aurionpro.project.exceptions.*;
import com.aurionpro.project.dto.CreditDto;
import com.aurionpro.project.dto.TransactionDto;
import com.aurionpro.project.dto.TransferDto;
import com.aurionpro.project.dto.WithdrawDto;
import com.aurionpro.project.entities.Account;
import com.aurionpro.project.entities.Transaction;
import com.aurionpro.project.entities.TransactionStatus;
import com.aurionpro.project.entities.TransactionType;
import com.aurionpro.project.repositories.AccountRepository;
import com.aurionpro.project.repositories.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    private TransactionDto convertToTransactionDto(Transaction transaction) {
        TransactionDto dto = new TransactionDto();      
        dto.setAmount(transaction.getAmount());
        dto.setTransactionDate(transaction.getTransactionDate());
        dto.setTransactionStatus(transaction.getTransactionStatus());
        dto.setTransactionType(transaction.getTransactionType());
        dto.setSenderAccountNumber(transaction.getSenderAccount() != null ? transaction.getSenderAccount().getAccountNumber() : null);
        dto.setReceiverAccountNumber(transaction.getReceiverAccount() != null ? transaction.getReceiverAccount().getAccountNumber() : null);
        return dto;
    }

    public TransactionDto credit(CreditDto creditDto) {
        Account account = accountRepository.findByAccountNumber(creditDto.getAccountNumber());
        if (account == null) {
            throw new RuntimeException("Account not found");
        }
        account.setBalance(account.getBalance() + creditDto.getAmount());

        Transaction transaction = new Transaction();
        transaction.setAmount(creditDto.getAmount());
        transaction.setTransactionDate(creditDto.getTransactionDate());
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);
        transaction.setTransactionType(TransactionType.CREDIT);
        transaction.setReceiverAccount(account);

        transactionRepository.save(transaction);
        accountRepository.save(account);

        return convertToTransactionDto(transaction);
    }

    public TransactionDto withdraw(WithdrawDto withdrawDto) {
        Account account = accountRepository.findByAccountNumber(withdrawDto.getAccountNumber());
        if (account == null) {
            throw new RuntimeException("Account not found");
        }
        if (account.getBalance() < withdrawDto.getAmount()) {
            throw new RuntimeException("Insufficient balance");
        }
        account.setBalance(account.getBalance() - withdrawDto.getAmount());

        Transaction transaction = new Transaction();
        transaction.setAmount(withdrawDto.getAmount());
        transaction.setTransactionDate(withdrawDto.getTransactionDate());
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);
        transaction.setTransactionType(TransactionType.WITHDRAWAL);
        transaction.setSenderAccount(account);

        transactionRepository.save(transaction);
        accountRepository.save(account);

        return convertToTransactionDto(transaction);
    }

    public TransactionDto transfer(TransferDto transferDto) {
        Account senderAccount = accountRepository.findByAccountNumber(transferDto.getSenderAccountNumber());
        Account receiverAccount = accountRepository.findByAccountNumber(transferDto.getReceiverAccountNumber());

        if (senderAccount == null || receiverAccount == null) {
            throw new ValidationException("One or both accounts not found");
        }
        if (senderAccount.getBalance() < transferDto.getAmount()) {
            throw new ValidationException("Insufficient balance");
        }

        senderAccount.setBalance(senderAccount.getBalance() - transferDto.getAmount());
        receiverAccount.setBalance(receiverAccount.getBalance() + transferDto.getAmount());

        Transaction transaction = new Transaction();
        transaction.setAmount(transferDto.getAmount());
        transaction.setTransactionDate(transferDto.getTransactionDate());
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);
        transaction.setTransactionType(TransactionType.TRANSFER);
        transaction.setSenderAccount(senderAccount);
        transaction.setReceiverAccount(receiverAccount);

        transactionRepository.save(transaction);
        accountRepository.save(senderAccount);
        accountRepository.save(receiverAccount);

        return convertToTransactionDto(transaction);
    }
}
