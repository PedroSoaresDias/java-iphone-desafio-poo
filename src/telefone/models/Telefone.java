package telefone.models;

public class Telefone implements ITelefone {
    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
