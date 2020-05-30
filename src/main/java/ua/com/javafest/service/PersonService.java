package ua.com.javafest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.javafest.entity.Note;
import ua.com.javafest.entity.Person;
import ua.com.javafest.repo.PersonRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    
    public void updateEmail(Long personId, String newEmail) {
        Person person = personRepository.findById(personId).orElseThrow();
        person.setEmail(newEmail);
    }

    public void addNote(Long personId, Note note) {
        Person person = personRepository.findById(personId).orElseThrow();
        person.addNote(note);
    }
}
