package com.lm.lombok.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Test {
	
	@NonNull
	private String id;
	@NonNull
	private String msg;
	
	
	public static void main(String[] args){
		Test test = new Test();
		test.getId();
	}
}
