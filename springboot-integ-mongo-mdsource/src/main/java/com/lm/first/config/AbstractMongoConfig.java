package com.lm.first.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * 根据配置文件创建MongoDbFactory
 * @date   2017年10月14日
 *
 */
public abstract class AbstractMongoConfig {
	// Mongo DB Properties
	private String host, database, username, password;
	private int port;
	// Setter methods go here..

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	/*
	 * Method that creates MongoDbFactory Common to both of the MongoDb
	 * connections
	 */
	public MongoDbFactory mongoDbFactory() throws Exception {
		ServerAddress serverAddress = new ServerAddress(host, port);
		List<MongoCredential> mongoCredentialList = new ArrayList<>();
		mongoCredentialList.add(MongoCredential.createCredential(username, database, password.toCharArray()));
		return new SimpleMongoDbFactory(new MongoClient(serverAddress, mongoCredentialList), database);
	}

	/*
	 * Factory method to create the MongoTemplate
	 */
	abstract public MongoTemplate getMongoTemplate() throws Exception;
}
