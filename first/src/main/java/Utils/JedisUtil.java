package Utils;

import redis.clients.jedis.Jedis;

public class JedisUtil {

    public void test(){
        //link redis
        Jedis jedis = new Jedis("127.0.0.7",6379);
        //opration redis
        jedis.set("name","zq");
        //close connection
        jedis.close();
    }
}
