package org.funcoes.music;

public class Musica {
    private String artista;
    private String nomeMusica;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String musica) {
        this.nomeMusica = musica;
    }

    public Musica(String artista, String musica) {
        this.artista = artista;
        this.nomeMusica = musica;
    }
}
