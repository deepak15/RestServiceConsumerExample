package com.dpk.application.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class PoemService {
	
	public static String POEM_SERVICE_URL = "https://api.poems.one/pod";
	@Autowired
	private RestTemplate restTemplate;
	
	
	public String getPoem() {
		ResponseEntity<String> re = restTemplate.getForEntity(POEM_SERVICE_URL, String.class);
		if (re.getStatusCode() == HttpStatus.OK ) {
			String str =  re.getBody().toString();
			
			//contents.poems[].poem.title
			//contents.poems[].poem.poem
			
			JSONObject obj = new JSONObject(str);
			JSONArray arr = obj.getJSONObject("contents").getJSONArray("poems");
			String title = arr.getJSONObject(0).getJSONObject("poem").getString("title");
			String p = arr.getJSONObject(0).getJSONObject("poem").getString("poem");
			
			return "[ " + title + " ]" + " : " + p;
			
		} else {
			return "Could not fetch Poem from rest service";
		}
		
	}

}
