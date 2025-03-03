package practice.springboot.cache.redis.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import practice.springboot.cache.redis.dao.CityRepository;

/**
 * @author kevin.lv
 * @date 2024/12/23 16:41
 */
@Component
public class CityHandler  {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityHandler.class);

    @Autowired
    private RedisTemplate redisTemplate;

    private final CityRepository cityRepository;

    @Autowired
    public CityHandler(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }






}
