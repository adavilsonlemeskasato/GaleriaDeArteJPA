
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adavi
 */
@Entity
@SequenceGenerator(
        name = Musica.SEQUENCE_NAME,
        sequenceName = Musica.SEQUENCE_NAME,
        initialValue = 10,
        allocationSize = 53
        )
public class Musica {
    
    public static final String SEQUENCE_NAME = "SEQUENCIA_MUSICA";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
}
