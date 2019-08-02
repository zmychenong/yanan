package io.renren;

import javax.xml.ws.WebServiceException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.utils.RedisUtils;
import io.renren.common.utils.SingleAGV;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void contextLoads() {
        /*SysUserEntity user = new SysUserEntity();
        user.setEmail("123456@qq.com");
        redisUtils.set("user", user);

        System.out.println(ToStringBuilder.reflectionToString(redisUtils.get("user", SysUserEntity.class)));*/
    	
    	/*Jedis jedis = JedisUtil.getJedis();
		jedis.set("agvOrderList", "吴航");
		jedis.expire("agvOrderList", 60);
		JedisUtil.close(jedis);*/
    	
    	try {
			AGVSIServiceForView agv = SingleAGV.getAgvTarget();
			agv.getAllCompany();
		} catch (WebServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
