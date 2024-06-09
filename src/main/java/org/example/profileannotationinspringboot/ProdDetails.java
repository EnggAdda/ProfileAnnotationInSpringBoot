package org.example.profileannotationinspringboot;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDetails {

    @Value("${user.name}")
    private String userName;

    @Value("${user.password}")
    private String password;

    @Value("${env.name}")
    private String environment;

    @PostConstruct
    public void init(){
        String str  = String.format("Getting the details of Prod Environment where username : %s , password : %s ,environment : %s " , userName, password, environment);
        System.out.println(str);
    }
}
