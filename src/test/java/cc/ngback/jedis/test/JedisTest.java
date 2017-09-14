package cc.ngback.jedis.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class JedisTest {
	@Resource  //自动注入,默认按名称  
    private JedisPool jedisPool;
	  
	@Test
	public void testJedisSingle() {
		// 创建一个jedis的对象。
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		// 调用jedis对象的方法，方法名称和redis的命令一致。
		jedis.set("key1", "jedis test");
		String string = jedis.get("key1");
		System.out.println(string);
		// 关闭jedis。
		jedis.close();
	}

	/**
	 * 使用连接池
	 */
	@Test
	public void testJedisPool() {
		// 创建jedis连接池
		JedisPool pool = new JedisPool("127.0.0.1", 6379);
		// 从连接池中获得Jedis对象
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		// 关闭jedis对象
		jedis.close();
		pool.close();
	}

	/**
	 * 测试spring配置jedis
	 */
	@Test
	public void testSpringJedisPool() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
		Jedis jedis = pool.getResource();
		jedis.set("key1", "chen");
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
	}
	
	@Test
	public void testSpringJedisPool2() throws Exception {
		Jedis jedis = jedisPool.getResource();
		jedis.set("key1", "chen");
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		jedisPool.close();
	}

}
