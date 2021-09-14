package com.petcomp.leetcode.thread;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadPrint {

    private Lock lock = new ReentrantLock();

    private int state = 0;

    private int times = 0;

    public MultiThreadPrint(int times){
        this.times = times;
    }

    public void print(String word, int order){

        for(int i = 0; i < times; ){

            try {
                lock.lock();
                if (state % 3 == order){
                    System.out.println(word);
                    state++;
                    i++;
                }

            }finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) throws IOException {

        MultiThreadPrint print = new MultiThreadPrint(3);

        new Thread(()->{
            print.print("C", 2);
        }).start();
        new Thread(()->{
                print.print("A", 0);
        }).start();

        new Thread(()->{
            print.print("B", 1);
        }).start();

//        System.in.read();
    }
}
