package fi.haagahelia.zeus.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BasketballRepository1 extends CrudRepository<Basketball1, Long> {

    List<Basketball1> findByTime1(String time1);
    
}