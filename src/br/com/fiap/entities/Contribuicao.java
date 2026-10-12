package br.com.fiap.entities;

public class Contribuicao {

    // visibilidade, tipo de dados e atributo
    private double valor;
    private String dataHora;
    private PessoaFisica pessoaFisica; // atributo de referencia
    private PessoaJuridica pessoaJuridica; // atributo de referencia
    private Transacao transacao; // atributo de referencia

    // metodo construtor com parametro vazio
    public Contribuicao() {
    }

    // metodo construtor com parametro cheio, sem atributo de referencia
    public Contribuicao(double valor, String dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    // metodos setters (entrada) e metodos getters (retornar \ exibir)
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

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    @Override
    public String toString() {
        return "Contribuicao{" +
                "valor=" + valor +
                ", dataHora='" + dataHora + '\'' +
                ", pessoaFisica=" + pessoaFisica +
                ", pessoaJuridica=" + pessoaJuridica +
                ", transacao=" + transacao +
                '}';
    }
}
