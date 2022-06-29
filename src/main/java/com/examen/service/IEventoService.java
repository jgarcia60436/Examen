package com.examen.service;

import com.examen.entity.evento;
import java.util.List;

public interface IEventoService {
    public List<evento> getAllEvento();
    public evento getEventoById (long id);
    public void saveEvento(evento evento);
    public void delete (long id);
}
