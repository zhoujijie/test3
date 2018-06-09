package util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClientUtil {

	
	
	public static void main(String[] args) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://127.0.0.1:8080/test-3/Httptest");
		try {
			CloseableHttpResponse execute = httpClient.execute(httpGet);
			StatusLine statusLine = execute.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			HttpEntity entity = execute.getEntity();
			String string = entity.getContent().toString();
			
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
