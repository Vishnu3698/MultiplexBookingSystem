package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.multiplexbookingsystem.Repository.UserRepository;
import com.cg.multiplexbookingsystem.entity.User;

@Service
public class UserService implements IUserService {

	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User insertUser(User newUser) {
		// TODO Auto-generated method stub
		return userRepository.save(newUser);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(Long uid) {
		// TODO Auto-generated method stub
		return userRepository.findById(uid);
	}

	@Override
	public User updateUser(User updateUser) {
		return userRepository.save(updateUser);
		
	}
	
	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

}