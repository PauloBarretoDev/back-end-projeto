package com.projetao.f1databasebackend.controller;
import com.projetao.f1databasebackend.exception.EquipeNotFoundException;
import com.projetao.f1databasebackend.model.Equipe;
import com.projetao.f1databasebackend.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EquipeController {

    @Autowired
    private EquipeRepository equipeRepository;

    @PostMapping("/equipe")
    Equipe newEquipe(@RequestBody Equipe newEquipe){
        return equipeRepository.save(newEquipe);
    }

    @GetMapping("/equipe/{id}")
    List<Equipe> getAllPilotos(){
        return equipeRepository.findAll();
    }

    @GetMapping("/equipe/{id}")
    Equipe getEquipeById(@PathVariable Long id){
        return equipeRepository.findById(id)
                .orElseThrow(()->new EquipeNotFoundException(id));
    }

    @PutMapping("/equipe/{id}")
    Equipe updateEquipe(@RequestBody Equipe newEquipe, @PathVariable Long id){
        return equipeRepository.findById(id)
            .map(equipe -> {
                equipe.setNome(newEquipe.getNome());
                equipe.setLider(newEquipe.getLider());
                equipe.setFoto(newEquipe.getFoto());
                equipe.setPiloto(newEquipe.getPiloto());
                return equipeRepository.save(equipe);
            }).orElseThrow(() -> new EquipeNotFoundException(id));
    }

    @DeleteMapping("/piloto/{id}")
    String deleteEquipe(@PathVariable Long id){
        if(!equipeRepository.existsById(id)){
            throw new EquipeNotFoundException(id);
        }
        equipeRepository.deleteById(id);
        return "Equipe com o  id " +id+ " foi deletado com sucesso!";
    }


}
