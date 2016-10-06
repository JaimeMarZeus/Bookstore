package fi.haagahelia.zeus.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookstoreRepository extends CrudRepository<Bookstore, Long> {

    List<Bookstore> findByAuthor(String author);
    
}