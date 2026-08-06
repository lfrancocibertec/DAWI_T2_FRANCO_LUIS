package com.cibertec.DAWI_T2_FRANCO_LUIS.service;

import com.cibertec.DAWI_T2_FRANCO_LUIS.model.Docente;

import java.util.List;

public interface IDocenteService {

    Docente create(Docente docente);

    Docente update(Long id, Docente docente);

    List<Docente> findAll();

    Docente findById(Long id);

    void delete(Long id);
}