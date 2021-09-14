package com.petcomp.leetcode.thread;

import java.util.concurrent.Semaphore;

public class MultiThreadPrintSem {

    private int times = 0;
    private int state = 0;

    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);

    public MultiThreadPrintSem(int times){
        this.times = times;
    }

    private void printWord(String word, Semaphore current, Semaphore next){

        for(int i = 0; i < times; i++){

            try {
                current.acquire();
                System.out.println(word);
                next.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadPrintSem thread = new MultiThreadPrintSem(3);

        new Thread(()->{
            thread.printWord("B", thread.semaphoreB, thread.semaphoreC);
        }).start();

        new Thread(()->{
            thread.printWord("A", thread.semaphoreA, thread.semaphoreB);
        }).start();

        new Thread(()->{
            thread.printWord("C", thread.semaphoreC, thread.semaphoreA);
        }).start();
    }
}
