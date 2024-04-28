package reprodutor.models;

public class Reprodutor implements IReprodutor {
    public void tocar() {
        System.out.println("Tocando Música");
    }

    public void pausar() {
        System.out.println("Pausando Música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
}
