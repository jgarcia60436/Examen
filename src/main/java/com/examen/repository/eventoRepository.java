package com.examen.repository;

import com.examen.entity.evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventoRepository extends CrudRepository<evento,Long>{
    
}
