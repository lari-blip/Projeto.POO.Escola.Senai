package com.projeto.poo.projeto;

public enum Turno {
    MANHA("Ensino Médio"),
    TARDE("Ensino Fundamental"),
    NOITE("Supletivo");

    private final String grauDeEnsino;

    Turno(String grauDeEnsino) {
        this.grauDeEnsino = grauDeEnsino;
    }

    public String getGrauDeEnsino() {
        return grauDeEnsino;
    }
}