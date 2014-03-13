package com.musiccity.bean.music

import org.codehaus.jackson.map.ObjectMapper

class Test {

	public static void main(String[] args) {
		String jsonData = '{"name": "Mario"}'
		ObjectMapper objectMapper = new ObjectMapper();
		Style style = objectMapper.readValue(jsonData, Style.class)
		println style.getName()
	}
		
}
