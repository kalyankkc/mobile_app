package com.example.mobileapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobileapp.entity.Mobile;
import com.example.mobileapp.service.MobileService;

@RestController
public class MobileAppController {
	
	@Autowired
	MobileService ser;
	
	@GetMapping(name="/getAllMobiles")
	public List<Mobile> getAllMobiles()
	{
	    return 	ser.getAllMobiles();
	}

}
