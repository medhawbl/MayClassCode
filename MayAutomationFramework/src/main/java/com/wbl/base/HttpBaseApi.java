package com.wbl.base;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;

import com.wbl.utils.ConfigUtils;
import com.wbl.utils.Constants;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

public class HttpBaseApi {

	protected static String endpoint;
	protected static OAuthConsumer consumer;
	static Logger log = LogManager.getLogger(HttpBaseApi.class);
	protected HttpClient client = HttpClientBuilder.create().build();

	@BeforeSuite
	public void beforeSuite() {
		ConfigUtils configUtils = new ConfigUtils(Constants.RESOURCES_PROPERTIES_PATH + "configapi.properties");
		endpoint = configUtils.getProperty("qaurl");

		consumer = new CommonsHttpOAuthConsumer(configUtils.getProperty("consumerkey"),
				configUtils.getProperty("consumersecret"));

		consumer.setTokenWithSecret(configUtils.getProperty("token"),
				configUtils.getProperty("tokensecret"));

	}

	public HttpGet get(String resource) {
		HttpGet get = new HttpGet(endpoint + resource);
		try {
			consumer.sign(get);
			//basic auth
			//get.addHeader("token","tokenvalue");
		} catch (Exception e) {
			log.error("Exception in get..");
			log.error(e.getMessage());
		}
		return get;
	}

	public HttpPost post(String resource) {
		HttpPost post = new HttpPost(endpoint + resource);
		try {
			consumer.sign(post);
			//basic auth
			//post.addHeader("token","tokenvalue");
		} catch (Exception e) {
			log.error("Exception in post..");
			log.error(e.getMessage());
		}
		return post;
	}
	
	public HttpPut put(String resource) {
		HttpPut put = new HttpPut(endpoint + resource);
		try {
			consumer.sign(put);
		} catch (Exception e) {
			log.error("Exception in put..");
			log.error(e.getMessage());
		}
		return put;
	}
	
	
	public HttpDelete delete(String resource) {
		HttpDelete delete = new HttpDelete(endpoint + resource);
		try {
			consumer.sign(delete);
		} catch (Exception e) {
			log.error("Exception in delete..");
			log.error(e.getMessage());
		}
		return delete;
	}

}
