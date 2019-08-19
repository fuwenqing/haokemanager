package cn.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("cn.haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {
}