package com.aurionpro.jpacrud.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customerId")
    private int customerId;
    
    @NotBlank(message = "First name cannot be blank")
    @Column(name="firstname")
    private String firstname;
    
    @Column(name="lastname")
    private String lastname;
    
    @Column(name="dob")
    private LocalDate dob;
    
    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    @Column(name="emailId")
    private String emailId;
    
    @NotNull(message = "Phone number cannot be null")
    @Size(max = 10, message = "Phone number can be a maximum of 10 digits")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    @Column(name="phoneNumber")
    private String phoneNumber;
}
