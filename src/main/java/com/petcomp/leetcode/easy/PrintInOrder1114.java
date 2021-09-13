package com.petcomp.leetcode.easy;

import java.util.concurrent.Semaphore;

public class PrintInOrder1114 {

    public static void main(String[] args) {

        Foo foo = new Foo();
        try {
            foo.first(new PrintThread1());
            foo.third(new PrintThread3());
            foo.second(new PrintThread2());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintThread1 implements Runnable{

    @Override
    public void run() {
        System.out.print("first");
    }
}


class PrintThread2 implements Runnable{

    @Override
    public void run() {
        System.out.print("second");
    }
}


class PrintThread3 implements Runnable{

    @Override
    public void run() {
        System.out.print("third");
    }
}

class Foo {

    public Semaphore semFirst = new Semaphore(0);
    public Semaphore semSecond = new Semaphore(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.

        printFirst.run();
        semFirst.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.


        semFirst.acquire();
        printSecond.run();
        semSecond.release();

    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.

        semSecond.acquire();
        printThird.run();
        semSecond.release();
    }
}