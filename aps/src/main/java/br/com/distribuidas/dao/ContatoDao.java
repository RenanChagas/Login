package br.com.distribuidas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.distribuidas.model.Contato;
import br.com.distribuidas.model.User;

@Repository("ContatoDao")
public interface ContatoDao extends JpaRepository<Contato, Long> {
	
	public Contato findById(int id);
	
	public List<Contato> findByUser(User user);
	
}
