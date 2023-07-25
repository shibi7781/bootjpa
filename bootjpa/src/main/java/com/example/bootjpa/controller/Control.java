package com.example.bootjpa.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bootjpa.model.Bean;
import com.example.bootjpa.model.ModelandView;
import com.example.bootjpa.service.LoginService;
import com.example.bootjpa.service.UserService;

@Controller
public class Control {
	@Autowired
	UserService service;

	@Autowired
	LoginService logic;

	@RequestMapping("/")
	public ModelandView index() {
		return new ModelandView("index");
	}

	@RequestMapping("/login")
	public String login(@RequestParam String name) {
		System.out.println(name);
		return "login";
	}

	@PostMapping("/Login")
	public String loginCheck(@ModelAttribute("loginName")Bean model) {
		List<Bean>list=logic.insertData(model);
		for(Bean m:list) {
			System.out.println(m.getName()+"   -    "+m.getMessage());
		}
		return "index";
		}
	}
}
