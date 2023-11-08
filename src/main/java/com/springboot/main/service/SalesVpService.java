package com.springboot.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.exception.InvalidIdException;
import com.springboot.main.model.Company;
import com.springboot.main.model.SalesVp;
import com.springboot.main.repository.CompanyRepository;
import com.springboot.main.repository.SalesVpRepository;

@Service
public class SalesVpService {
	
	@Autowired
	SalesVpRepository salesVpRepository;
	 
	 public SalesVp insert(SalesVp salesVp) {
			return salesVpRepository.save(salesVp);
		}
		public SalesVp saveSalesVp(SalesVp salesVp) {
			return salesVpRepository.save(salesVp);
		}
		
		public SalesVp getSalesVpById(int sid) throws InvalidIdException {
			Optional<SalesVp> optional=salesVpRepository.findById(sid);
			if(!optional.isPresent())
				throw new InvalidIdException("salesvpid Invalid");
			return optional.get();
		}
}
