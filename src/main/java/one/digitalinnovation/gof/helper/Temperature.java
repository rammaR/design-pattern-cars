package one.digitalinnovation.gof.helper;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@AllArgsConstructor
public class Temperature {

    public Temperature(int graus){
        this.graus = graus;
    }

    @Id
    private Long id;

    @Column
    private int graus;

}
