package com.cg.movieticketbookinhsystem.service;

import java.util.List;
import java.util.Optional;

import com.cg.movieticketbookinhsystem.entity.User;



public interface IUserService {

	public User insertUser(User newUser) ;

	public List<User> getAllUsers();

	public Optional<User> getUser(Long uid);

	public User updateUser(User oldUser);

	public void deleteUser(Long userId);

	

}
