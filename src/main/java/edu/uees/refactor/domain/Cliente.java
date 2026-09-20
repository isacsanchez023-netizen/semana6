package edu.uees.refactor.domain;

public record Cliente(String nombre) {
    public Cliente {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
    }
}