package com.aurionpro.jpacrud.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDto {
    private long bankId;
    private String bankName;
    private String ifscno;
}
