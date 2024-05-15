package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="addrs")
    public Address address(){
        return new Address();
    }
    @Bean(name="studentBean",initMethod = "init",destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}
