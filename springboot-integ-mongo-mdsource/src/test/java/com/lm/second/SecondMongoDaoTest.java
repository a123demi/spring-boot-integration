package com.lm.second;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.first.AppTest;
import com.lm.second.dao.SecondMongoObjectDao;
import com.lm.second.entity.PrimaryMongoObject;
import com.lm.second.entity.SecondaryMongoObject;

public class SecondMongoDaoTest extends AppTest {

	@Autowired
	private SecondMongoObjectDao secondMongoObjectDao;

	@Test
	public void testSavePrimary() throws Exception {
		PrimaryMongoObject primaryMongoObject = new PrimaryMongoObject();
		primaryMongoObject.setId("p1" + new Date().getTime());
		primaryMongoObject.setValue("xiaoming1");
		secondMongoObjectDao.savePrimary(primaryMongoObject);
	}

	@Test
	public void testSaveSecondary() {
		SecondaryMongoObject secondaryMongoObject = new SecondaryMongoObject();
		secondaryMongoObject.setId("s1" + new Date().getTime());
		secondaryMongoObject.setValue("xiaoming1");
		secondMongoObjectDao.saveSecondary(secondaryMongoObject);
	}

	@Test
	public void testGetCount() {

		long count = secondMongoObjectDao.getCount("xiaoming");
		System.out.println("===============================count:" + count);
	}

}
