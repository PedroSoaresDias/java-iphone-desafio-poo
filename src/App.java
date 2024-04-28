import iphone.models.IPhone;
import navegador.models.INavegador;
import reprodutor.models.IReprodutor;
import telefone.models.ITelefone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        INavegador navegador = iPhone;
        ITelefone telefone = iPhone;
        IReprodutor reprodutor = iPhone;

        // Utilizando o Reprodutor de Músicas
        System.out.println("Utilizando o Reprodutor de Música \n");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        System.out.println(" ");

        System.out.println("=====================\n");

        // Utilizando o Telefone
        System.out.println("Utilizando o Telefone \n");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println(" ");

        System.out.println("=====================\n");

        // Utilizando o Navegador de Internet
        System.out.println("Utilizando o Navegador de Internet \n");
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        System.out.println(" ");
    }
}
