package CreateFamily.module.family.service.mapper;

import CreateFamily.module.family.service.dto.FamilyDto;
import CreateFamily.module.family.service.dto.FamilyMemberDto;
import CreateFamily.module.repositoryfmdb.FamilyDbMemberEntity;
import CreateFamily.module.respositoryfdb.FamilyDbEntity;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyMemberMapper {

    public static FamilyMemberDto map(FamilyDbMemberEntity familyDbMemberEntity) {
        return new FamilyMemberDto()
                .setId(familyDbMemberEntity.getId())
                .setFamilyId(familyDbMemberEntity.getFamilyId())
                .setFamilyName(familyDbMemberEntity.getFamilyName())
                .setGivenName(familyDbMemberEntity.getGivenName())
                ;
    }

    public static List<FamilyMemberDto> map(List<FamilyDbMemberEntity> familyDbMemberEntities) {
        return familyDbMemberEntities
                .stream()
                .map(FamilyMemberMapper::map)
                .collect(Collectors.toList());
    }
}
