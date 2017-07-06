package com.wbl;

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

public class ItunesGetTest {

	@Test
	public void testApi(){
		//creating http client object by using HttpClientBuilder
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet get = new HttpGet("https://itunes.apple.com/lookup?id=909253");
		//add header to request
		//get.addHeader("companygatewayid", "38493890");
		
		try {
			//execute the request and get response
			HttpResponse response = client.execute(get);
			
			System.out.println("resposne status code::"+response.getStatusLine().getStatusCode());
			System.out.println("resposne status code::"+response.getStatusLine());
			String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
			System.out.println("response:"+responseString);
			//headers
			Header[] headers = response.getAllHeaders();
			for(int i=0;i<headers.length;i++){
				System.out.println("header name: "+headers[i].getName()+":value:"+headers[i].getName());
			}
			//status code
			Assert.assertEquals(200, response.getStatusLine().getStatusCode());
			
			JSONObject json = new JSONObject(responseString);
			Assert.assertEquals(1, json.getInt("resultCount"));
			
			JSONArray arr = json.getJSONArray("results");
			for(int i=0;i<arr.length();i++){
				json = arr.getJSONObject(i);
				//value presence
				Assert.assertNotNull(json.get("wrapperType"));
				//key presence
				Assert.assertTrue(json.has("artistType"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
