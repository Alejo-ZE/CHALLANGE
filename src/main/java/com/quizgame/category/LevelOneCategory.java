package com.quizgame.category;

import com.quizgame.question.Question;
import java.util.List;

public class LevelOneCategory extends Category{

    private Integer points = 1;
    private Integer level = 1;

    public LevelOneCategory(List<Question> questionList) {
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
