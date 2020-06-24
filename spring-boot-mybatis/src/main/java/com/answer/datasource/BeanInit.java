package com.answer.datasource;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInit {

    @Bean(value = "paranetDataSource")
    public DataSource initDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDefaultAutoCommit(true);
        dataSource.setMaxWait(1000);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(180);
        dataSource.setConnectionProperties("clientEncoding=UTF-8");
        dataSource.setValidationQuery("select 1");
        dataSource.setValidationInterval(30000);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestWhileIdle(true);
        dataSource.setTimeBetweenEvictionRunsMillis(10000);
        dataSource.setMinEvictableIdleTimeMillis(6000);
        dataSource.setLogAbandoned(false);

        return dataSource;
    }
}
