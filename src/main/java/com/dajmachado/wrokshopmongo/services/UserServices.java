package com.dajmachado.wrokshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dajmachado.wrokshopmongo.domain.User;
import com.dajmachado.wrokshopmongo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		
		return repo.findAll();
		
	}
}
