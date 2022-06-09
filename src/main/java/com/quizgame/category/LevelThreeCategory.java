package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;

public class LevelThreeCategory extends Category{

    private Integer points = 3;
    private Integer level = 3;

    public LevelThreeCategory(List<Question> questionList) {
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
