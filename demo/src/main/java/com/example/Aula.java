package com.example;

import java.util.ArrayList;

public class Aula {

    private ArrayList<Studente> alunni = new ArrayList();
    private String sezione;
    private String numero;
    private String aula;


    public Aula(String sezione, String numero, String aula, ArrayList<Studente> lista) {
        this.sezione = sezione;
        this.numero = numero;
        this.aula = aula;
        this.alunni = lista;
    }

    public int getNumAlunni() {
        return alunni.size();
    }

    public String getSezione() {
        return sezione;
    }

    public String getNumero() {
        return numero;
    }

    public String getAula() {
        return aula;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
