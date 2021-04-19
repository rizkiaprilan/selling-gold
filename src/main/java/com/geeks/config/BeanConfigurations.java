package com.geeks.config;

import com.geeks.bean.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.geeks.bean"})
public class BeanConfigurations {

    @Bean
    public Customer user(){
        return new Customer("Rizki Aprilan","riskiazza@gmail.com", "082170725072");
    }
}
