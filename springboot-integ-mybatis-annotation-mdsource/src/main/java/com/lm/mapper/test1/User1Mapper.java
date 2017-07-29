package com.lm.mapper.test1;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lm.entity.UserEntity;
import com.lm.enums.SexEnums;
/**
 * mybatis中mapper接口
 * @author liangming.deng
 * @date   2017年6月21日
 *
 */
public interface User1Mapper {
	@Select("select * from user")
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="userName",column="userName"),
		@Result(property="nickName",column="nickName"),
		@Result(property="passWord",column="passWord"),
		@Result(property="email",column="email"),
		@Result(property="regTime",column="regTime"),
		@Result(property="sexEnums",column="sex",javaType=SexEnums.class)})
	List<UserEntity> getAll();

	@Select("select * from user where id=#{id}")
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="userName",column="userName"),
		@Result(property="nickName",column="nickName"),
		@Result(property="passWord",column="passWord"),
		@Result(property="email",column="email"),
		@Result(property="regTime",column="regTime"),
		@Result(property="sexEnums",column="sex",javaType=SexEnums.class)})
	UserEntity getUserById(Long id);

	@Insert("INSERT INTO user(userName,nickName,passWord,email,regTime,sex) "
			+ "VALUES(#{userName}, #{nickName}, #{passWord}, #{email}, #{regTime}, #{sex}) ")
	void insert(UserEntity user);

	
	@Update("UPDATE user SET userName=#{userName},nickName=#{nickName} where id=#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM user where id=#{id}")
	void delete(Long id);
}
