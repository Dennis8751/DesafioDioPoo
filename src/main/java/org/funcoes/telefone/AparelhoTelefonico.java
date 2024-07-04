package org.funcoes.telefone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AparelhoTelefonico{

    private boolean redeMovelDisponivel(){
        boolean redeMovel = true;
        if (redeMovel){
            return true;
        }
        else {
            return false;
        }
    }

    public String ligar(String nome){
        List<Contato> contatos = new ArrayList<>(Arrays.asList(
                new Contato("Joao", "1235"),
                new Contato("Maria", "6789"),
                new Contato("Jose", "1122"),
                new Contato("Ana", "3344"),
                new Contato("Pedro", "5566"),
                new Contato("Paula", "7788"),
                new Contato("Carlos", "9900"),
                new Contato("Fernanda", "1010"),
                new Contato("Ricardo", "1111"),
                new Contato("Julia", "1212")
        ));
        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome));
            return "Ligando para " + contato.getNome() + " tel.: " + contato.getTelefone();
        }
        return "Contato não existe";
    }
    public void atender(){
        System.out.println("Atender telefone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciar Correio de Voz");
    }

}
