package com.administrador.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaCabecera")
public class TramiteEmergenciaEntity {
    @Column(name = "ID_TramiteEmergencia")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "TipoDocumentoAseg", length = 10)
    private String TipoDocumentoAseg;
  
    @Column(name = "NumeroDocumentoAseg", length = 20)
    private String NumeroDocumentoAseg;
    
    @Column(name = "ApellidosNombresAseg", length = 80)
    private String ApellidosNombresAseg;
    
    @Column(name = "CelularAseg", length = 12)
    private String CelularAseg;
    
    @Column(name = "CorreoAseg", length = 30)
    private String CorreoAseg;
    
    @Column(name = "OficinaCEVITAseg", length = 50)
    private String OficinaCEVITAseg;
  
    protected TramiteEmergenciaEntity() {
    }
    //constructor, setters and getters omitted for brevity
}