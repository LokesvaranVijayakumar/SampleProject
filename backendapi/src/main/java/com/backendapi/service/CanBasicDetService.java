package com.backendapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapi.entity.CanUserDet;
import com.backendapi.repository.CanBasicDetRepository;

@Service
public class CanBasicDetService {

	@Autowired
	private CanBasicDetRepository canBasicDetRepo;
	
	public void addCandidate(CanUserDet canUserDet) {
		canBasicDetRepo.save(canUserDet);
	}
}
