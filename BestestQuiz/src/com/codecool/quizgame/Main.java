package com.codecool.quizgame;


public class Main {

    private static Event main = new Event();
    private static Player player = new Player();
    private static String getScore = "\n\nYour score: ";
    private static String getHealth = "Health left: ";
    private static PixelArts pixelDrawings = new PixelArts();




    public static Integer event() throws Exception{

            //initializing, getting and setting player name

            boolean answerSuccess = main.askQuestion();
            if (answerSuccess) {
                player.increaseScore();
                System.out.println(getScore + player.getScore());
                System.out.println(getHealth + player.getHealthPoint() + "\n\n");
            } else {
                player.decreaseHealthPoint();
                System.out.println(getScore + player.getScore());
                System.out.println(getHealth + player.getHealthPoint() + "\n\n");
            }
            Integer healthPoint = player.getHealthPoint();
            return healthPoint;
    }

    //main program

    public static void main(String[] args) throws Exception {

        player.getPlayerName();
        player.setHealthPoint(5);
        player.setScore(0);

        while(!event().equals(0)){
            event();
        }
        if(player.getScore() >= 5){
            System.out.println("\nYour final score: " + player.getScore() + "\n" + pixelDrawings.getObama());
            System.exit(0);
        } else {
            System.out.println("\nYour final score: " + player.getScore() + "\n");
            System.exit(0);
        }
    }
}
