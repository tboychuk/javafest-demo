package ua.com.javafest.entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Note {
    private String text;
    private LocalDateTime createdAt = LocalDateTime.now();
}
