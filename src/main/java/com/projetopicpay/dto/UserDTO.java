package com.projetopicpay.dto;

import java.math.BigDecimal;

import com.projetopicpay.enums.UserType;

public record UserDTO(String fName, String lName, String cpf, BigDecimal balance, String email, String password, UserType userType) {
    
}
