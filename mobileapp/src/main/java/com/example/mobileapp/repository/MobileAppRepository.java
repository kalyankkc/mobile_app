package com.example.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobileapp.entity.Mobile;

@Repository
public interface MobileAppRepository extends JpaRepository<Mobile, Integer>{

}
