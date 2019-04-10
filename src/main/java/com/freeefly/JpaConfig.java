//package com.freeefly;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//@Lazy
//@EnableJpaRepositories(basePackages = "com.freeefly.webflux.repository")
//@EnableTransactionManagement
//public class JpaConfig {
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//
//        vendorAdapter.setDatabase(Database.MYSQL);
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(jpaDataSource());
//        em.setPackagesToScan("com.freeefly.webflux.model");
//        em.setJpaVendorAdapter(vendorAdapter);
//
//        return em;
//    }
//
//    @Bean(name = "jpaDataSource")
//    @Qualifier(value = "jpaDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource jpaDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager (EntityManagerFactory emf){
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf);
//
//        return transactionManager;
//    }
//
//}
