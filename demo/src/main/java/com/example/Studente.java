package com.example;

public class Studente {
    private String datanascita;
    private String nome;
    private String cognome;
    
    
    public Studente(String datanascita, String nome, String cognome) {
        this.datanascita = datanascita;
        this.nome = nome;
        this.cognome = cognome;
    }


    public String getDataNascita() {
        return datanascita;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
        
    }

    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
