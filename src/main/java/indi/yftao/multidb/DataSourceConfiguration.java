package indi.yftao.multidb;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

/**
 * @descriptionn:
 * @author: yftao
 * @create: 2018-06-29 14:54
 **/
@Configuration
public class DataSourceConfiguration {

    @Bean(name = "userDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSourceProperties userDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 创建user表所在数据库wizard的DataSource
     * @param userDataSourceProperties
     * @return
     */
    @Bean(name = "userDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSource userDataSource(DataSourceProperties userDataSourceProperties) {
        return userDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "bookDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSourceProperties bookDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 创建book表所在数据库multi_db的DataSource
     * @param bookDataSourceProperties
     * @return
     */
    @Primary
    @Bean(name = "bookDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSource bookDataSource(DataSourceProperties bookDataSourceProperties) {
        return bookDataSourceProperties.initializeDataSourceBuilder().build();
    }

}
