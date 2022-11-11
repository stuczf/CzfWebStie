package com.chat_room.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 11:42
 * @Description:
 */
@Configuration
public class MapperFactoryConfig {

    @Bean
    public MapperFactory getFactory () {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        return mapperFactory;
    }
}
