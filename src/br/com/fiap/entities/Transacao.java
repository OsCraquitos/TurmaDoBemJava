package br.com.fiap.entities;

public class Transacao {

    // VISIBILIDADE, TIPOS DE DADOS E ATRIBUTO
    private double valor;
    private String dataHora;
    private Maquininha maquininha;

    // METODO CONSTRUTOR COM PARAMETRO VAZIO
    public Transacao() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA
    public Transacao(double valor, String dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Maquininha getMaquininha() {
        return maquininha;
    }

    public void setMaquininha(Maquininha maquininha) {
        this.maquininha = maquininha;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "\n\nTRANSACAO" +
                "\nValor: " + valor +
                "\nData e Hora: " + dataHora + maquininha;
    }
}
