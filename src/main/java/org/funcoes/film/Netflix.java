package org.funcoes.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Netflix implements ReprodutorFilme {
    private List<Filme> filmes = new ArrayList<>(Arrays.asList(
            new Filme("Bird Box"),
            new Filme("O Hospedeiro"),
            new Filme("Para Todos os Garotos que Já Amei"),
            new Filme("O Irlandês"),
            new Filme("Enola Holmes"),
            new Filme("Roma"),
            new Filme("História de um Casamento"),
            new Filme("O Poço"),
            new Filme("Okja"),
            new Filme("Os 7 de Chicago")
    ));
    @Override
    public void reproduzir() {
        System.out.println("Reproduzido pela Netflix");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado pela Netflix");
    }

    @Override
    public void selecionarFilme(String nome) {
        for (Filme filme : filmes){
            if (filme.getNome().equalsIgnoreCase(nome)){
                System.out.println("Filme na NETFLIX selecionado: " + filme.getNome());
                return;
            }
        }
        System.out.println("Filme na NETFLIX não encontrado: " + nome);
    }
}
