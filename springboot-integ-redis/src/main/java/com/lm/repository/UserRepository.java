package com.lm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lm.entity.User;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月17日
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByUsernameAndPassword(String username, String password);

}
