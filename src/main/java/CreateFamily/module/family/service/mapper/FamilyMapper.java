package CreateFamily.module.family.service.mapper;

import CreateFamily.module.family.service.dto.FamilyDto;
import CreateFamily.module.respositoryfdb.FamilyDbEntity;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyMapper {

    public static FamilyDto map(FamilyDbEntity familyDbEntity) {
        return new FamilyDto()
                .setId(familyDbEntity.getId())
                .setFamilyName(familyDbEntity.getFamilyName())
                .setNrOfInfants(familyDbEntity.getNrOfInfants())
                .setNrOfChildren(familyDbEntity.getNrOfChildren())
                .setNrOfAdults(familyDbEntity.getNrOfAdults())
                ;
    }

    public static List<FamilyDto> map(List<FamilyDbEntity> familyDbEntities) {
        return familyDbEntities
                .stream()
                .map(FamilyMapper::map)
                .collect(Collectors.toList());
    }
}
