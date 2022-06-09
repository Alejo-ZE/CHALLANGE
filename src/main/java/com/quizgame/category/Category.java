package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;
import java.util.Random;

public abstract class Category {
    private List<Question> questionList;
    private Random r = new Random();

    public Category(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Question randomQuestion() {
        int valorDado = r.nextInt(questionList.size());
        return questionList.get(valorDado);
    }

    abstract public Integer getPoints();

    abstract public Integer getLevel();

}
