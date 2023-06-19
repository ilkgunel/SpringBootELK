package com.ilkaygunel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticsearchConfig extends ElasticsearchConfiguration {

    @Bean
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder() //
                .connectedTo("localhost:9200") //
                .build();
    }

}
