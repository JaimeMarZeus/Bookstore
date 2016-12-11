package fi.haagahelia.zeus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.zeus.domain.User;
import fi.haagahelia.zeus.domain.UserRepository;
import fi.haagahelia.zeus.domain.Category;
import fi.haagahelia.zeus.domain.Category1;
import fi.haagahelia.zeus.domain.Category2;
import fi.haagahelia.zeus.domain.CategoryRepository;
import fi.haagahelia.zeus.domain.CategoryRepository1;
import fi.haagahelia.zeus.domain.CategoryRepository2;
import fi.haagahelia.zeus.domain.Basketball;
import fi.haagahelia.zeus.domain.Basketball1;
import fi.haagahelia.zeus.domain.Basketball2;
import fi.haagahelia.zeus.domain.BasketballRepository;
import fi.haagahelia.zeus.domain.BasketballRepository1;
import fi.haagahelia.zeus.domain.BasketballRepository2;

@SpringBootApplication
public class BasketballOnetoManyApplication {

	private static final Logger log = LoggerFactory.getLogger(BasketballOnetoManyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BasketballOnetoManyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BasketballRepository brepository , BasketballRepository1 bbrepository ,BasketballRepository2 bbbrepository ,CategoryRepository crepository , CategoryRepository1 ccrepository ,CategoryRepository2 cccrepository ,UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of info");
			crepository.save(new Category("ESPN"));
			crepository.save(new Category("MSG"));
			crepository.save(new Category("NBATV"));
			
			brepository.save(new Basketball("November 01,2016", "07.30 PM" ,"Detroit Pistons vs. New York Knicks" , "Auburn Hills","50.00 $",crepository.findByName("ESPN").get(0)));
			brepository.save(new Basketball("November 02,2016", "07.30 PM" ,"New York Knicks vs. Houston Rockets" , "New York, NY","50.00 $",crepository.findByName("MSG").get(0)));
			brepository.save(new Basketball("November 04,2016", "10.30 PM" ,"Chicago Bulls vs. New York Knicks" , "Chicago, IL","50.00 $",crepository.findByName("NBATV").get(0)));
			brepository.save(new Basketball("November 06,2016", "10.30 PM" ,"New York Knicks vs. Utah Jazz" , "New York, NY","50.00 $",crepository.findByName("NBATV").get(0)));
			brepository.save(new Basketball("November 09,2016", "05.30 PM" ,"New York Knicks vs. Brooklyn Nets" , "New York, NY","50.00 $",crepository.findByName("NBATV").get(0)));
			brepository.save(new Basketball("November 11,2016", "09.00 PM" ,"Boston Celtics vs. New York Knicks" , "Boston, MA","50.00 $",crepository.findByName("NBATV").get(0)));
			brepository.save(new Basketball("November 12,2016", "06.00 PM" ,"Toronto Raptors vs. New York Knicks" , "Toronto, Canada","50.00 $",crepository.findByName("NBATV").get(0)));
			brepository.save(new Basketball("November 13,2016", "10.30 PM" ,"New York Knicks vs. Dallas Mavericks" , "New York, NY","50.00 $",crepository.findByName("MSG").get(0)));
			brepository.save(new Basketball("November 26,2016", "07.00 PM" ,"New York Knicks vs. Oklahoma Thunders" , "New York, NY","50.00 $",crepository.findByName("MSG").get(0)));
			brepository.save(new Basketball("December 05,2016", "10.30 PM" ,"Toronto Raptors vs. New York Knicks" , "Toronto, Canada","50.00 $",crepository.findByName("ESPN").get(0)));
			brepository.save(new Basketball("December 10,2016", "10.30 PM" ,"New York Knicks vs. Los Angeles Lakers" , "Los Angeles, LA","50.00 $",crepository.findByName("ESPN").get(0)));
			
			ccrepository.save(new Category1("ESPN"));
			ccrepository.save(new Category1("MSG"));
			ccrepository.save(new Category1("NBATV"));
			
			bbrepository.save(new Basketball1("November 01,2016", "07.30 PM" ,"Detroit Pistons vs. New York Knicks" , "Auburn Hills","50.00 $",ccrepository.findByName1("ESPN").get(0)));
			bbrepository.save(new Basketball1("November 02,2016", "07.30 PM" ,"New York Knicks vs. Houston Rockets" , "New York, NY","50.00 $",ccrepository.findByName1("MSG").get(0)));
			bbrepository.save(new Basketball1("November 04,2016", "10.30 PM" ,"Chicago Bulls vs. New York Knicks" , "Chicago, IL","50.00 $",ccrepository.findByName1("NBATV").get(0)));
			bbrepository.save(new Basketball1("November 06,2016", "10.30 PM" ,"New York Knicks vs. Utah Jazz" , "New York, NY","50.00 $",ccrepository.findByName1("NBATV").get(0)));
			bbrepository.save(new Basketball1("November 09,2016", "05.30 PM" ,"New York Knicks vs. Brooklyn Nets" , "New York, NY","50.00 $",ccrepository.findByName1("NBATV").get(0)));
			
			cccrepository.save(new Category2("ESPN"));
			cccrepository.save(new Category2("MSG"));
			cccrepository.save(new Category2("NBATV"));
			
			bbbrepository.save(new Basketball2("November 01,2016", "07.30 PM" ,"Detroit Pistons vs. New York Knicks" , "Auburn Hills","50.00 $",cccrepository.findByName2("ESPN").get(0)));
			bbbrepository.save(new Basketball2("November 02,2016", "07.30 PM" ,"New York Knicks vs. Houston Rockets" , "New York, NY","50.00 $",cccrepository.findByName2("MSG").get(0)));
			bbbrepository.save(new Basketball2("November 04,2016", "10.30 PM" ,"Chicago Bulls vs. New York Knicks" , "Chicago, IL","50.00 $",cccrepository.findByName2("NBATV").get(0)));
			bbbrepository.save(new Basketball2("November 06,2016", "10.30 PM" ,"New York Knicks vs. Utah Jazz" , "New York, NY","50.00 $",cccrepository.findByName2("NBATV").get(0)));
			bbbrepository.save(new Basketball2("November 09,2016", "05.30 PM" ,"New York Knicks vs. Brooklyn Nets" , "New York, NY","50.00 $",cccrepository.findByName2("NBATV").get(0)));
			bbbrepository.save(new Basketball2("November 26,2016", "07.00 PM" ,"New York Knicks vs. Oklahoma Thunders" , "New York, NY","50.00 $",cccrepository.findByName2("MSG").get(0)));
			bbbrepository.save(new Basketball2("December 05,2016", "10.30 PM" ,"Toronto Raptors vs. New York Knicks" , "Toronto, Canada","50.00 $",cccrepository.findByName2("ESPN").get(0)));
			
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
			log.info("fetch all Books");
			for (Basketball basketball : brepository.findAll()) {
				log.info(basketball.toString());
			}

		};
	}
}
