package com.vp.learning.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vp.learning.spring.core")
public class Config {

   @Bean
   public Game game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner runner(Game game) {
       return new GameRunner(game);
    }

}
