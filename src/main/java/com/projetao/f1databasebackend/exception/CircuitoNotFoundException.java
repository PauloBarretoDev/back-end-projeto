package com.projetao.f1databasebackend.exception;

public class CircuitoNotFoundException extends RuntimeException {

    public CircuitoNotFoundException(Long id) {super("Não foi possível encontrar o circuito com o id: " + id);};
}
