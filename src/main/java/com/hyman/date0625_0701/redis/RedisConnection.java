package com.hyman.date0625_0701.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @program: javalearning
 * @Date: 2018/6/26 14:58
 * @Author: hyman.hu
 * @Description: 创建连接类
 */
public class RedisConnection {
    /**
     * redis 连接池配置信息
     */
    private JedisPoolConfig jedisPoolConfig;
    /**
     * redis 服务器地址
     */
    private String ip;

    /**
     * redis 服务器端口
     */
    private Integer port;

    /**
     * redis 服务器密码
     */
    private String pwd;

    /**
     * redis 服务器连接超时时间
     */
    private Integer timeOut;

    /**
     * redis 连接客户端名称
     */
    private String clientName = null;

    private JedisPool jedisPool;

    /**
     * builder类
     */
    public static class RedisConnectionBuilder {
        private final RedisConnection instance;

        public RedisConnectionBuilder() {
            instance = new RedisConnection();
        }

        public RedisConnectionBuilder withJedisPoolConfig(JedisPoolConfig jedisPoolConfig) {
            instance.jedisPoolConfig = jedisPoolConfig;
            return this;
        }

        public RedisConnectionBuilder withIp(String ip) {
            instance.ip = ip;
            return this;
        }

        public RedisConnectionBuilder withPort(Integer port) {
            instance.port = port;
            return this;
        }

        public RedisConnectionBuilder withPwd(String pwd) {
            instance.pwd = pwd;
            return this;
        }

        public RedisConnectionBuilder withTimeOut(Integer timeOut) {
            instance.timeOut = timeOut;
            return this;
        }

        public RedisConnectionBuilder withClientName(String clientName) {
            instance.clientName = clientName;
            return this;
        }

        public RedisConnection builder() {
            return instance;
        }

    }

    public static RedisConnectionBuilder newBuilder() {
        return new RedisConnectionBuilder();
    }

    /**
     * 创建 连接
     */
    private void buildConnection() {
        if (jedisPool == null) {
            if (jedisPoolConfig == null) {
                jedisPool = new JedisPool(new JedisPoolConfig(), ip, port, timeOut, pwd, 0, clientName);
            } else {
                jedisPool = new JedisPool(jedisPoolConfig, ip, port, timeOut, pwd, 0, clientName);
            }
        }
    }

    /**
     * 获取 Redis客户端
     * @return Redis客户端
     */
    public Jedis getJedis() {
        buildConnection();
        if (jedisPool != null) {
            return jedisPool.getResource();
        }
        return null;
    }

    public JedisPoolConfig getJedisPoolConfig() {
        return jedisPoolConfig;
    }

    public String getIp() {
        return ip;
    }

    public Integer getPort() {
        return port;
    }

    public String getPwd() {
        return pwd;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "RedisConnection{" +
                "jedisPoolConfig=" + jedisPoolConfig +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", pwd='" + pwd + '\'' +
                ", timeOut=" + timeOut +
                ", clientName='" + clientName + '\'' +
                ", jedisPool=" + jedisPool +
                '}';
    }
}
