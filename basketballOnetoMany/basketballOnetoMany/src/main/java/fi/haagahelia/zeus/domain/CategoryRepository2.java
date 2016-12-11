package fi.haagahelia.zeus.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository2 extends CrudRepository<Category2, Long> {

    List<Category2> findByName2(String name2);
    
}