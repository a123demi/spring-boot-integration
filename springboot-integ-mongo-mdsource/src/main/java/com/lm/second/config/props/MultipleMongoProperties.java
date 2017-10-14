package com.lm.second.config.props;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
/**
 * 读取配置文件
 * @author liangming.deng
 * @date   2017年10月14日
 *
 */

@Data
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MultipleMongoProperties {

	private MongoProperties primary = new MongoProperties();
	private MongoProperties secondary = new MongoProperties();
}
