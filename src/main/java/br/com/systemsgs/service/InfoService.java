package br.com.systemsgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.systemsgs.model.ModelInfoFornecedor;
import br.com.systemsgs.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public ModelInfoFornecedor getInfoPorEstado(String estado) {
		
		return infoRepository.findByEstado(estado);
		
	}
	
	

}
