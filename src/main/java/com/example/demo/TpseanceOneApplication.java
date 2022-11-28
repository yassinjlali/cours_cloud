package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class TpseanceOneApplication {
	static String test(){
		String token = "10110a70-2d3c-433b-9c18-44bd1427ed69";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("X-CMC_PRO_API_KEY","Bearer"+ token);

		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";

		HttpEntity <String> request = new HttpEntity<String>(headers);
		ResponseEntity <String> result =  restTemplate.exchange(uri, HttpMethod.GET,request,String.class);

		String json = result.getBody();
		System.out.println(json);

		String s = "y" ;
		System.out.println("test CI/CD pipeline");
		return  s;

	}
	private static ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(TpseanceOneApplication.class, args);
		test();
	}

}
