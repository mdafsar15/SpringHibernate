package com.ntech.dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ntech.dto.AlienSaveForm;

public interface AlienDao {
	
	public void saveAlien(AlienSaveForm as);
	public AlienSaveForm checkLogin(String email, String pwd);
		
}
