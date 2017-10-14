package com.lm.second.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.second.entity.PrimaryMongoObject;
import com.lm.second.entity.SecondaryMongoObject;
import com.lm.second.repository.primary.PrimaryRepository;
import com.lm.second.repository.secondary.SecondaryRepository;

/**
 * 业务实现
 * 
 * @date 2017年10月14日
 *
 */
@Service
public class SecondMongoObjectDaoImpl implements SecondMongoObjectDao {

	@Autowired
	private PrimaryRepository primaryRepository;
	@Autowired
	private SecondaryRepository secondaryRepository;

	@Override
	public void savePrimary(PrimaryMongoObject primaryMongoObject) {
		primaryRepository.save(primaryMongoObject);
	}

	@Override
	public void saveSecondary(SecondaryMongoObject secondaryMongoObject) {
		secondaryRepository.save(secondaryMongoObject);
	}

	@Override
	public long getCount(String value) {

		long primary = primaryRepository.findAll().size();
		long secondary = secondaryRepository.findAll().size();
		return (primary + secondary);
	}

}
