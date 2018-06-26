package com.test.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class HttpClientUtil {

	/**
	 * Post请求，传递json字符串参数
	 * Content-type 默认为 application/json
	 * @param url 请求地址
	 * @param jsonString json字符串           
	 */
	public static String httpPostJson(String url, String jsonString) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String responseResult = null;
		try {
			HttpPost httpPost = new HttpPost(url);
			StringEntity requestEntity = new StringEntity(jsonString, "utf-8");
			httpPost.setHeader("Content-type", "application/json");
			httpPost.setEntity(requestEntity);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode != 200) {
					// 换成log打印
					System.out.println("创建Http连接失败,HTTP Status：" + statusCode + "失败接口：" + url);
				}
				responseResult = EntityUtils.toString(response.getEntity());
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
		return responseResult;
	}
	
	
	/**
	 * Post请求，表单提交方式
	 * Content-type 默认为 application/x-www-form-urlencoded
	 * @param url 请求地址
	 * @param param 请求参数,参数形式："name=张三&age=20"          
	 */
	public static String httpPostForm(String url, String param) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String responseResult = null;
		try {
			HttpPost httpPost = new HttpPost(url);
			StringEntity requestEntity = new StringEntity(param, "utf-8");
			httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
			httpPost.setEntity(requestEntity);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode != 200) {
					// 换成log打印
					System.out.println("创建Http连接失败,HTTP Status：" + statusCode + "失败接口：" + url);
				}
				responseResult = EntityUtils.toString(response.getEntity());
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
		return responseResult;
	}
	
	
	/**
	 * Post请求
	 * @param url 请求地址
	 * @param param 请求参数
	 * @param contentType 内容类型         
	 */
	public static String httpPost(String url, String param, String contentType) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String responseResult = null;
		try {
			HttpPost httpPost = new HttpPost(url);
			StringEntity requestEntity = new StringEntity(param, "utf-8");
			httpPost.setHeader("Content-type", contentType);
			httpPost.setEntity(requestEntity);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode != 200) {
					// 换成log打印
					System.out.println("创建Http连接失败,HTTP Status：" + statusCode + "失败接口：" + url);
				}
				responseResult = EntityUtils.toString(response.getEntity());
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
		return responseResult;
	}

	
	@Test
	public void testHttpPostJson() throws Exception {
		String url = "http://127.0.0.1:8080/test-3/Httptest1";
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 1);
		jsonObject.put("msg", "成功");
		String httpPostJson = HttpClientUtil.httpPostJson(url,jsonObject.toJSONString());
		System.out.println(httpPostJson);
	}
	
	@Test
	public void testHttpPost() throws Exception {
		String url = "http://127.0.0.1:8080/test-3/Httptest";
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("age", 1);
		jsonObject.put("name", "成功");
		String contentType = "application/x-www-form-urlencoded";
		String httpPostJson = HttpClientUtil.httpPostForm(url, "name=张三&age=20");
		System.out.println(httpPostJson);
	}
}
