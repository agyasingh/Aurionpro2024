package com.aurionpro.project.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admins")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

//    @NotBlank(message = "Username is mandatory")
//    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
//    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username can only contain letters, numbers, and underscores")
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @NotBlank(message = "Password is mandatory")
//    @Size(min = 8, message = "Password must be at least 8 characters long")
//    @Column(nullable = false)
//    private String password;

    @Column(unique = true)
    private String email;

    
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
}
