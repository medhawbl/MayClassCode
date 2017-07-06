package com.wbl;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

public class TwitterPostTest {
	
	@Test
	public void apiTest(){
		HttpClient client = HttpClientBuilder.create().build();
		
		//set authentication
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer("mWfW59HF0Rqx5M5zn5ppR3iGG", "jICqsMPVEtLwiRqvQrl5sjF9KUT3W7RGDBqm1G5YlVEDWrl1bv");
		
		consumer.setTokenWithSecret("738049748985204736-KqojDhKb9m7HsWA1ijQ9KaIgi2RLzoC", "Hits9HjjbtDPL8yqGxu5TsXbnrtXBRm7aEqLftbF0qOvf");
		
		HttpPost post = new HttpPost("https://api.twitter.com/1.1/account/update_profile.json");//?name=Medha&description=desc2");
		
		try {
		//authenticating post request object
		consumer.sign(post);
		
		//set headers in request
		//post.addHeader("","");
		
		//method 1
		/*List<NameValuePair> nvps = new ArrayList <NameValuePair>();
		nvps.add(new BasicNameValuePair("name", "Medha"));
		nvps.add(new BasicNameValuePair("description", "testing"));
		
		//set request payload/body
		post.setEntity(new UrlEncodedFormEntity(nvps));*/
		
		//method 2 - json to request string
		JSONObject reqobj = new JSONObject();
		reqobj.put("name", "Gayathri");
		reqobj.put("description", "test3");
		String req= reqobj.toString();
		System.out.println(req);
		post.setEntity(new StringEntity(req));
		
		HttpResponse response = client.execute(post);
		
		System.out.println(response.getStatusLine().getStatusCode());
		
		String responseString = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
		System.out.println("response:"+responseString);
		
		JSONObject json = new JSONObject(responseString);
		Assert.assertNotNull(json.getInt("id"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
