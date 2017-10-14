package com.lm.first.dao;

import com.lm.first.entry.PrimaryMongoObject;
import com.lm.first.entry.SecondaryMongoObject;

public interface MongoObjectDao {
	public void savePrimary(PrimaryMongoObject primaryMongoObject);

	public void saveSecondary(SecondaryMongoObject secondaryMongoObject);

	public long getCount(String value);
}
