package com.administrador.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.administrador.entities.TramiteEmergenciaEntity;
import com.administrador.models.TramiteEmergenciaModel;
import com.administrador.services.TramiteEmergenciaService;

@Controller
public class TramiteEmergenciaController {
	
	@Autowired
    TramiteEmergenciaService tramiteEmergenciaService;
	
	@RequestMapping("/")
    public String enlaceIndex(Model model) {
        return "index";
    }
	@RequestMapping("/principal")
    public String enlacePrincipal(Model model) {
        return "principal";
	}
	@RequestMapping("/cargaDocumentos")
    public String cargaDocumentos(Model model, TramiteEmergenciaModel tramiteEmergenciaModel) {
		TramiteEmergenciaEntity tramiteEmergenciaEntityNuevo = new TramiteEmergenciaEntity();
		tramiteEmergenciaEntityNuevo.setTipoDocumentoAseg(tramiteEmergenciaModel.getSelectTipoDocumento());
		tramiteEmergenciaEntityNuevo.setNumeroDocumentoAseg(tramiteEmergenciaModel.getInputNroDocumento());
		tramiteEmergenciaEntityNuevo.setApellidosNombresAseg(tramiteEmergenciaModel.getInputApellidosNombres());
		tramiteEmergenciaEntityNuevo.setCelularAseg(tramiteEmergenciaModel.getInputCelular());
		tramiteEmergenciaEntityNuevo.setCorreoAseg(tramiteEmergenciaModel.getInputCorreoElectronico());
		tramiteEmergenciaEntityNuevo.setOficinaCEVITAseg(tramiteEmergenciaModel.getSelectOficinaCevit());
		
		tramiteEmergenciaService.addTramiteEmergencia(tramiteEmergenciaEntityNuevo);
		
		return "cargaDocumentos";
	}
}
