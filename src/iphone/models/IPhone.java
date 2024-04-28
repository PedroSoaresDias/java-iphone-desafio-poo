package iphone.models;

import navegador.models.INavegador;
import reprodutor.models.IReprodutor;
import telefone.models.ITelefone;

public class IPhone implements ITelefone, IReprodutor, INavegador {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página no Navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba no Navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página no Navegador");
    }
}
