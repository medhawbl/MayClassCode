package com.wbl.restapi;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.HttpBaseApi;
import com.wbl.utils.ExcelHelper;

public class TwitterPostTest extends HttpBaseApi{
	
	private static final String resource = "/1.1/account/update_profile.json";
	
	@DataProvider(name="postData")
	public Object[][] testData(){
		return ExcelHelper.getExcelData("twitter-post-data.xlsx", "Sheet1");
	}
	
	@Test(dataProvider="postData")
	public void apiTest(String name, String desc, String expected){
		
		HttpPost post = post(resource);
		try {
		
		//method 2 - json to request string
		JSONObject reqobj = new JSONObject();
		reqobj.put("name", name );
		reqobj.put("description",desc);
		String req= reqobj.toString();
		System.out.println(req);
		post.setEntity(new StringEntity(req));
		
		HttpResponse response = client.execute(post);
		
		//Assert.assertEquals(expected,response.getStatusLine().getStatusCode());
		
		String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
		System.out.println("response:"+responseString);
		
		JSONObject json = new JSONObject(responseString);
		Assert.assertNotNull(json.getInt("id"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
