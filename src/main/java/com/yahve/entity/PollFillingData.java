package com.yahve.entity;

import java.util.List;

public class PollFillingData {
    private String username;
    private List<PollQuestionResponse> responses;

    public PollFillingData(String username, List<PollQuestionResponse> responses) {
        this.username = username;
        this.responses = responses;
    }
}
