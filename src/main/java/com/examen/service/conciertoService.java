package com.examen.service;

import com.examen.entity.concierto;
import com.examen.repository.conciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class conciertoService implements IConciertoService {

    @Autowired
    private conciertoRepository conciertoRepository;

    @Override
    public List<concierto> getAllConcierto() {
        return (List<concierto>) conciertoRepository.findAll();
    }

    @Override
    public concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }

}
