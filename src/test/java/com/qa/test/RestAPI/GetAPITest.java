package com.qa.test.RestAPI;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.restclient.RestClient;
import com.qa.testbase.TestBase;

public class GetAPITest extends TestBase {
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	


	@BeforeMethod
	public void setUp(){
		testBase = new TestBase();
		serviceUrl = prop.getProperty("serviceurl");
		apiUrl = prop.getProperty("apiurl");
		
		url= serviceUrl + apiUrl;
		
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException{
		restClient = new RestClient();
		restClient.get(url);
	}

}
