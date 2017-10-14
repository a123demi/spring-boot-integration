package com.lm.first;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.first.dao.MongoObjectDao;
import com.lm.first.entry.PrimaryMongoObject;
import com.lm.first.entry.SecondaryMongoObject;

public class MongoDaoTest extends AppTest {

	@Autowired
	private MongoObjectDao mongoObjectDao;

	@Test
	public void testSavePrimary() throws Exception {
		PrimaryMongoObject primaryMongoObject = new PrimaryMongoObject();
		primaryMongoObject.setId("p1" + new Date().getTime());
		primaryMongoObject.setValue("xiaoming");
		mongoObjectDao.savePrimary(primaryMongoObject);
	}

	@Test
	public void testSaveSecondary() {
		SecondaryMongoObject secondaryMongoObject = new SecondaryMongoObject();
		secondaryMongoObject.setId("s1" + new Date().getTime());
		secondaryMongoObject.setValue("xiaoming");
		mongoObjectDao.saveSecondary(secondaryMongoObject);
	}

	@Test
	public void testGetCount() {

		long count = mongoObjectDao.getCount("xiaoming");
		System.out.println("===============================count:" + count);
	}

}
