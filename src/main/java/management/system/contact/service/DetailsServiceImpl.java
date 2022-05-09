package management.system.contact.service;

import management.system.contact.model.Details;
import management.system.contact.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DetailsServiceImpl implements DetailsService {

    @Autowired
    DetailsRepository repository;

    @Override
    public Details save(Details details) {
        return repository.save(details);
    }

    @Transactional
    @Override
    public List<Details> saveAllDetails(List<Details> detailsList) {
        List<Details> response = (List<Details>) repository.saveAll(detailsList);
        return response;

    }

    @Transactional
    @Override
    public List<Details> findAll() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public Optional<Details> findById(int id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
        System.out.println("Deleted successfully");
    }
}
