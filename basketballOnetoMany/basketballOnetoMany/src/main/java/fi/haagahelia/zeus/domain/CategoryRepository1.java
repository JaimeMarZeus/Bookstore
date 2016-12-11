package fi.haagahelia.zeus.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository1 extends CrudRepository<Category1, Long> {

    List<Category1> findByName1(String name1);
    
}