package com.yahve.entity;

import com.yahve.builder.PollBuilder;
import java.util.List;

public class Poll {
    private String pollName;
    private List<PollQuestion> pollQuestionList;

    public Poll(String pollName, List<PollQuestion> pollQuestionList) {
        this.pollName = pollName;
        this.pollQuestionList = pollQuestionList;
    }

    public static PollBuilder builder() {
        return new PollBuilder();
    }

    @Override
    public String toString() {
        return "Poll: " + pollName + "\nQuestions:\n" + pollQuestionList;
    }
}
