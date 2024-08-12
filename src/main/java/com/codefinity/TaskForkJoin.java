package com.codefinity;

import java.util.concurrent.RecursiveTask;

public class TaskForkJoin extends RecursiveTask<Long> {
    private static final int THRESHOLD = 200; // Threshold for task splitting
    private final long[] array;
    private final int start;
    private final int end;

    public TaskForkJoin(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        //TODO: implement fork/join logic
        return null;
    }

}
