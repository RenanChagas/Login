package br.com.distribuidas.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.distribuidas.dao.ContatoDao;
import br.com.distribuidas.model.Contato;
import br.com.distribuidas.model.User;
import br.com.distribuidas.service.ContatoService;

@Service("ContatoService")
@Transactional
public class ContatoServiceImpl implements ContatoService{

	@Autowired
	private ContatoDao dao;
	
	@Override
	public void save(Contato contato) {
		dao.save(contato);
	}

	@Override
	public void update(Contato contato) {
		Contato contatoUpdate = dao.findById(contato.getId());
		
		contatoUpdate.setNome(contato.getNome());
		contatoUpdate.setSobreNome(contato.getSobreNome());
		contatoUpdate.setEmail(contato.getEmail());
		contatoUpdate.setTelefone(contato.getTelefone());
		contatoUpdate.setFavorito(contato.isFavorito());
		
		dao.save(contatoUpdate);
		
	}

	@Override
	public Contato findById(int id) {
		return dao.findById(id);
	}

	

	@Override
	public List<Contato> findByUser(User user) {
		
		return dao.findByUser(user);
	}


}
