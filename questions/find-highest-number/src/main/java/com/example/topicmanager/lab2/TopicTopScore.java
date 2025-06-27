package com.example.topicmanager.lab2;

public class TopicTopScore {
    private String topicName;
    private int topScore;

    public TopicTopScore(String topicName, int score) {
        this.topScore = score;
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

    public int getTopScore() {
        return topScore;
    }

    @Override
    public boolean equals(Object anObject) {
        TopicTopScore rh = (TopicTopScore) anObject;

        return (topicName.equalsIgnoreCase(rh.topicName) && (topScore == rh.topScore));
    }
}