package com.test.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		System.out.println("连接成功");
		jedis.set("a", "RedisTest");
		System.out.println(jedis.get("a"));
	}

}
