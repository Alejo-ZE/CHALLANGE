package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;

public class LevelFourCategory extends Category{

    private Integer points = 4;
    private Integer level = 4;

    public LevelFourCategory(List<Question> questionList) {
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
