package com.vp.learning.spring.core1;

import org.springframework.stereotype.Component;

@Component
public class ZoombieGame implements Game {
    public void up(){
        System.out.println("Go forward");
    }
    public void down(){
        System.out.println("Go back");
    }
    public void left(){
        System.out.println("Go left");
    }
    public void right(){
        System.out.println("Go right");
    }

}
