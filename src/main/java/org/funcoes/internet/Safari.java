package org.funcoes.internet;

public class Safari implements NavegadorDeInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Página aberta pelo navegador Safari :)");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba aberta pelo navegador Safari :)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada pelo navegador Safari :)");
    }
}
