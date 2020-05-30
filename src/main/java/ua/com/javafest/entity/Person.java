package ua.com.javafest.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }
}
