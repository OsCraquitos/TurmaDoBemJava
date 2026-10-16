package br.com.fiap.main;

import br.com.fiap.entities.*;

import javax.swing.*;

public class TesteSistema {

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
                        "Campanha do Jonatas",
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

                // String nome, String email, String telefone, String dataNascimento, String cpf
                PessoaFisica objPessoaFisica = new PessoaFisica(
                        "Jonatas Pessoa Fisica",
                        "jonatasfisica@gmail.com",
                        "(11) 32131-4314",
                        "jonatas@gmail.com",
                        "543.213.543-54");
                // Setar objeto referencia de PessoaFisica (Endereco)
                objPessoaFisica.setEndereco(objEndereco);

                // String nome, String email, String telefone, String dataNascimento, String cnpj, String razaoSocial, String nomeFantasia
                PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                        "Jonatas Juridico",
                        "jonatasjuridico@gmail.com",
                        "(11) 32132-1245",
                        "07/04/2007",
                        "47.940.087/0001-40",
                        "Vendas",
                        "Jontas Corporation");
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
                System.out.println(objImpacto + "" + objContribuicao);

        }
}
