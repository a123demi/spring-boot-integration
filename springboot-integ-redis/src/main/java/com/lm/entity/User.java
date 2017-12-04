package com.lm.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * lombok注解实现javabean
 * @author liangming.deng
 * @date   2017年11月17日
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "create_user")
	private String createUser;

	@Column(name = "create_time")
	@JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
	private Date createTime;

	@Column(name = "update_user")
	private String updateUser;

	@Column(name = "update_time")
	@JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
	private Date updateTime;

	@Transient
	private List<Integer> userIdList;
	
	public User(String username, String password, String createUser, Date createTime, String updateUser, Date updateTime) {
		this.username = username;
		this.password = password;
		this.createUser = createUser;
		this.createTime = createTime;
		this.updateUser = updateUser;
		this.updateTime = updateTime;
	}
}
