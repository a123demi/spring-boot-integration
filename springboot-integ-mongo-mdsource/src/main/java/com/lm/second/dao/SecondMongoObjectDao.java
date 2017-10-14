package com.lm.second.dao;

import com.lm.second.entity.PrimaryMongoObject;
import com.lm.second.entity.SecondaryMongoObject;

public interface SecondMongoObjectDao {
	public void savePrimary(PrimaryMongoObject primaryMongoObject);

	public void saveSecondary(SecondaryMongoObject secondaryMongoObject);

	public long getCount(String value);
}
