package com.lm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * lombok
 * @author liangming.deng
 * @date   2017年11月20日
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "t_user")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public User(String username, String password, String createUser, Date createTime, String updateUser, Date updateTime) {
		this.username = username;
		this.password = password;
		this.createUser = createUser;
		this.createTime = createTime;
		this.updateUser = updateUser;
		this.updateTime = updateTime;
	}

}
