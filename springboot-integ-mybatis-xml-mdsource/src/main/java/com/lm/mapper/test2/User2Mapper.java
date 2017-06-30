package com.lm.mapper.test2;

import java.util.List;

import com.lm.entity.UserEntity;
/**
 * mybatis中mapper接口
 * @author liangming.deng
 * @date   2017年6月21日
 *
 */
public interface User2Mapper {
	List<UserEntity> getAll();

	UserEntity getUserById(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);
}
