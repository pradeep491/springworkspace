package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DataSource mySQLDataSOurce(){
        return new MySQLDataSource();
    }
    @Bean
    public DataSource postgreSQLDatasource(){
        return new PostgreSQLDatasource();
    }
    @Bean
    public EmailService emailService(){
        return new EmailService(mySQLDataSOurce());
    }
}
