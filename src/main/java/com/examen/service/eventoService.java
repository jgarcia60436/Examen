package com.examen.service;

import com.examen.entity.concierto;
import com.examen.entity.evento;
import com.examen.repository.eventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventoService implements IEventoService {

    @Autowired
    private eventoRepository eventoRepository;

    @Override
    public List<evento> getAllEvento() {
        return (List<evento>) eventoRepository.findAll();
    }

    @Override
    public evento getEventoById(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }

}
