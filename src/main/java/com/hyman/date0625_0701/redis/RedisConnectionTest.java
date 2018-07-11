package com.hyman.date0625_0701.redis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @program: javalearning
 * @Date: 2018/6/26 15:16
 * @Author: hyman.hu
 * @Description: 测试类
 */
public class RedisConnectionTest {
    private RedisConnection redisConnection;

    @Before
    public void before() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //设置 redis 连接池最大连接数量
        jedisPoolConfig.setMaxTotal(50);
        //设置 redis 连接池最大空闲连接数量
        jedisPoolConfig.setMaxIdle(10);
        //设置 redis 连接池最小空闲连接数量
        jedisPoolConfig.setMinIdle(1);
        redisConnection = RedisConnection.newBuilder()
                .withIp("127.0.0.1")
                .withPort(6379)
                .withTimeOut(30000)
                .withClientName(Thread.currentThread().getName())
                .builder();
    }

    @Test
    public void testPutGet() {
        Jedis jedis = redisConnection.getJedis();
        try {
            jedis.select(1);
            jedis.set("name","grace");
            System.out.println("获取的Name："+jedis.get("name"));
            Assert.assertTrue("grace".equals(jedis.get("name")));
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
