package CreateFamily.module.repositoryfmdb;

import CreateFamily.module.respositoryfdb.FamilyDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyDbMemberRepository extends JpaRepository<FamilyDbMemberEntity, Integer>,
        JpaSpecificationExecutor<FamilyDbMemberEntity> {

        FamilyDbMemberRepository getById(String id);
}
