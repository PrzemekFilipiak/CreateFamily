package CreateFamily.module.repositoryfmdb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "familymemberdb")
@Getter
@Setter
public class FamilyDbMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int familyId;

    private String familyName;

    private String givenName;

}
