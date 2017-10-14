package com.lm.first.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.lm.first.entry.PrimaryMongoObject;
import com.lm.first.entry.SecondaryMongoObject;

/**
 * 业务实现
 * @date   2017年10月14日
 *
 */
@Service
public class MongoObjectDaoImpl implements MongoObjectDao {

	// Using MongoTemplate for primary database
	@Autowired
	@Qualifier(value = "primaryMongoTemplate")
	protected MongoTemplate primaryMongoTemplate;

	// Using mongoTemplate for secondary database
	@Autowired
	@Qualifier(value = "secondaryMongoTemplate")
	protected MongoTemplate secondaryMongoTemplate;

	@Override
	public void savePrimary(PrimaryMongoObject primaryMongoObject) {
		primaryMongoTemplate.save(primaryMongoObject);
	}

	@Override
	public void saveSecondary(SecondaryMongoObject secondaryMongoObject) {
		secondaryMongoTemplate.save(secondaryMongoObject);
	}

	@Override
	public long getCount(String value) {
		Query query = new Query(Criteria.where("value").is(value));
		long primary = primaryMongoTemplate.count(query, PrimaryMongoObject.class);
		long secondary = secondaryMongoTemplate.count(query, SecondaryMongoObject.class);
		return (primary + secondary);
	}

}
