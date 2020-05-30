package ua.com.javafest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.com.javafest.entity.Note;
import ua.com.javafest.entity.Person;
import ua.com.javafest.repo.PersonRepository;
import ua.com.javafest.service.PersonService;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;
    private final PersonService personService;

    @GetMapping
    public Iterable<Person> getAll() {
        return personRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updateEmail(@PathVariable Long id, @RequestParam String newEmail) {
        personService.updateEmail(id, newEmail);
    }

    @PostMapping("/{id}/notes")
    public void addNote(@PathVariable Long id, @RequestBody Note note) {
        personService.addNote(id, note);
    }
}
