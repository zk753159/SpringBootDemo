package com.zkk.study.redis;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;



@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration {
	
	@Bean
	public Jedis jedis(RedisProperties redisProperties) {
		return new Jedis(redisProperties.getHost(),redisProperties.getPort());
	}

}
