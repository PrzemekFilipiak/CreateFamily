package CreateFamily.module.respositoryfdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "familydb")
@Getter
@Setter
public class FamilyDbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String familyName;

    private int nrOfAdults;

    private int nrOfChildren;

    private int nrOfInfants;

}
