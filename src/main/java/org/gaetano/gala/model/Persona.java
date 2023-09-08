package org.gaetano.gala.model;

public class Persona extends Genere implements Printable{
    private String nome;
    private String cognome;
    private Integer eta;
    private String codiceFiscale;

    public Persona(){
        super();
    }

    @Override
    public void printGenere() {
        System.out.println(super.getTipo());
    }

    public Persona(String nome, String cognome, Integer eta, String codiceFiscale){

        super("genere umano");
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
