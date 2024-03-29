package com.turing.tshirtshop.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.turing.tshirtshop.entity.User;
import com.turing.tshirtshop.repository.UserRepository;
import com.turing.tshirtshop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.userRepository.findOneById(id);
	}
	
	@Override
	public User findById(Long id) {
		return this.userRepository.findOneById(id);
	}

	@Override
	public void delete(String id) {
		this.userRepository.deleteById(new Long(id));
	}

	@Override
	public Page<User> findAll(int page, int count) {
		return this.userRepository.findAll(PageRequest.of(page, count));
	}

	@Override
	public Set<User> findByIdIn(List<String> ids) {
		return this.userRepository.findByIdIn(ids);
	}

}
