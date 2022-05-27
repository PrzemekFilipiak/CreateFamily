package CreateFamily.module.family.service;

import CreateFamily.module.repositoryfmdb.FamilyDbMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberService {

    @Autowired
    private FamilyDbMemberRepository familyDbMemberRepository;

}
