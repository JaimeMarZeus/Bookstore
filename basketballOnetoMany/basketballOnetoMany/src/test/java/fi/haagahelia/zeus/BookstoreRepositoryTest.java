package fi.haagahelia.zeus;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.zeus.domain.Category;
import fi.haagahelia.zeus.domain.Basketball;
import fi.haagahelia.zeus.domain.BasketballRepository;
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookstoreRepositoryTest {

	 @Autowired
	    private BasketballRepository repository;

	    @Test
	    public void findByLastnameShouldReturnStudent() {
	        List<Basketball> basketballs = repository.findByTime("07.30 PM");
	        
	        assertThat(basketballs).hasSize(1);
	        assertThat(basketballs.get(0).getGame()).isEqualTo("Detroit Pistons vs. New York Knicks");
	    }
	    
	    @Test
	    public void createNewStudent() {
	    	Basketball basketball = new Basketball("November 01,2016", "07.30 PM" ,"Detroit Pistons vs. New York Knicks" , "Auburn Hills","50.00 $", new Category("ESPN"));
	    	repository.save(basketball);
	    	assertThat(basketball.getId()).isNotNull();
	    }    

	}
