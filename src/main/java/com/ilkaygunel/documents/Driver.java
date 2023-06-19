package com.ilkaygunel.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Data
@Document(indexName = "driver_index")
public class Driver implements Serializable {

    @Id
    @Nullable
    private String id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "surname")
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
