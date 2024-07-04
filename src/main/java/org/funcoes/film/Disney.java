package org.funcoes.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disney implements ReprodutorFilme {
    private List<Filme> filmes = new ArrayList<>(Arrays.asList(
            new Filme("Branca de Neve e os Sete Anões"),
            new Filme("Cinderela"),
            new Filme("A Bela e a Fera"),
            new Filme("O Rei Leão"),
            new Filme("Aladdin"),
            new Filme("A Pequena Sereia"),
            new Filme("Mulan"),
            new Filme("Dumbo"),
            new Filme("Peter Pan"),
            new Filme("Pinóquio")
    ));

    @Override
    public void reproduzir() {
        System.out.println("Reproduzido pela Disney+");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado pela Disney+");
    }

    @Override
    public void selecionarFilme(String nome) {
        for (Filme filme : filmes){
            if (filme.getNome().equalsIgnoreCase(nome)){
                System.out.println("Filme da Disney+ selecionado: " + filme.getNome());
                return;
            }
        }
        System.out.println("Filme da DISNEY+ não encontrado: " + nome);
    }
}
