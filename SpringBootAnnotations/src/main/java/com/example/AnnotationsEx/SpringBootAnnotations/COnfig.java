package com.example.AnnotationsEx.SpringBootAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class COnfig {
     @Bean
    public College collegeBean(){
         return new College();
     }
     /*The @Bean annotation is used to indicate that a
     method instantiates, configures, and initializes a new object to be managed by the Spring IoC container. */
     @Bean
     public Student student(){
         return new Student();
     }
}
