package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.LoginRepository;

@Service
public class Loginservice {

	@Autowired
	LoginRepository repository;

}
