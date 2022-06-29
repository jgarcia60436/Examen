package com.examen.repository;

import com.examen.entity.concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface conciertoRepository extends CrudRepository<concierto,Long> {
    
}
