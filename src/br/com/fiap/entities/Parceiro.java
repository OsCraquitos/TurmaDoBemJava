package br.com.fiap.entities;

public class Parceiro {

    // VISIBLIDADE, TIPOS DE DADOS, ATRIBUTOS
    private String nome;
    private String cnpj;
    private String tipoParceria;
    private String dataInicioParceria;
    private double percentualRepasse;
    private Endereco endereco;


    // METODO CONSTRUTOR COM PARAMETRO VAZIO
    public Parceiro() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA
    public Parceiro(String nome, String cnpj, String tipoParceria, String dataInicioParceria, double percentualRepasse) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoParceria = tipoParceria;
        this.dataInicioParceria = dataInicioParceria;
        this.percentualRepasse = percentualRepasse;
    }

    // METODOS GETTER E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoParceria() {
        return tipoParceria;
    }

    public void setTipoParceria(String tipoParceria) {
        this.tipoParceria = tipoParceria;
    }

    public String getDataInicioParceria() {
        return dataInicioParceria;
    }

    public void setDataInicioParceria(String dataInicioParceria) {
        this.dataInicioParceria = dataInicioParceria;
    }

    public double getPercentualRepasse() {
        return percentualRepasse;
    }

    public void setPercentualRepasse(double percentualRepasse) {
        this.percentualRepasse = percentualRepasse;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // METODO ToString
    @Override
    public String toString() {
        return "\n\nPARCEIRO\n" +
                "\nNome: " + nome +
                "\nCNPJ: " + cnpj +
                "\nTipo da Parceria: " + tipoParceria +
                "\nData de Inicio da Parceria: " + dataInicioParceria +
                "\nPercentual de Repasse: " + percentualRepasse + "\n" + endereco;
    }
}
