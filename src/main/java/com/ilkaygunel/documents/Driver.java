package com.ilkaygunel.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Driver")
public class Driver {

    @Id
    private String id;

    private String name;
    private String surname;

    public Driver() {

    }

    public Driver(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format(
                "Driver [id=%s, firstName='%s', lastName='%s']",
                id, name, surname);
    }
}
