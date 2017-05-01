package br.com.distribuidas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.distribuidas.dao.UserProfileDao;
import br.com.distribuidas.model.UserProfile;
import br.com.distribuidas.service.UserProfileService;

@Service("UserProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao dao;
	
	public List<UserProfile> findAll() {
		return dao.findAll();
	}

	public UserProfile findByType(String type){
		return dao.findByType(type);
	}

	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public List<UserProfile> findAllByOrderByIdAsc() {
		return dao.findAllByOrderByIdAsc();
	}

}
