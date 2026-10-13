package br.com.fiap.entities;

public class Maquininha {

    // VISIBLIDADE, TIPOS DE DADOS E ATRIBUTO
    private String numeroSerie;
    private String status;
    private Parceiro Parceiro;

    // METODO CONSTRUTOR COM PARAMETRO VAZIO

    public Maquininha() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA

    public Maquininha(String numeroSerie, String status) {
        this.numeroSerie = numeroSerie;
        this.status = status;
    }

    // METODOS GETTER E SETTERS

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Parceiro getParceiro() {
        return Parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        Parceiro = parceiro;
    }

    // METODO TO STRING

    @Override
    public String toString() {
        return "\n\nMAQUININHA" +
                "\nNumero Serie='" + numeroSerie  +
                "\nStatus='" + status  +
                "\nParceiro=" + Parceiro ;
    }
}
