package com.cibertec.DAWI_T2_FRANCO_LUIS.controller;

import com.cibertec.DAWI_T2_FRANCO_LUIS.model.Docente;
import com.cibertec.DAWI_T2_FRANCO_LUIS.service.IDocenteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
@RequiredArgsConstructor
public class DocenteController {

    private final IDocenteService docenteService;

    @PostMapping
    public ResponseEntity<Docente> create(
            @RequestBody @Valid Docente docente) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(docenteService.create(docente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> update(
            @PathVariable Long id,
            @RequestBody @Valid Docente docente) {

        return ResponseEntity.ok(
                docenteService.update(id, docente)
        );
    }

    @GetMapping
    public ResponseEntity<List<Docente>> findAll(){

        return ResponseEntity.ok(
                docenteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> findById(
            @PathVariable Long id){

        return ResponseEntity.ok(
                docenteService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id){

        docenteService.delete(id);

        return ResponseEntity.noContent().build();
    }
}