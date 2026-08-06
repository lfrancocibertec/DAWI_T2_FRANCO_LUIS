package com.cibertec.DAWI_T2_FRANCO_LUIS.repository;

import com.cibertec.DAWI_T2_FRANCO_LUIS.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepository
        extends JpaRepository<DocenteEntity, Long> {
}