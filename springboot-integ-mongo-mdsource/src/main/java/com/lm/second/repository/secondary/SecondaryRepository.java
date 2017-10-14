package com.lm.second.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lm.second.entity.SecondaryMongoObject;

public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}
