package com.praveen.leavemanagement.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praveen.leavemanagement.domains.Leave;
import com.praveen.leavemanagement.repository.LeaveRepository;
import com.praveen.leavemanagement.services.LeaveService;

@Service
@Transactional
public class LeaveServiceImpl implements LeaveService {
	
	@Autowired
	private LeaveRepository repository;
	
	public LeaveServiceImpl() {
	}

	@Override
	public List<Leave> findAll() {
		return repository.findAll();
	}

	@Override
	public Leave findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Leave save(Leave t) {
		return repository.save(t);
	}

	@Override
	public void delete(Leave t) {
		repository.delete(t);
	}

	@Override
	public void deletedById(Long id) {
		repository.deleteById(id);
	}
	
}
