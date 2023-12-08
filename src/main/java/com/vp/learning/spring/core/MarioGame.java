package com.vp.learning.spring.core;

import org.springframework.stereotype.Component;


public class MarioGame implements Game {

    public void up(){
        System.out.println("Go jump");
    }
    public void down(){
        System.out.println("Go down");
    }
    public void left(){
        System.out.println("Turn left");
    }
    public void right(){
        System.out.println("Turn right");
    }
}