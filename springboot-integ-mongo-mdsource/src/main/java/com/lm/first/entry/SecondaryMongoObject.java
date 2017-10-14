package com.lm.first.entry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author secondary对象
 */
@Document(collection = "second_mongo")
public class SecondaryMongoObject {

	@Id
	private String id;

	private String value;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
        return "SecondaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\''
				+ '}';
	}
}
