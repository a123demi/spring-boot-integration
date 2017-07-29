package com.lm.entity;

import java.util.Date;

import com.lm.enums.SexEnums;

/**
 * 用户信息
 * @author liangming.deng
 * @date   2017年6月20日
 *
 */
public class UserEntity {
	/**
	 * 逐渐
	 */
	private Long id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 密码
	 */
	private String passWord;
	/**
	 * 注册时间
	 */
	private Date regTime;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 性别
	 */
	private SexEnums sexEnums;
	
	public UserEntity(){}
	
	public UserEntity(String userName, String nickName, String passWord, Date regTime, String email,
			SexEnums sexEnums) {
		super();
		this.userName = userName;
		this.nickName = nickName;
		this.passWord = passWord;
		this.regTime = regTime;
		this.email = email;
		this.sexEnums = sexEnums;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SexEnums getSexEnums() {
		return sexEnums;
	}
	public void setSexEnums(SexEnums sexEnums) {
		this.sexEnums = sexEnums;
	}
	
}
