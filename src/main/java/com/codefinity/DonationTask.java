package com.codefinity;

import java.util.concurrent.RecursiveTask;

public class DonationTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 200; // Threshold for task splitting
    private final long[] listDonations;
    private final int start;
    private final int end;

    public DonationTask(long[] listDonations, int start, int end) {
        this.listDonations = listDonations;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        //implement fork/join logic
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += listDonations[i];
            }
            return sum;
        }
        else {
            int mid = (start + end) / 2;
            DonationTask leftTask = new DonationTask(listDonations, start, mid);
            DonationTask rightTask = new DonationTask(listDonations, mid, end);

            rightTask.fork();
            leftTask.fork();

            long righResult = rightTask.join();
            long leftResult = leftTask.join();

            return righResult + leftResult;

        }
    }

}
