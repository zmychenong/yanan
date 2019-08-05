/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.common.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * jedis工具类
 * 
 * @author 吴航
 *
 */
public class JedisUtil {

	public JedisUtil() {

	}

	private static JedisPool pool;
	private static volatile Jedis jedis = null;

	static {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		// 配置最大连接数
		jedisPoolConfig.setMaxTotal(1000);
		// 配置连接池最大空闲连接数
		jedisPoolConfig.setMaxIdle(10);
		// 配置连接池阻塞最大等待时间
		jedisPoolConfig.setMaxWaitMillis(-1);
		System.out.println("最大连接数：" + jedisPoolConfig.getMaxTotal());

		pool = new JedisPool(jedisPoolConfig, "localhost");

	}

	public static Jedis getJedis() {
		/*if (jedis == null) {
			synchronized (Jedis.class) {
				if (jedis == null) {
					jedis = pool.getResource();
				}
			}
		}*/
		jedis = pool.getResource();
		return jedis;
	}

	public static void close(Jedis jedis) {
		if (jedis != null) {
			jedis.close();
		}
	}
}
