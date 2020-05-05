package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.swagger.model.User;
@Service
public interface userService {
    public User addUser(User user);
    public User deleteUserById(long id);
	public List<User> findAllUsers();
	public User updateUser(User user);
	@Cacheable ("users")
	public User findUserById(long id);
}
