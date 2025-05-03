package M1S10.M1S10.repositories;

import M1S10.M1S10.entities.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository <OrganizationEntity, Long> {
}
