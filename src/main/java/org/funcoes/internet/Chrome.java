package org.funcoes.internet;

public class Chrome implements NavegadorDeInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Página aberta pelo navegador Chrome :)");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba aberta pelo navegador Chrome :)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada pelo navegador Chrome :)");
    }
}
