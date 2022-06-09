package com.quizgame.question;

import java.util.List;

public class Question {

    private String question;
    private List<Answer> answerList;

    public Question(String question, List<Answer> answerList) {
        this.question = question;
        this.answerList = answerList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public Integer printQuestion() {
        Integer correct = 0;

        System.out.println(question);

        for(int i=0; i < answerList.size(); i++) {
            System.out.println(i+1 + ") "+answerList.get(i).getAnswer());
            if(answerList.get(i).isCorrect()) {
                correct = i+1;
            }
        }

        System.out.println("\nSi desea salir, escriba 'salir'.");
        System.out.print("Ingrese su respuesta correcta: ");

        return correct;
    }
}
