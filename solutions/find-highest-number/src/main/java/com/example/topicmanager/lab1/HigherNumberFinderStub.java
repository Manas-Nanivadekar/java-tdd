package com.example.topicmanager.lab1;

public class HigherNumberFinderStub implements IHighestNumberFinder{
    private final int answer;

    /** 
     * @param answer the value you want this stub to return every time
     */
    public HighestNumberFinderStub(int answer) {
        this.answer = answer;
    }

    @Override
    public int findHighestNumber(int[] ignored) {
        return answer;          // no real logic – that’s what makes it a stub
    }
}
