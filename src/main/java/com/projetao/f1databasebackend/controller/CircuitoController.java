package com.projetao.f1databasebackend.controller;

import com.projetao.f1databasebackend.exception.CircuitoNotFoundException;
import com.projetao.f1databasebackend.model.Circuito;
import com.projetao.f1databasebackend.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CircuitoController {

    @Autowired
    private CircuitoRepository circuitoRepository;

    @PostMapping("/circuito")
    Circuito newCircuito(@RequestBody Circuito newCircuito) {return circuitoRepository.save(newCircuito);}

    @GetMapping("/circuitos")
    List<Circuito> getAllCircuitos() { return circuitoRepository.findAll();};

    @GetMapping("/circuito{id}")
    Circuito getCircuitoById(@PathVariable Long id){
        return circuitoRepository.findById(id)
                .orElseThrow(()-> new CircuitoNotFoundException(id));
    }

    @PutMapping("/circuito/{id}")
    Circuito updateCircuito(@RequestBody Circuito newCircuito, @PathVariable Long id){
        return circuitoRepository.findById(id)
                .map(circuito -> {
                    circuito.setNome(newCircuito.getNome());
                    circuito.setData(newCircuito.getData());
                    circuito.setVencedor(newCircuito.getVencedor());
                    return circuitoRepository.save(circuito);
                }).orElseThrow(()->new CircuitoNotFoundException(id));
    }

    @DeleteMapping("/circuito/{id}")
    String deleteCircuito(@PathVariable Long id){
        if(!circuitoRepository.existsById(id)){
            throw new CircuitoNotFoundException(id);
        }
        circuitoRepository.deleteById(id);
        return "Circuito com o  id " +id+ " foi deletado com sucesso!";
    }
}
