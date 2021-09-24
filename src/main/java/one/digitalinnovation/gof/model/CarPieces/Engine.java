package one.digitalinnovation.gof.model.CarPieces;

import lombok.Data;
import one.digitalinnovation.gof.helper.Temperature;

import java.util.ArrayList;
import java.util.List;

@Data
public class Engine {

    private Cylinder cilindro;
    private Temperature temperature;
    private List<Valve> valves;
    private Piston piston;
    private Candle candle;

    public Engine(){
        this.cilindro = new Cylinder();
        this.temperature = new Temperature(80);
        this.valves = new ArrayList<>();
        this.valves.add(new Valve(1));
        this.valves.add(new Valve(2));
        this.valves.add(new Valve(3));
    }

    public void ligar(){
        this.cilindro.ligar();
        System.out.println("Motor: entrando na fase de admissão");
        this.valves.forEach(Valve::abrir);
        System.out.println("Motor: entrando na fase de compressão");
        this.piston.comprime();
        System.out.println("Motor: combustão");
        this.candle.acender();
        System.out.println("Motor: liberar válvulas");
        this.valves.forEach(Valve::fechar);
    }
}
