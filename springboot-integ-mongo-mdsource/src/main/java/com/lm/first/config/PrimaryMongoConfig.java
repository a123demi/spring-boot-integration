package com.lm.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration  //Configuration class
@ConfigurationProperties(prefix = "spring.data.mongodb.primary") //Defines my custom prefix and points to the primary db properties
public class PrimaryMongoConfig extends AbstractMongoConfig {     
    /**      
     * Implementation of the MongoTemplate factory method      
     * @Bean gives a name (primaryMongoTemplate) to the created MongoTemplate instance      
     * @Primary declares that if MongoTemplate is autowired without providing a specific name, 
     * this is the instance which will be mapped by         default      
     */    
     @Primary    
     @Override    
     public @Bean(name = "primaryMongoTemplate") MongoTemplate getMongoTemplate() throws Exception {        
         return new MongoTemplate(mongoDbFactory());    
     }
}
