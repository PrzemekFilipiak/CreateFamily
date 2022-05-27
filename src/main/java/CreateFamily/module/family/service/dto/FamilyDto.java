package CreateFamily.module.family.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Accessors(fluent = false, chain = true)
public class FamilyDto {

    private int id;

    private String familyName;

    private int nrOfAdults;

    private int nrOfChildren;

    private int nrOfInfants;

    public int getId() {
        return id;
    }

    public FamilyDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public FamilyDto setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public int getNrOfAdults() {
        return nrOfAdults;
    }

    public FamilyDto setNrOfAdults(int nrOfAdults) {
        this.nrOfAdults = nrOfAdults;
        return this;
    }

    public int getNrOfChildren() {
        return nrOfChildren;
    }

    public FamilyDto setNrOfChildren(int nrOfChildren) {
        this.nrOfChildren = nrOfChildren;
        return this;
    }

    public int getNrOfInfants() {
        return nrOfInfants;
    }

    public FamilyDto setNrOfInfants(int nrOfInfants) {
        this.nrOfInfants = nrOfInfants;
        return this;
    }
}
