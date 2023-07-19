package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Account;


@Repository
public interface SpringBootDao extends JpaRepository<Account, Integer> {

}
 