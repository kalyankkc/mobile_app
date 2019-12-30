package com.example.mobileapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobileapp.entity.Mobile;
import com.example.mobileapp.repository.MobileAppRepository;
import com.example.mobileapp.service.MobileService;
@Service
public class MobileServiceImpl implements MobileService{
	@Autowired
	MobileAppRepository mobileapprepo;

	@Override
	public List<Mobile> getAllMobiles() {
		
		return mobileapprepo.findAll();
	}

	
}
