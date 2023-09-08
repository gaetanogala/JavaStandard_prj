package org.gaetano.gala.model;

public class Studente extends Persona{

    private String matricola;
    private String facolta;
    private String universita;

    public Studente(String matricola, String facolta, String universita){

        super.setNome("");
        super.setCognome("");
        super.setEta(18);
        super.setCodiceFiscale("");

        this.matricola = matricola;
        this.facolta = facolta;
        this.universita = universita;
    }


    public Studente(String nome, String cognome, Integer eta, String codiceFiscale, String matricola, String facolta, String universita){

        super.setNome(nome);
        super.setCognome(cognome);
        super.setEta(eta);
        super.setCodiceFiscale(codiceFiscale);

        this.matricola = matricola;
        this.facolta = facolta;
        this.universita = universita;
    }


    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getFacolta() {
        return facolta;
    }

    public void setFacolta(String facolta) {
        this.facolta = facolta;
    }

    public String getUniversita() {
        return universita;
    }

    public void setUniversita(String universita) {
        this.universita = universita;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola='" + matricola + '\'' +
                ", facolta='" + facolta + '\'' +
                ", universita='" + universita + '\'' +
                '}';
    }
}
