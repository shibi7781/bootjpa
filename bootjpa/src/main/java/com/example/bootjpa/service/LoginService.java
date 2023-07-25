package com.example.bootjpa.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootjpa.model.Bean;
import com.example.bootjpa.repository.Repositorys;

@Service
public class LoginService {
	@Autowired
	Bean repository;
	
	public List<Bean> insertData(Bean model){
		repository.save(model);
		List<Bean> list=repository.findAll();
		return list;
	}

}