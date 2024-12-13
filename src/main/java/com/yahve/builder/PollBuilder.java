package com.yahve.builder;

import com.yahve.entity.Poll;
import com.yahve.entity.PollQuestion;
import java.util.ArrayList;
import java.util.List;

public class PollBuilder {
    private String pollName;
    private List<PollQuestion> pollQuestionList = new ArrayList<>();

    public PollBuilder withPollName(String pollName) {
        this.pollName = pollName;
        return this;
    }

    public PollQuestionBuilder pollQuestion(String title) {
        return new PollQuestionBuilder(this, title);
    }

    public PollQuestionBuilder oneVariantPollQuestion(String title) {
        return new PollQuestionBuilder(this, title).withMinAnswers(1).withMaxAnswers(1);
    }

    public PollBuilder yesNoPollQuestion(String title) {
        PollQuestion yesNoQuestion = new PollQuestionBuilder(this, title)
                .withMinAnswers(1)
                .withMaxAnswers(1)
                .withAnswerVariant("Yes")
                .withAnswerVariant("No")
                .build();
        this.pollQuestionList.add(yesNoQuestion);
        return this;
    }

    public Poll build() {
        return new Poll(pollName, pollQuestionList);
    }

    public void addQuestion(PollQuestion question) {
        pollQuestionList.add(question);
    }
}
