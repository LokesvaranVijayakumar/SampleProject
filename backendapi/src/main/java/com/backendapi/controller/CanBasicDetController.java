package com.backendapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendapi.entity.CanBasicDet;
import com.backendapi.service.CanBasicDetService;

@RestController
public class CanBasicDetController {

	private CanBasicDetService canBasicDetService;
	
	public void addUser(@RequestBody CanBasicDet canBasicDet){

//		if(canBasicDetService)

		System.out.println("Sample demo");
		// new line added by main but not in local
	}
}
