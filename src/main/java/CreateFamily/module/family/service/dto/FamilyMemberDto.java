package CreateFamily.module.family.service.dto;

import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = false, chain = true)
public class FamilyMemberDto {
    private int id;

    private int familyId;

    private String familyName;

    private String givenName;
}
