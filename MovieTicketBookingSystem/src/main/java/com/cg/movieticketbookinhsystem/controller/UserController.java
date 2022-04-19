package com.cg.movieticketbookinhsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movieticketbookinhsystem.entity.User;
import com.cg.movieticketbookinhsystem.exception.UserNotFoundException;
import com.cg.movieticketbookinhsystem.service.IUserService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public IUserService userService;
	
	@PostMapping("/insertuser")
	public User insertUser(@RequestBody User newUser) {
		return userService.insertUser(newUser);
		
	}
	@GetMapping("/userList")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	@GetMapping("/userList/{id}")
		public Optional<User> getUser(@PathVariable ("id") Long uid){
   return userService.getUser(uid);
	}
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable ("id")Long userId) {
		userService.deleteUser(userId);
	}
	
	@PutMapping("/updateuser/{id}")
	public User updateUser(@PathVariable("id") Long userId,@RequestBody User updateUser) throws UserNotFoundException {
		Optional<User> user = getUser(userId);
		User oldUser = user.get();
		if(user.isPresent()) {
			oldUser.setMobileno(updateUser.getMobileno());
			oldUser.setUserName(updateUser.getUserName());
			
		}else {
			throw new UserNotFoundException("customer not found with id = " +userId);
		}
		
		return userService.updateUser(oldUser);
	}
	}
