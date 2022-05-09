package management.system.contact.repository;

import management.system.contact.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
