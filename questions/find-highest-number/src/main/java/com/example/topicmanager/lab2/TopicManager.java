package com.example.topicmanager.lab2;

import com.example.findhighestnumber.IHighestNumberFinder;
import java.util.ArrayList;

class TopicManager {

    private final IHighestNumberFinder highestNumberFinder;

    public TopicManager(IHighestNumberFinder hnf) {
        this.highestNumberFinder = hnf;
    }

    // Implement this via tdd
    ArrayList<TopicTopScore> findTopicHighScores(ArrayList<TopicScores> array) {
        throw new UnsupportedOperationException("Implement me in QLC-2.1");
    }
}