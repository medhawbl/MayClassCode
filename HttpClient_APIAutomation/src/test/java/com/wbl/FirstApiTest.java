package com.wbl;

import java.io.FileReader;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

public class FirstApiTest {

	@Test
	public void testApi(){
		//creating http client object by using HttpClientBuilder
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet get = new HttpGet("https://itunes.apple.com/lookup?id=909253");
		
		try {
			HttpResponse response = client.execute(get);
			
			System.out.println("resposne status code::"+response.getStatusLine().getStatusCode());
			System.out.println("resposne status code::"+response.getStatusLine());
			String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
			System.out.println("response:"+responseString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
