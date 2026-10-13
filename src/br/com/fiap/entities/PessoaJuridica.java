package br.com.fiap.entities;

public class PessoaJuridica {

    // VISIBILIDADE, TIPOS DE DADOS E ATRIBUTOS
    private String cnpj;
    private String razaoSocial;
    private String email;
    private String telefone;
    private Endereco endereco;


    // METODO CONSTRUTOR COM PARAMETRO VAZIO
    public PessoaJuridica() {
    }

    // METODO CONSTRUTOR COM PARAMETRO CHEIO, SEM ATRIBUTO DE REFERENCIA
    public PessoaJuridica(String cnpj, String razaoSocial, String email, String telefone) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    // METODO TOSTRING
    @Override
    public String toString() {
        return "\n\nPESSOA JURIDICA" +
                "\nCNPJ: " + cnpj +
                "\nRazão Social: " + razaoSocial +
                "\nEmail: " + email +
                "\nTelefone: " + telefone + "\n" + endereco
                ;
    }
}
