package org.usuario;

import org.funcoes.film.Disney;
import org.funcoes.film.Netflix;
import org.funcoes.film.ReprodutorFilme;
import org.funcoes.internet.Chrome;
import org.funcoes.internet.NavegadorDeInternet;
import org.funcoes.internet.Safari;
import org.funcoes.music.ReprodutorMusical;
import org.funcoes.music.Spotify;
import org.funcoes.music.AmazonMusic;
import org.funcoes.telefone.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual ação deseja: \n" +
                "1. Abrir navegador\n" +
                "2. Play de música\n" +
                "3. Assitir filme\n"+
                "4. Telefone\n");

        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Qual navegador utilizar: " +
                        "1. Chrome\n" +
                        "2. Safira");
                int escolhaNavegador;
                escolhaNavegador = scanner.nextInt();
                NavegadorDeInternet navegador;

                switch (escolhaNavegador){
                    case 1:
                        navegador = new Chrome();
                        break;
                    case 2:
                        navegador = new Safari();
                        break;
                    default:
                        System.out.println("Navegador não instalado!");
                        return;
                }

                navegador.exibirPagina();
                navegador.adicionarNovaAba();
                navegador.atualizarPagina();
                break;

            case 2:
                System.out.println("Escolha qual aplicativo de música utilizar:\n" +
                        "1. Amazon Music\n" +
                        "2. Spotify\n");
                int escolhaAppMusica = scanner.nextInt();
                ReprodutorMusical reprodutorMusical;

                switch (escolhaAppMusica){
                    case 1:
                        reprodutorMusical = new AmazonMusic();
                        break;
                    case 2:
                        reprodutorMusical = new Spotify();
                        break;
                    default:
                        System.out.println("Reprodutor de música não instalado");
                        return;
                }

                System.out.println("Escolha a Música: ");
                String nomeMusica = scanner.nextLine();
                reprodutorMusical.selecionarMusica(nomeMusica);
                reprodutorMusical.tocar();
                reprodutorMusical.pausar();
                break;

            case 3:
                System.out.println("Selecione o Streaming de Filmes desejado: \n" +
                        "1. Netflix\n" +
                        "2. Disney+\n");

                int escolhaAppFilme = scanner.nextInt();
                ReprodutorFilme reprodutorFilme;

                switch (escolhaAppFilme){
                    case 1:
                        reprodutorFilme = new Netflix();
                        break;
                    case 2:
                        reprodutorFilme = new Disney();
                        break;
                    default:
                        System.out.println("Aplicativo de streaming de filme não instalado");
                        return;
                }

                System.out.println("Escolha o Filme: ");
                String nomeFilme = scanner.nextLine();
                reprodutorFilme.selecionarFilme(nomeFilme);
                reprodutorFilme.reproduzir();
                reprodutorFilme.pausar();
                break;

            case 4:
                System.out.println("1. Fazer ligação\n" +
                        "2. Correio de Voz\n");

                int escolhaOpcao = scanner.nextInt();
                AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

                switch (escolhaOpcao){
                    case 1:
                        System.out.println("Digite o nome do Contato:");
                        scanner.nextLine();
                        String nomeContato = scanner.nextLine();
                        System.out.println(aparelhoTelefonico.ligar(nomeContato));
                        break;
                    case 2:
                        aparelhoTelefonico.iniciarCorreioVoz();
                        break;
                    default:
                        System.out.println("Opação inválida");
                        return;
                }
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }

        scanner.close();

    }
}