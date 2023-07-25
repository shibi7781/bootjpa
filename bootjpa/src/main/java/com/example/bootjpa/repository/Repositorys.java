package com.example.bootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bootjpa.model.Bean;

@Repository
public interface Repositorys extends JpaRepository<Bean,Integer>{
	
}