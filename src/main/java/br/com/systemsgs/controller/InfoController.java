package br.com.systemsgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.service.InfoService;

@RestController
@RequestMapping(value = "/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping(value = "/{estado}")
	public void pegaInfoEstado(String estado) {
		infoService.getInfoPorEstado(estado);
	}

}
