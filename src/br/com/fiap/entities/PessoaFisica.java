package br.com.fiap.entities;

public class PessoaFisica extends Pessoa {

    // VISIBILIDADE, TIPOS DE DADOS E ATRIBUTOS
    private String cpf;

    // METODO CONSTRUTOR COM PARAMETRO VAZIO
    public PessoaFisica() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA
    public PessoaFisica(String nome, String email, String telefone, String dataNascimento, String cpf) {
        super(nome, email, telefone, dataNascimento);
        this.cpf = cpf;
    }

    // METODOS GETTERS E SETTERS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // METODO ToString
    @Override
    public String toString() {
        return "\n\nPESSOA FISICA" +
                "\nCPF: " + cpf +
                "\nNome='" + nome +
                "\nEmail='" + email +
                "\nTelefone='" + telefone +
                "\nData de nascimento='" + dataNascimento +
                "\nEndereco: \n" + endereco
                ;
    }
}
