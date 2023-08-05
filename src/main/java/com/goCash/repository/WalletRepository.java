package com.goCash.repository;

import com.goCash.entities.WalletAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletAccount,Long> {

}
