package com.ilkaygunel.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format(
                "Driver [id=%s, firstName='%s', lastName='%s']",
                id, name, surname);
    }
}
