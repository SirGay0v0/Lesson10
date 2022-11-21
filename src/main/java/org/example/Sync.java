package org.example;

public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThread1 myThread1 = new MyThread1("Поток1", a);
        MyThread1 myThread2 = new MyThread1("Поток2", a);
    }
}
