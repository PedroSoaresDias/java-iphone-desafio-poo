package navegador.models;

public class Navegador implements INavegador {
    public void exibirPagina() {
        System.out.println("Exibindo Página no Navegador");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba no Navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página no Navegador");
    }
}
