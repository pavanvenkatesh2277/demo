package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Hr;
import com.springboot.main.repository.HrRepository;

@Service
public class HrService {

	@Autowired
	HrRepository hrRepository;
	
	public Hr insert(Hr hr) {
		return hrRepository.save(hr);
	}
	public Hr saveHr(Hr hr) {
		return hrRepository.save(hr);
	}
}
