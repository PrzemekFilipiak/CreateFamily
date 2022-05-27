package CreateFamily.module.respositoryfdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyDbRepository extends JpaRepository<FamilyDbEntity, Integer>,
        JpaSpecificationExecutor<FamilyDbEntity> {

        FamilyDbEntity getById(String id);
}
