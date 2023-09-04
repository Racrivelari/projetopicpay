package com.projetopicpay.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionDTO(BigDecimal value, LocalDateTime timestamp, Long senderId, Long receiverId) {
    
}

