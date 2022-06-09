package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;

public class LevelTwoCategory extends Category{

    private Integer points = 2;
    private Integer level = 2;

    public LevelTwoCategory(List<Question> questionList) {
        super(questionList);
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public Integer getLevel() {
        return level;
    }
}
