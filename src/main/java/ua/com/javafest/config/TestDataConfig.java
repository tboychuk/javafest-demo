package ua.com.javafest.config;

import io.codearte.jfairy.Fairy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import ua.com.javafest.entity.Person;
import ua.com.javafest.repo.PersonRepository;

import java.util.stream.Stream;

@Configuration
@RequiredArgsConstructor
public class TestDataConfig implements InitializingBean {
    private final PersonRepository personRepository;

    public Person generatePerson() {
        Fairy fairy = Fairy.create();
        io.codearte.jfairy.producer.person.Person p = fairy.person();
        Person person = new Person();
        person.setFirstName(p.getFirstName());
        person.setLastName(p.getLastName());
        person.setEmail(p.getEmail());
        return person;
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        Stream.generate(this::generatePerson)
                .limit(5)
                .forEach(personRepository::save);
    }
}
