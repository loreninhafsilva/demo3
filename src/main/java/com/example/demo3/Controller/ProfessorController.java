package com.example.demo3.Controller;

import com.example.demo3.Model.Professor;
import com.example.demo3.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository alrep;

    @GetMapping("/todos")
    public List<Professor> buscarTodosOsProfessores() {
        return alrep.findAll();
    }

    @GetMapping("/todos/cod/{cod}")
    public Optional<Professor> buscarporCOD(@PathVariable("cod") int cod) {
        return alrep.findById(cod);
    }
}