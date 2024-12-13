package com.yahve.entity;

import java.util.List;

public class PollQuestionResponse {
    private PollQuestion pollQuestion;
    private List<String> selectedVariants;

    public PollQuestionResponse(PollQuestion pollQuestion, List<String> selectedVariants) {
        this.pollQuestion = pollQuestion;
        this.selectedVariants = selectedVariants;
    }
}
