package com.examen.service;

import com.examen.entity.concierto;
import java.util.List;


public interface IConciertoService {
    public List<concierto> getAllConcierto();
    public concierto getConciertoById (long id);
    public void saveConcierto(concierto concierto);
    public void delete (long id);
}
