package br.com.fiap.main;
import br.com.fiap.entities.*;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instaciar objetos
        /* Ordem dos objetos
         * 1 - Campanha
         * 2 - Parceiro
         * 3 - Endereco
         *
         *
         * */

        // int idCampanha, String nome, String descricao, String dataInicio, String dataFim, double metaArrecadacao
        Campanha objCampanha = new Campanha();
    }
}
