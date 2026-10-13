package br.com.fiap.entities;

public class Campanha {

    // visibilidade, tipos de dados e atributo
    private int idCampanha;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private double metaArrecadacao;

    // metodo construtor com parametro vazio

    public Campanha() {

        // metodo construtor com parametro cheio
    }

    public Campanha(int idCampanha, String nome, String descricao, String dataInicio, String dataFim,
            double metaArrecadacao) {
        this.idCampanha = idCampanha;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.metaArrecadacao = metaArrecadacao;
    }

    // metodos getter e setter
    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getMetaArrecadacao() {
        return metaArrecadacao;
    }

    public void setMetaArrecadacao(double metaArrecadacao) {
        this.metaArrecadacao = metaArrecadacao;
    }

    // metodo tostring

    @Override
    public String toString() {
        return "\n\nCAMPANHA:" +
                "\nID da Campanha: " + idCampanha +
                "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nData de inicio: " + dataInicio +
                "\nData de fim: " + dataFim +
                "\nMeta de Arrecadação: " + metaArrecadacao;
    }
}
