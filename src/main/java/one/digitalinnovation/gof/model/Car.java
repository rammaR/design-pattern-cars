package one.digitalinnovation.gof.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.gof.helper.ENUM_TYPE_FUEL;
import one.digitalinnovation.gof.model.CarPieces.*;
import one.digitalinnovation.gof.model.Gear.Gear;

import javax.persistence.Id;

/**
 * Na classe principal do sistemas, vemos a aplicação dos padrões Facade, Observer, Builder, Adapter, Factory, State
 * @author RammaR
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car implements IAutomovel, IMovable, ISupplier {

    @Id
    private Long id;
    private int year;
    private int speed;
    private String color;
    private String make;
    private String model;
    private ENUM_TYPE_FUEL type_fuel;
    private ENUM_TYPE_SPEED type_speed;
    //
    private Gear gear;
    private Engine engine;
    private Batery batery;
    private FiltroAr filtroAr;
    private Radiator radiator;
    private SignalControl signalControl;
    private DirectionControl directionControl;
    private CheckSystem checkSystem;
    private FuelSystem fuelSystem;
    private ACCSystem accSystem;

    /**
     * Aqui aplico o padrão de projeto Facade, abstraindo ação complexa de ligar o carro e seus subsistemas
     * com apenas uma chamada simples.
     */
    @Override
    public void turnOn() {
        this.ignition();
        this.filtroAr.check();
        this.batery.ligar();
        this.engine.ligar();
        this.radiator.resfriar(this.engine.getTemperature());
    }

    /**
     * Aqui aplico o padrão Observer: O sistema de alarme e sinais visuais do carro irão ser acionados
     * caso o combustível fique abaixo do limite inferior ou ocorra algum problema com a bateria
     */
    private void ignition() {
        this.fuelSystem.addSubscriber(this.checkSystem);
        this.accSystem.addSubscriber(this.checkSystem);
        System.out.println("Car: System ignition init");
        this.checkSystem.ignit();
    }

    /**
     * Padrão de projeto State: Ao acelerar ou frear o carro, dependendo do estado, terá comportamentos diferentes.
     * Indo para uma marcha mais alta ou mais baixa conforme o estado atual
     */
    @Override
    public void speedUp() {
        System.out.println("Car: accelerator activated");
        this.gear.toNext();
        System.out.println("Car: speeding up");
    }

    @Override
    public void breakDown() {
        System.out.println("Car: brake activated");
        this.gear.toPrevious();
        System.out.println("Car: slowing down");
    }

    /**
     * getSpeed e addFuel são dois métodos que implementam o padrão Adapter.
     * Dependendo do tipo de carro, será mostrado a velocidade em MPH ou KPH
     * Dependendo do tipo de combustível (elétrico ou não), o sistema de combustível fará uso de um conversor     *
     */
    @Override
    public double getSpeed() {
        if (this.type_speed == ENUM_TYPE_SPEED.MPH) {
            return this.speed;
        } else {
            IMovable adapter = new MovableAdapter(this);
            return adapter.getSpeed();
        }
    }

    @Override
    public void addFuel(Double quant) {
        if (this.type_fuel == ENUM_TYPE_FUEL.ELETRIC) {
            ISupplier adapter = new ElectricAdapter(this.fuelSystem);
            adapter.addFuel(quant);
        } else {
            this.fuelSystem.supply(quant);
        }
    }
}