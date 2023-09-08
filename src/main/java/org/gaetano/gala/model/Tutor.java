package org.gaetano.gala.model;

public class Tutor extends Persona{

    public static final String BASIC_ID = "123456";

    private String idTutor;
    private String corso;
    private String sede;

    public Tutor(String idTutor, String corso, String sede){

        super.setNome("");
        super.setCognome("");
        super.setEta(18);
        super.setCodiceFiscale("");

        this.idTutor = BASIC_ID + idTutor;
        this.corso = corso;
        this.sede = sede;
    }

    public Tutor(String nome, String cognome, Integer eta, String codiceFiscale, String idTutor, String corso, String sede) {

        super.setNome(nome);
        super.setCognome(cognome);
        super.setEta(eta);
        super.setCodiceFiscale(codiceFiscale);


        this.idTutor = BASIC_ID + idTutor;
        this.corso = corso;
        this.sede = sede;
    }

    public String getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(String idTutor) {
        this.idTutor = idTutor;
    }

    public String getCorso() {
        return corso;
    }

    public void setCorso(String corso) {
        this.corso = corso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "idTutor='" + idTutor + '\'' +
                ", corso='" + corso + '\'' +
                ", sede='" + sede + '\'' +
                '}';
    }
}
