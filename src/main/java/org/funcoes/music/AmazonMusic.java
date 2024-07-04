package org.funcoes.music;

import org.funcoes.music.Musica;
import org.funcoes.music.ReprodutorMusical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonMusic implements ReprodutorMusical {

    List<Musica> musicas = new ArrayList<>(Arrays.asList(
            new Musica("Led Zeppelin","Stairway to Heaven"),
            new Musica("Queen","Bohemian Rhapsody"),
            new Musica("Pearl Jam","Alive"),
            new Musica("Van Halen","Jump"),
            new Musica("Iron Maiden","The Trooper"),
            new Musica("Metallica","Master of Puppets"),
            new Musica("Motorhead","Ace of Spades"),
            new Musica("Whitney Houston","I Will Always Love You"),
            new Musica("Justin Timberlake","Cry Me a River"),
            new Musica("Rihanna","Umbrella"),
            new Musica("Dua Lipa","Don't Start Now"),
            new Musica("Ariana Grande","Thank U, Next"),
            new Musica("Billie Eilish","Bad Guy"),
            new Musica("Imagine Dragons","Radioactive"),
            new Musica("Arctic Monkeys","Do I Wanna Know?"),
            new Musica("Metallica","One"),
            new Musica("Iron Maiden","Powerslave"),
            new Musica("Led Zeppelin","Whole Lotta Love"),
            new Musica("AC/DC","Highway to Hell"),
            new Musica("AC/DC","Thunderstruck")
    ));

    @Override
    public void tocar() {
        System.out.println("Música reproduzida pela Amazon Music");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada pela Amazon Music");
    }

    @Override
    public void selecionarMusica(String musica) {
        for (Musica nomeMusica : musicas){
            if(nomeMusica.getNomeMusica().equalsIgnoreCase(musica)){
                System.out.println("Musica em Amazon Music selecionada: " + nomeMusica.getNomeMusica());
            }
        }
        System.out.println("Música em Amazon Music não encontrada: " + musica);
    }
}
