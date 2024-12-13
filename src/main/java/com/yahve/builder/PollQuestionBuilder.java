package com.yahve.builder;

import com.yahve.entity.PollQuestion;
import java.util.ArrayList;
import java.util.List;

public class PollQuestionBuilder {
    private PollBuilder pollBuilder;
    private String title;
    private int minAnswers = 0;
    private int maxAnswers = 1;
    private List<String> answers = new ArrayList<>();

    public PollQuestionBuilder(PollBuilder pollBuilder, String title) {
        this.pollBuilder = pollBuilder;
        this.title = title;
    }

    public PollQuestionBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PollQuestionBuilder withMinAnswers(int minAnswers) {
        this.minAnswers = minAnswers;
        return this;
    }

    public PollQuestionBuilder withMaxAnswers(int maxAnswers) {
        this.maxAnswers = maxAnswers;
        return this;
    }

    public PollQuestionBuilder withAnswerVariant(String answerVariant) {
        this.answers.add(answerVariant);
        return this;
    }

    public PollBuilder and() {
        PollQuestion question = new PollQuestion(title, minAnswers, maxAnswers, answers);
        pollBuilder.addQuestion(question);
        return pollBuilder;
    }

    public PollQuestion build() {
        return new PollQuestion(title, minAnswers, maxAnswers, answers);
    }
}
