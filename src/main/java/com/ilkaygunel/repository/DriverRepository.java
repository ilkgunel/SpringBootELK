package com.ilkaygunel.repository;

import com.ilkaygunel.documents.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {

    public Driver findByName(String name);

}
