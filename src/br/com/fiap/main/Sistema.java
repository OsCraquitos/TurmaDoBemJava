package br.com.fiap.main;

import br.com.fiap.entities.*;

import javax.swing.*;

public class Sistema {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instaciar objetos
        /*
         * Ordem dos objetos
         * 1 - Campanha
         * 2 - Parceiro
         * 3 - Endereco
         * 4 - Pessoa Fisica
         * 5 - Pessoa Juridica
         * 6 - Maquininha
         * 7 - Transacao
         * 8 - Impacto
         * 9 - Contribuicao
         */

        // int idCampanha, String nome, String descricao, String dataInicio, String
        // dataFim, double metaArrecadacao
        Campanha objCampanha = new Campanha(
                20,
                texto("Nome da Campanha"),
                "A melhor campanha de todas",
                "12/10/2026",
                "01/11/2026",
                2223.11);

        // String nome, String cnpj, String tipoParceria, String dataInicioParceria,
        // double percentualRepasse
        Parceiro objParceiro = new Parceiro(
                "Jonatas",
                "06.145.580/0001-91",
                "Parceirasso",
                "12/10/2026",
                23.5);

        // String logradouro, int numero, String complemento, String cep, String bairro,
        // String cidade, String estado
        Endereco objEndereco = new Endereco(
                "Logradouro do Jonatas",
                65,
                "Casa",
                "12121-232",
                "Jardim Dom José",
                "São Paulo",
                "São Paulo");
        // Setar objeto referencia de Parceiro (Endereco)
        objParceiro.setEndereco(objEndereco);

        // String nome, String cpf, String dataNascimento, String email, String telefone
        PessoaFisica objPessoaFisica = new PessoaFisica(
                "Jonatas Pessoa Fisica",
                "3213213231",
                "07/04/2007",
                "jonatas@gmail.com",
                "(11) 32321-2356");
        // Setar objeto referencia de PessoaFisica (Endereco)
        objPessoaFisica.setEndereco(objEndereco);

        // String cnpj, String razaoSocial, String email, String telefone
        PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                "47.940.087/0001-40",
                "Vendas",
                "jonatas2@gmail.com",
                "(11) 431245-3213");
        // Setar objeto referencia de PessoaJuridica (Endereco)
        objPessoaJuridica.setEndereco(objEndereco);

        // String numeroSerie, String status
        Maquininha objMaquininha = new Maquininha(
                "3213-11",
                "Ativo");
        objMaquininha.setParceiro(objParceiro);

        // double valor, String dataHora
        Transacao objTransacao = new Transacao(
                2323.11,
                "23:10-12/10/2026");
        objTransacao.setMaquininha(objMaquininha);

        // String descricao, int quantidadeBeneficiados, String dataRegistro
        Impacto objImpacto = new Impacto(
                "O maior impacto",
                21312313,
                "12/10/2026");
        objImpacto.setCampanha(objCampanha);

        // double valor, String dataHora
        Contribuicao objContribuicao = new Contribuicao(
                2313.21,
                "12/10/2026");
        objContribuicao.setPessoaFisica(objPessoaFisica);
        objContribuicao.setPessoaJuridica(objPessoaJuridica);
        objContribuicao.setTransacao(objTransacao);

        /*
         * Ordem dos objetos
         * 1 - Campanha
         * 2 - Parceiro
         * 3 - Endereco
         * 4 - Pessoa Fisica
         * 5 - Pessoa Juridica
         * 6 - Maquininha
         * 7 - Transacao
         * 8 - Impacto
         * 9 - Contribuicao
         */

        // System.out.println(objCampanha + "" + objParceiro + "" + objPessoaFisica + ""
        // + objPessoaJuridica + "" + objMaquininha + "" + objTransacao + "" +
        // objImpacto + "" + objContribuicao);

        // System.out.println(objCampanha + "" + objImpacto + "" + objContribuicao);
        System.out.println("\n" +objImpacto + "" + objContribuicao);

    }
}
