package com.example.topicmanager.lab1;

import com.example.findhighestnumber.HighestNumberFinder;
import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TopicManagerTest {

    @Test // S1
    void emptyInput_returnsEmptyList() {
        TopicManager cut = new TopicManager(new HighestNumberFinder());
        assertThat(cut.findTopicHighScores(new ArrayList<>()), is(empty()));
    }

    @Disabled("Enable after S1 green") // S2
    @Test
    void oneTopic_returnsOneTopScore() {
        /* build spec */ }

    @Disabled("Enable after S2 green") // S3
    @Test
    void twoTopics_returnsTwoTopScores() {
        /* build spec */ }

    @Disabled("Enable after S3 green") // S4
    @Test
    void threeTopics_returnsThreeTopScores() {
        /* build spec */ }
}