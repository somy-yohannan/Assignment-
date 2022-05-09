package management.system.contact.repository;

import management.system.contact.model.Details;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaUnitTest {

    @Autowired
    DetailsRepository repository;

    @Test
    public void DetailsRepositoryTest() {
        repository.save(new Details("mathew", "mathew villa", 1, "(255)565689", "mathew@gmail.com"));

        List<Details> detailsList = new ArrayList<>();
        detailsList.add(new Details("finn","finn villa",20, "7653318522", "finn@email.com"));
        detailsList.add(new Details("love","love villa", 91, "265689324","love@gmail.com"));
        repository.saveAll(detailsList);
        repository.findById(1);
        repository.findAll().forEach(System.out::println);
        repository.deleteById(1);
    }
}
