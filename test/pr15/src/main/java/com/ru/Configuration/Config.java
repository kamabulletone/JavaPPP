package com.ru.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class Config {

  @Bean
   public HikariDataSource dataSource() {
       HikariConfig config = new HikariConfig();
       config.setDriverClassName("com.mysql.jdbc.Driver"); //org.postgresql.Driver
      config.setJdbcUrl("jdbc:mysql://localhost:3306/java?useSSL=false"); //postgresql://10.10.10.142:5432/backtosch
      config.setSchema("public");
      config.setUsername("root"); //lvovtr
      config.setPassword("Kamabulletone"); //Tjed_913
      return new HikariDataSource(config);
  }

   @Bean
   public LocalSessionFactoryBean factoryBean(DataSource
                                                       dataSource) {

       LocalSessionFactoryBean sessionFactoryBean = new
               LocalSessionFactoryBean();
       sessionFactoryBean.setDataSource(dataSource);

       sessionFactoryBean.setPackagesToScan("com.ru");

       Properties properties = new Properties();
       properties.setProperty("hibernate.dialect",
              "org.hibernate.dialect.MySQLDialect"); // org.hibernate.dialect.PostgreSQLDialect
       sessionFactoryBean.setHibernateProperties(properties);
        return sessionFactoryBean;
   }

   @Bean
    public PlatformTransactionManager
    platformTransactionManager(LocalSessionFactoryBean factoryBean){
       HibernateTransactionManager transactionManager = new
               HibernateTransactionManager();
        transactionManager.setSessionFactory(factoryBean.getObject());
      return transactionManager;
    }
}
