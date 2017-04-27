package com.codecool.quizgame;

import java.util.Scanner;

/**
 * Created by Bence on 2017. 04. 22..
 */

public class Player {

    private String name;
    private Integer healthPoint;
    private Integer score;
    private static PixelArts pixelDrawings = new PixelArts();

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) { this.score = score; }

    // functions for health point and score

    public void decreaseHealthPoint(){
        healthPoint--;
    }

    public void increaseScore(){
        score++;
    }

    public void getPlayerName() {
        Scanner playerName = new Scanner(System.in);
        Player newPlayer = new Player();
        System.out.println(pixelDrawings.getPattern() +
                "\n\nCan I have your name?\n");
        newPlayer.setName(playerName.nextLine());
        System.out.println("\n\nWelcome " + newPlayer.getName() + "!");
        System.out.println("You got 5 health. Each well answered question worth 1 score.\n\n\n");
    }
}
