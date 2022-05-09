package management.system.contact.sevice;

import management.system.contact.ContactApplication;
import management.system.contact.model.Details;
import management.system.contact.repository.DetailsRepository;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = ContactApplication.class)
public class DetailsImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DetailsRepository repository;
    @Test
    void insertTest() {
        List<Details> list = new ArrayList<>();
        Details list2 = repository.save(new Details("finn","path villa",91, "5689634453", "finn@email.com"));
        list.add(list2);
        assertEquals(1, list.size());

    }

    @Test
    void findByIdTest() {
        repository.deleteById(1);

    }

    @Test
    void deleteByIdTest() {
        repository.deleteById(1);
    }
}



