package com.administrador.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.administrador.entities.TramiteEmergenciaEntity;

@Repository
public interface TramiteEmergenciaDao extends JpaRepository<TramiteEmergenciaEntity, Integer> {
}