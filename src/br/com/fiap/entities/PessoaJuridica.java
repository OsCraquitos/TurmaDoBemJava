package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa{

    // VISIBILIDADE, TIPOS DE DADOS E ATRIBUTOS
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;


    // METODO CONSTRUTOR COM PARAMETRO VAZIO
    public PessoaJuridica() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA
    public PessoaJuridica(String nome, String email, String telefone, String dataNascimento, String cnpj, String razaoSocial, String nomeFantasia) {
        super(nome, email, telefone, dataNascimento);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    // METODOS GETTERS E SETTERS
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "\n\nPESSOA JURIDICA" +
                "\ncnpj=" + cnpj +
                "\nrazaoSocial=" + razaoSocial +
                "\nnomeFantasia=" + nomeFantasia +
                "\nnome=" + nome +
                "\nemail=" + email +
                "\ntelefone=" + telefone +
                "\ndataNascimento=" + dataNascimento +
                "\nendereco: \n" + endereco
                ;
    }
}
