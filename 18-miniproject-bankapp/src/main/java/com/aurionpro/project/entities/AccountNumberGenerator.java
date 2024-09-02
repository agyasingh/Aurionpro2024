package com.aurionpro.project.entities;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AccountNumberGenerator {

    private final Random random = new Random();
    private static final String BANK_CODE = "ICIC";
    private static final int ACCOUNT_NUMBER_LENGTH = 12; // Total length of account number including code

    public String generateAccountNumber() {
        // Generate a unique sequence of digits
        long number = Math.abs(random.nextLong()); // Ensure positive number
        String numberStr = String.format("%0" + (ACCOUNT_NUMBER_LENGTH - BANK_CODE.length()) + "d", number); // Format number to required length

        // Combine fixed code with generated number
        return BANK_CODE + numberStr.substring(0, ACCOUNT_NUMBER_LENGTH - BANK_CODE.length());
    }
}
