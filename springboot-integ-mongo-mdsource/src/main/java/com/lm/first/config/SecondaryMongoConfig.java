package com.lm.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration  //Configuration 
@ConfigurationProperties(prefix = "spring.data.mongodb.secondary")  //Defines my custom prefix and points to the secondary db properties
public class SecondaryMongoConfig extends  AbstractMongoConfig{     
    /**      
      * Implementation of the MongoTemplate factory method      
      * @Bean gives a name (primaryMongoTemplate) to the created MongoTemplate instance      
      * Note that this method doesn't have @Primary       
      */    
    @Override public @Bean(name = "secondaryMongoTemplate") 
    MongoTemplate getMongoTemplate() throws Exception {        
        return new MongoTemplate(mongoDbFactory());    
    }
}
