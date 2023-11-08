package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}