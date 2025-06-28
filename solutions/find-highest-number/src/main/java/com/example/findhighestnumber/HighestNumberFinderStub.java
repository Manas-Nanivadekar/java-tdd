package com.example.findhighestnumber;

public class HighestNumberFinderStub implements IHighestNumberFinder {
    private final int[] answers;
    private int index = 0;   // tracks which answer to serve next

    public HighestNumberFinder(int... answers) {
        if (answers.length == 0)
            throw new IllegalArgumentException("Need at least one canned answer");
        this.answers = answers;
    }

    @Override
    public int findHighestNumber(int[] ignored) {
        // return answers in sequence, clamp at the last index
        int current = answers[Math.min(index, answers.length - 1)];
        index++;
        return current;
    }
}
