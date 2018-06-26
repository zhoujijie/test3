package com.test.convert;

import java.io.IOException;

import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
public class JsonNullToEmptyConvert extends AbstractHttpMessageConverter<JSONObject>{

	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected JSONObject readInternal(Class<? extends JSONObject> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		System.out.println(1);
		return null;
	}

	@Override
	protected void writeInternal(JSONObject t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		System.out.println(1);
	}

	

}
