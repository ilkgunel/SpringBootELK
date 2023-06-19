package com.ilkaygunel.repository;

import com.ilkaygunel.documents.Driver;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends ElasticsearchRepository<Driver, String> {

    public Driver findByName(String name);

}
