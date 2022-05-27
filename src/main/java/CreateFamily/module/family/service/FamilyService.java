package CreateFamily.module.family.service;

import CreateFamily.module.respositoryfdb.FamilyDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

    @Autowired
    private FamilyDbRepository familyDbRepository;
}
