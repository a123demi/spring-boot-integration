package com.lm.second.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author 
 * 第二数据源 数据层
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.lm.second.repository.secondary",
		mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {

	protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
