package org.funcoes.music;

import org.funcoes.music.Musica;
import org.funcoes.music.ReprodutorMusical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spotify implements ReprodutorMusical {
    List<Musica> musicas = new ArrayList<>(Arrays.asList(
            new Musica("Led Zeppelin", "Kashmir"),
            new Musica("Queen", "Don't Stop Me Now"),
            new Musica("Pearl Jam", "Jeremy"),
            new Musica("Van Halen", "Panama"),
            new Musica("Iron Maiden", "Run to the Hills"),
            new Musica("Metallica", "Enter Sandman"),
            new Musica("Motorhead", "Overkill"),
            new Musica("Whitney Houston", "How Will I Know"),
            new Musica("Justin Timberlake", "Mirrors"),
            new Musica("Rihanna", "We Found Love"),
            new Musica("Dua Lipa", "Levitating"),
            new Musica("Ariana Grande", "7 rings"),
            new Musica("Billie Eilish", "everything i wanted"),
            new Musica("Imagine Dragons", "Believer"),
            new Musica("Arctic Monkeys", "R U Mine?"),
            new Musica("Metallica", "Seek & Destroy"),
            new Musica("Iron Maiden", "Hallowed Be Thy Name"),
            new Musica("Led Zeppelin", "Black Dog"),
            new Musica("AC/DC", "Back in Black"),
            new Musica("AC/DC", "You Shook Me All Night Long")
    ));

    @Override
    public void tocar() {
        System.out.println("Música reproduzida por Spotify");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada por Spotify");
    }

    @Override
    public void selecionarMusica(String musica) {
        for (Musica nomeMusica : musicas){
            if (nomeMusica.getNomeMusica().equalsIgnoreCase(musica)){
                System.out.println("Musica em Spotify selecionada: " + nomeMusica.getNomeMusica());
            }
        }
        System.out.println("Música em Spotify não encontrada: " + musica);

    }
}
