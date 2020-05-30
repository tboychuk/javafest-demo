package ua.com.javafest.repo;

import org.springframework.data.repository.CrudRepository;
import ua.com.javafest.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
    
}
