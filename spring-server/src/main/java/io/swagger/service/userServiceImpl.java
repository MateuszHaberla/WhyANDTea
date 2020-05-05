package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;

@Service
@Transactional
public class userServiceImpl implements userService {
	@Autowired
	private userRepository UserRepository;

	@Override
	public User addUser(User user) {
		return UserRepository.save(user);
	}	

	@Override
	public User deleteUserById(long id) {
		Optional<User> os = UserRepository.findById(id);
		if(os.isPresent()) UserRepository.deleteById(id);
		return os.get();
	}

	@Override
	public List<User> findAllUsers() {
		return UserRepository.findAll();
	}

	@Override
	public User findUserById(long id) {
		Optional<User> os = UserRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public User updateUser(User user) {
		UserRepository.updateUserById(user.getId(),user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getPhone(), user.getAvatarUrl(), user.getPatientcard());
		return user;
//// if you want to check rollNo first:
//		Optional<Users> os = UsersRepository.findById(Users.getRollNo());
//		if(os.isPresent())
//		{ os.get().setName(Users.getName());
//		  os.get().setSurname(Users.getSurname());
//		  UsersRepository.save(os.get());
//		  return os.get();}
//		else return null;
		
	}
}
