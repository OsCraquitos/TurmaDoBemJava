package br.com.fiap.entities;

public class Impacto {

    // visibilidade, tipo de dados e atributo
    private String descricao;
    private int quantidadeBeneficiados;
    private String dataRegistro;
    private Campanha campanha;

    // metodo construtor com parametro vazio

    public Impacto() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA

    public Impacto(String descricao, int quantidadeBeneficiados, String dataRegistro) {
        this.descricao = descricao;
        this.quantidadeBeneficiados = quantidadeBeneficiados;
        this.dataRegistro = dataRegistro;
    }

    // METODOS GETGET AND SETTERS

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeBeneficiados() {
        return quantidadeBeneficiados;
    }

    public void setQuantidadeBeneficiados(int quantidadeBeneficiados) {
        this.quantidadeBeneficiados = quantidadeBeneficiados;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    @Override
    public String toString() {
        return "Impacto{" +
                "descricao='" + descricao + '\'' +
                ", quantidadeBeneficiados=" + quantidadeBeneficiados +
                ", dataRegistro='" + dataRegistro + '\'' +
                ", campanha=" + campanha +
                '}';
    }
}
