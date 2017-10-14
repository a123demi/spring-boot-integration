package com.lm.second.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lm.second.entity.PrimaryMongoObject;

public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {
}
