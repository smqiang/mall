package com.sima.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
* MyBatis配置类
* */
@Configuration
@MapperScan({"com.sima.mall.mbg.mapper","com.sima.mall.dao"})
public class MyBatisConfig {
}
