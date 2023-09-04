package com.projetopicpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopicpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}



