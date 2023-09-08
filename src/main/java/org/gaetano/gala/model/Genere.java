package org.gaetano.gala.model;

public abstract class Genere {

    private String tipo;

    public Genere(){}

    public Genere(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void printGenere();
}
