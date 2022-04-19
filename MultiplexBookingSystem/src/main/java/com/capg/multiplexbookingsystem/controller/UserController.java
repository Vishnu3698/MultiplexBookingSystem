package com.capg.multiplexbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.multiplexbookingsystem.dao.UserRepository;
import com.capg.multiplexbookingsystem.exception.UserException;
import com.capg.multiplexbookingsystem.model.User;
import com.capg.multiplexbookingsystem.service.UserService;



@CrossOrigin(origins = "*")
@RequestMapping("/api/v5")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateEmployee(@PathVariable(value = "id") Long userId,
			@RequestBody User userDetails) throws UserException {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new UserException("User not found for this id :: " + userId));

		user.setName(userDetails.getName());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		user.setMobileNo(userDetails.getMobileNo());
		user.setUserType(userDetails.getUserType());
		
		final User updatedUser = userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<String> delUsers(@PathVariable("userId") Long userId) {
		System.out.println("Acc ID:"+userId);
		try {
			userService.delAccount(userId);
		} catch (Exception ex) {
			throw new UserException(ex.getMessage());
		}
		return new ResponseEntity<String>("user Deleted.", HttpStatus.OK);
	}


	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
		List<User> userList = userService.showUsers();
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}

	
	@GetMapping("/users/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable("userId") Long userId) {
		Optional<User> user = userService.showUserById(userId);
	return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}

}
