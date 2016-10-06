package fi.haagahelia.zeus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.zeus.domain.Category;
import fi.haagahelia.zeus.domain.CategoryRepository;
import fi.haagahelia.zeus.domain.Bookstore;
import fi.haagahelia.zeus.domain.BookstoreRepository;

@SpringBootApplication
public class BookstoreOnetoManyApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreOnetoManyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreOnetoManyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookstoreRepository brepository , CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of info");
			crepository.save(new Category("Horror"));
			crepository.save(new Category("Comedy"));
			crepository.save(new Category("Drama"));
			
			brepository.save(new Bookstore("LOTR", "Jonathan" , 1991, 12345 , 50,crepository.findByName("Horror").get(0)));
			brepository.save(new Bookstore("THP", "Stuart", 1992, 12389 , 30, crepository.findByName("Comedy").get(0)));
			brepository.save(new Bookstore("WAR", "Karita", 2000, 56789 , 60, crepository.findByName("Drama").get(0)));
			
			log.info("fetch all Books");
			for (Bookstore bookstore : brepository.findAll()) {
				log.info(bookstore.toString());
			}

		};
	}
}
