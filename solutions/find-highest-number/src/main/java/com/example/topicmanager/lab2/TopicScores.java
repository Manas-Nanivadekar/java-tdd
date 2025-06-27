package com.example.topicmanager.lab2;

public class TopicScores {
    private String topicName;
    private int[] scores;

    public TopicScores(String topicName, int[] scores) {
        this.topicName = topicName;
        this.scores = scores;
    }

    public String getTopicName() {
        return topicName;
    }

    public int[] getScores() {
        return scores;
    }
}
