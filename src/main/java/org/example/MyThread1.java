package org.example;

public class MyThread1 implements Runnable {
    Thread thread;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    public MyThread1(String name, int[] nums) {
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }


    @Override
    public void run() {
        int sum;
        System.out.println(thread.getName() + " starting ");

        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Result for thread " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating");
    }
}
