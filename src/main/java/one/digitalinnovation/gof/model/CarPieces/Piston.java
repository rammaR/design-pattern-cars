package one.digitalinnovation.gof.model.CarPieces;

import lombok.Data;

@Data
public class Piston {

    public void comprime(){
        System.out.println("Pistão: comprimindo");
    }

    public void expande(){
        System.out.println("Pistão: expandindo");
    }

}
