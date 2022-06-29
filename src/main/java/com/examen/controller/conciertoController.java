package com.examen.controller;

import com.examen.entity.concierto;
import com.examen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class conciertoController {
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/concierto")
    public String index (Model model){
        List<concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo","Tabla concierto");
        model.addAttribute("concierto",listaConcierto);
        return "concierto";
    }
}
