package com.aurionpro.project.controllers;

import com.aurionpro.project.dto.CreditDto;
import com.aurionpro.project.dto.TransactionDto;
import com.aurionpro.project.dto.WithdrawDto;
import com.aurionpro.project.dto.TransferDto;
import com.aurionpro.project.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankapp/customer/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/credit")
    public ResponseEntity<TransactionDto> credit(@RequestBody CreditDto creditDto) {
        TransactionDto result = transactionService.credit(creditDto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<TransactionDto> withdraw(@RequestBody WithdrawDto withdrawDto) {
        TransactionDto result = transactionService.withdraw(withdrawDto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/transfer")
    public ResponseEntity<TransactionDto> transfer(@RequestBody TransferDto transferDto) {
        TransactionDto result = transactionService.transfer(transferDto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
