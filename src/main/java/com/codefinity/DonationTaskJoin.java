package com.codefinity;

import java.util.concurrent.RecursiveTask;

public class DonationTaskJoin extends RecursiveTask<Long> {
    private static final int THRESHOLD = 200; // Threshold for task splitting
    private final long[] listDonations;
    private final int start;
    private final int end;

    public DonationTaskJoin(long[] listDonations, int start, int end) {
        this.listDonations = listDonations;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        //TODO: implement fork/join logic
        return null;
    }

}
