package br.com.distribuidas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.distribuidas.model.UserProfile;

@Repository("UserProfileDao")
public interface UserProfileDao extends JpaRepository<UserProfile, Long>{

	
	public List<UserProfile> findAll();
	
	public List<UserProfile> findAllByOrderByIdAsc();
	
	public UserProfile findById(int id);
	
	public UserProfile findByType(String type);
	
}