package util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

public class HttpClientUtil {

	/**
	 * Post请求
	 * @param url 请求地址
	 */
	public String httpPost(String url) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	HttpPost httpPost = new HttpPost(url);
        	 StringEntity requestEntity = new StringEntity("{'name':'张三'}","utf-8");  
             requestEntity.setContentEncoding("UTF-8");                
             httpPost.setHeader("Content-type", "application/json");  
             httpPost.setEntity(requestEntity);  
            CloseableHttpResponse response = httpclient.execute(httpPost);
            try {
            	int statusCode = response.getStatusLine().getStatusCode();
            	if (statusCode != 200) {
            		//换成log打印
            		System.out.println("创建Http连接失败,HTTP Status："+statusCode+"失败接口："+url);
            	}
            	String responseResult = EntityUtils.toString(response.getEntity());
                System.out.println(responseResult);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
		return null;
    }
	
	
	public static void main(String[] args) throws Exception {
		HttpClientUtil httpClient = new HttpClientUtil();
		httpClient.httpPost("http://127.0.0.1:8080/test-3/Httptest1");
	}
}
