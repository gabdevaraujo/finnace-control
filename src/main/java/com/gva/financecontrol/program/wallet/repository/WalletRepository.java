package com.gva.financecontrol.program.wallet.repository;

import com.gva.financecontrol.program.wallet.model.Wallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long>{

    Wallet findByUserId(Long userId);
    
}