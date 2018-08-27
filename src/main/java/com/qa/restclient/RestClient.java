package com.qa.restclient;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	//1.GET method
		public void get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpget);  // Hit the GET URL
		
		//2. Status Code
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code --->"+statusCode);
		
		//3. JSON String
		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Responce JSON from API --->"+responseJson);
		
		//4. All Headers
		Header[] headerArray = closableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		
		for(Header header : headerArray){
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array --->"+allHeaders);
		
		
		}

}
