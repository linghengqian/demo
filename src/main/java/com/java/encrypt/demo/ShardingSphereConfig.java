package com.java.encrypt.demo;

import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author baosiqiang
 * @date 2024/12/11
 */
@Configuration
public class ShardingSphereConfig {
    private static final String FILE_NAME = "encrypt/encrypt-%s.yml";
    private Environment environment;

    /**
     * @return 返回当前启用的配置文件
     * @date 2024/12/12
     * @author baosiqiang
     */
    private String getEnvironment() {
        return environment.getActiveProfiles()[0];
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource shardingDataSource() throws SQLException, IOException {
        Resource datasource = new ClassPathResource(String.format(FILE_NAME, getEnvironment()));
        return YamlShardingSphereDataSourceFactory.createDataSource(datasource.getFile());
    }
}
