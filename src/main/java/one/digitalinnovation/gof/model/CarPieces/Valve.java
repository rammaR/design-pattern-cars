package one.digitalinnovation.gof.model.CarPieces;

public class Valve {

    private final int number;

    Valve(int number) {
        this.number = number;
    }

    public void abrir() {
        System.out.println("Valvula " + number + ": aberta");
    }

    public void fechar() {
        System.out.println("Valvula " + number + ": fechada");
    }

}
