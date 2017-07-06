package com.wbl.restapi;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.HttpBaseApi;

public class TwitterGetTest extends HttpBaseApi {

	private static final String resource = "/1.1/account/settings.json";
	
	@Test
	public void testApi(){
		try {
			//execute the request and get response
			HttpResponse response = client.execute(get(resource));
			
			System.out.println("resposne status code::"+response.getStatusLine().getStatusCode());
			System.out.println("resposne status code::"+response.getStatusLine());
			String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
			System.out.println("response:"+responseString);
			
			//status code
			Assert.assertEquals(200, response.getStatusLine().getStatusCode());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testApi2(){
		try {
			//execute the request and get response
			HttpResponse response = client.execute(get(resource));
			
			System.out.println("resposne status code::"+response.getStatusLine().getStatusCode());
			System.out.println("resposne status code::"+response.getStatusLine());
			String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
			System.out.println("response:"+responseString);
			
			//status code
			Assert.assertEquals(200, response.getStatusLine().getStatusCode());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
