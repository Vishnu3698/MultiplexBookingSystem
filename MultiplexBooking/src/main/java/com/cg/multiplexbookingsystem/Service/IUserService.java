package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import com.cg.multiplexbookingsystem.entity.User;

public interface IUserService {

	public User insertUser(User newUser) ;

	public List<User> getAllUsers();

	public Optional<User> getUser(Long uid);

	public User updateUser(User oldUser);

	public void deleteUser(Long userId);

	

}
