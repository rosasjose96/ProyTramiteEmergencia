package com.administrador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.administrador.entities.TramiteEmergenciaEntity;

@Controller
public class TramiteEmergenciaController {
	@RequestMapping("/")
    public String enlaceIndex(Model model) {
        return "index";
    }
	@RequestMapping("/principal")
    public String enlacePrincipal(Model model) {
        return "principal";
	}
	@RequestMapping("/cargaDocumentos")
    public String cargaDocumentos(Model model, TramiteEmergenciaEntity tramiteEmergenciaEntity) {
		return "cargaDocumentos";
	}
}
