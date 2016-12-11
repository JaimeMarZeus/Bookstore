package fi.haagahelia.zeus.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BasketballRepository extends CrudRepository<Basketball, Long> {

    List<Basketball> findByTime(String time);
    
}