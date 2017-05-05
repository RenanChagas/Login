package br.com.distribuidas.service;

import java.util.List;

import br.com.distribuidas.model.Contato;
import br.com.distribuidas.model.User;

public interface ContatoService {

	public void save(Contato contato);
	
	public void update(Contato contato);
	
	public Contato findById(int id);
	
	public List<Contato> findByUser(User user);
	
}
