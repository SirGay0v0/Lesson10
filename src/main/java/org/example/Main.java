package org.example;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("myTread");
        MyThread mt1 = new MyThread("Child#1");
        MyThread mt2 = new MyThread("Child#2");

        Thread thread = new Thread(myThread);
        thread.start();

        Thread thread2 = new Thread(mt1);
        thread2.start();

        Thread thread3 = new Thread(mt2);
        thread3.start();


        do {
            System.out.print(".");
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while ((thread.isAlive()) || thread2.isAlive() || thread3.isAlive());
        System.out.println("Главный поток завершен.");
    }
}