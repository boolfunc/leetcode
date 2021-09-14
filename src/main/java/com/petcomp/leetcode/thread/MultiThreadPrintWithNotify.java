package com.petcomp.leetcode.thread;

public class MultiThreadPrintWithNotify {

    private int times;

    private int state = 0;

    private Object lock = new Object();

    public MultiThreadPrintWithNotify(int times){
        this.times = times;
    }

    public static void main(String[] args) {

        MultiThreadPrintWithNotify thread = new MultiThreadPrintWithNotify(3);

        new Thread(()->{
            thread.printWord("B", 1);
        }).start();
        new Thread(()->{
            thread.printWord("C", 2);
        }).start();
        new Thread(()->{
            thread.printWord("A", 0);
        }).start();
    }

    private void printWord(String word, int order){

        for(int i = 0; i < times;){
            synchronized (lock){
                if (state % 3 != order){

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    System.out.println(word);
                    i++;
                    state++;
                    lock.notifyAll();
                }
            }


        }

    }
}
