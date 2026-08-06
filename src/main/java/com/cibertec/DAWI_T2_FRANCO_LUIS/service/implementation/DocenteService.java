package com.cibertec.DAWI_T2_FRANCO_LUIS.service.implementation;

import com.cibertec.DAWI_T2_FRANCO_LUIS.entity.DocenteEntity;
import com.cibertec.DAWI_T2_FRANCO_LUIS.model.Docente;
import com.cibertec.DAWI_T2_FRANCO_LUIS.repository.IDocenteRepository;
import com.cibertec.DAWI_T2_FRANCO_LUIS.service.IDocenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocenteService implements IDocenteService {

    private final IDocenteRepository repository;
    private final ObjectMapper objectMapper;

    @Override
    public Docente create(Docente docente) {

        DocenteEntity entity =
                objectMapper.convertValue(docente, DocenteEntity.class);

        entity.setId(null);

        return objectMapper.convertValue(
                repository.save(entity),
                Docente.class
        );
    }

    @Override
    public Docente update(Long id, Docente docente) {

        DocenteEntity entity = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Docente no encontrado"));

        entity.setNombres(docente.getNombres());
        entity.setApellidos(docente.getApellidos());
        entity.setCorreo(docente.getCorreo());
        entity.setTelefono(docente.getTelefono());
        entity.setEspecialidad(docente.getEspecialidad());
        entity.setFechaIngreso(docente.getFechaIngreso());

        return objectMapper.convertValue(
                repository.save(entity),
                Docente.class
        );
    }

    @Override
    public List<Docente> findAll() {

        return objectMapper.convertValue(
                repository.findAll(),
                new TypeReference<List<Docente>>() {}
        );
    }

    @Override
    public Docente findById(Long id) {

        return objectMapper.convertValue(
                repository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException("Docente no encontrado")),
                Docente.class
        );
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);

    }

}