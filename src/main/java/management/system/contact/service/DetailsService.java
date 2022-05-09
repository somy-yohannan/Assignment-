package management.system.contact.service;

import management.system.contact.model.Details;

import java.util.List;
import java.util.Optional;

public interface DetailsService {

    Details save(Details details);

    List<Details> saveAllDetails(List<Details> detailsList);

    List<Details> findAll() ;

    Optional<Details> findById(int id);

    void deleteById(int id);

}
