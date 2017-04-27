package com.codecool.quizgame;

import java.util.Scanner;

/**
 * Created by Bence on 2017. 04. 22..
 */

public class Event {


    public boolean askQuestion() throws Exception{

        boolean answerSuccess;
        QuestionsAnswer event = new QuestionsAnswer();
        String question = event.questionGenerator();
        String answer = event.answerGenerator();
        String option = event.optionGenerator();

        System.out.println(question + "\n");
        System.out.println(option + "\n");

        Scanner playerInput = new Scanner(System.in);
        String playerAnswer = playerInput.nextLine();

        if (playerAnswer.equals(answer)){
            answerSuccess = true;
        } else {
            answerSuccess = false;
        }
        return answerSuccess;
    }
}
