package com.example.demo3.Repository;
import com.example.demo3.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfessorRepository extends JpaRepository <Professor,Integer>{
}
