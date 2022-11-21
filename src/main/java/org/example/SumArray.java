package org.example;

public class SumArray {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Имя потока " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        return sum;
    }
}
