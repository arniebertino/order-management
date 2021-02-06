package com.neon.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.neon.ordermanagement.bean.User;
import com.neon.ordermanagement.entity.UserEntity;
import com.neon.ordermanagement.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean getuser(User user){
		
		String userName = user.getUserName();
		String password = user.getPassword();
		
		Optional<UserEntity> userFromDb= userRepository.findById(userName);
		
		String userNameDb;
		String passwordDb;
		if(userFromDb.isPresent()) {
			UserEntity ue=userFromDb.get();
			userNameDb=ue.getUserName();
			passwordDb=ue.getPassword();
			
			if(userName.equals(userNameDb) && password.equals(passwordDb))
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
		

		
	}


	}



