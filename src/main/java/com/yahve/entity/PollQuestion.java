package com.yahve.entity;

import java.util.List;

public class PollQuestion {
    private String title;
    private int minAnswers;
    private int maxAnswers;
    private List<String> answers;

    public PollQuestion(String title, int minAnswers, int maxAnswers, List<String> answers) {
        this.title = title;
        this.minAnswers = minAnswers;
        this.maxAnswers = maxAnswers;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question: " + title + "\nMin Answers: " + minAnswers + ", Max Answers: " + maxAnswers + "\nOptions: " + answers + "\n";
    }
}
