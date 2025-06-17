package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conceptandcoding.learningspringboot.dto.OfflineOrder;
import com.conceptandcoding.learningspringboot.dto.OnlineOrder;
import com.conceptandcoding.learningspringboot.dto.OrderInterface;
import com.conceptandcoding.learningspringboot.dto.UserDetails;

@Configuration
public class AppConfig {

    @Bean
    public UserDetails createUserBean() {
        return new UserDetails("defaultusername", "defaultemail");
    }

    @Bean
    public UserDetails createAnotherUserBean() {
        return new UserDetails("anotherusername", "anotheremail");
    }

    @Bean
    public OrderInterface createOrderBean(@Value("${isOnlineOrder}") boolean isOnlineOrder) {
        if(isOnlineOrder) {
            return new OnlineOrder();
        } else {
            return new OfflineOrder();
        }
    }
}
