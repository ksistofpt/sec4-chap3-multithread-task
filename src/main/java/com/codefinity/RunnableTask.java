package com.codefinity;

import java.util.concurrent.ForkJoinPool;

public class RunnableTask {
    public static void main(String[] args) {
        long[] listDonation = new long[1000]; // Example array
        for (int i = 0; i < listDonation.length; i++) {
            listDonation[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        DonationTask task = new DonationTask(listDonation, 0, listDonation.length);
        long result = pool.invoke(task); // Start the task and get the result

        System.out.println("Sum: " + result); // Print the result
    }
}
