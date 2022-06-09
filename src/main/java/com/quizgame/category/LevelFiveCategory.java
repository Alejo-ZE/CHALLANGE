package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;

public class LevelFiveCategory extends Category{

    private Integer points = 5;
    private Integer level = 5;

    public LevelFiveCategory(List<Question> questionList) {
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
