package com.example.demo3.Controller;

import com.example.demo3.Model.Aluno;
import com.example.demo3.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alrep;

    @GetMapping("/todos")
    public List<Aluno> buscarTodosOsAlunos()
    {
        return alrep.findAll();
    }

}
