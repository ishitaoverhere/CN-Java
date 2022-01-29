package Assignment7_Concurency_Multi_Threading.Question1;

import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.InterruptedException;

class Consumer implements Runnable {
    Stock c;
    Thread t;

    Consumer(Stock c) {
        this.c = c;
        t = new Thread(this, " producer thread");
        t.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c.getStock((int) (Math.random() * 100));
        }
    }

    void stop() {
        t.stop();
    }
}

class Producer implements Runnable {
    Stock s;
    Thread t;

    Producer(Stock s) {
        this.s = s;
        t = new Thread(this, "producer thread");
        t.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.addStock((int) (Math.random() * 100));
        }
    }

    void stop() {
        t.stop();
    }
}

class Stock {
    int goods = 0;

    public synchronized void addStock(int i) {
        goods = goods + i;
        System.out.println("Stock added :" + i);
        System.out.println("present stock :" + goods);
        notify();
    }

    public synchronized void getStock(int j) {
        while (true) {
            if (goods >= j) {
                goods = goods - j;
                System.out.println("Stock taken away :" + j);
                System.out.println("Present stock :" + goods);
                break;
            } else {
                System.out.println("Stock not enough …");
                System.out.println(" Waiting for stocks to come …");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } // end of while
    }

    public static void main(String[] args) {
        Stock j = new Stock();
        Producer p = new Producer(j);
        Consumer c = new Consumer(j);
        try {
            Thread.sleep(10000);
            p.stop();
            c.stop();
            p.t.join();
            c.t.join();
            System.out.println("Thread stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
