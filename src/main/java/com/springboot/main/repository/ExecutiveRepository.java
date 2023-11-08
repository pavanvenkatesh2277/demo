package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Executive;

public interface ExecutiveRepository extends JpaRepository<Executive, Integer>{

}