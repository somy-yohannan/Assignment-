package management.system.contact;

import management.system.contact.controller.DetailsController;
import management.system.contact.model.Details;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Autowired
	private DetailsController controller;


	@Override
	public void run(String... args) throws Exception {
        System.out.println();
        logger.info("Inserting -> {}",
                controller.saveDetails(new Details("Jeremy", "wintergarden", 91, "565656", "jeremy@gmail.com")));
        logger.info("Inserting -> {}",
                controller.saveDetails(new Details(": Peter", "Heavens", 05, "232323", "peter@gmail.com")));
        System.out.println();
        logger.info("all contact list {}",controller.findAll());


	}
}
