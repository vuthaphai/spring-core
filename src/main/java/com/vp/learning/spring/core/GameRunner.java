package com.vp.learning.spring.core;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//    private ZoombieGame game;

//    private MarioGame game;
    private Game game;

    public GameRunner(Game game){
        this.game = game;
    }

    public void moveUp() {
        game.up();
    }

    public void moveDown() {
        game.down();
    }

    public void moveLeft() {
        game.left();
    }

    public void moveRight() {
        game.right();
    }


}
