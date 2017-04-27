package com.codecool.quizgame;

//importing

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;


/*
 * Created by Bence on 2017. 04. 22..
 */

public class QuestionsAnswer {

    //initialize and declaring

    private static Random rand = new Random();
    private static String questionPath = "/Users/Bence/Projects/java-se-extra-practice-with-worklog-gbencus/BestestQuiz/src/com/codecool/quizgame/questions.txt";
    private static String answersPath = "/Users/Bence/Projects/java-se-extra-practice-with-worklog-gbencus/BestestQuiz/src/com/codecool/quizgame/answers.txt";
    private static String optionsPath = "/Users/Bence/Projects/java-se-extra-practice-with-worklog-gbencus/BestestQuiz/src/com/codecool/quizgame/options.txt";
    private static Integer randomNum;
    private static String randomQuestion = "";
    private static String randomAnswer = "";
    private static String option = "";
    public static Integer rndNmb = randomNumberGen();


    //generates a number using the length of the questions and answers given in the txt files

    public static Integer randomNumberGen() {

        Integer i;
        Integer minimum = 0;
        Integer maximum = 1;

        for (i = 0; i < maximum; i++) {
            randomNum = minimum + rand.nextInt((maximum - minimum));
        }
        return randomNum;
    }


    //selects a random question form question.txt

    public static String questionGenerator() throws Exception {

        FileReader file = new FileReader(questionPath);
        BufferedReader reader = new BufferedReader(file);
        String questionText = "";
        String line = reader.readLine();

        while (line != null) {
            questionText += line;
            line = reader.readLine();
        }

        String[] questions = questionText.split(",");
        randomQuestion = (questions[rndNmb]);
        return randomQuestion;
    }


    //selects a random answer form answers.txt

    public static String answerGenerator() throws Exception {

        FileReader file = new FileReader(answersPath);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String answerText = "";

        while (line != null) {
            answerText += line;
            line = reader.readLine();
        }

        String[] answers = answerText.split(",");
        randomAnswer = (answers[rndNmb]);
        return randomAnswer;
    }


    //selects the options for the given question form the options.txt

    public static String optionGenerator() throws Exception {

        FileReader file = new FileReader(optionsPath);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String optionText = "";

        while (line != null) {
            optionText += line;
            line = reader.readLine();
        }

        String[] options = optionText.split(",");
        option = (options[rndNmb]);
        return option;

    }

}
