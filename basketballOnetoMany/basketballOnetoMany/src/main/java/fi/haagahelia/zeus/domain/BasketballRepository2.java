package fi.haagahelia.zeus.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BasketballRepository2 extends CrudRepository<Basketball2, Long> {

    List<Basketball2> findByTime2(String time2);
    
}