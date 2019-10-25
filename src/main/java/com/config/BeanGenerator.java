package com.config;

import com.entity.LoanTypes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {

    @Bean
    public LoanTypes getLoanTypeObj(){
        return new LoanTypes();
    }
}
