package com.adnan.java8_9_11.Java_21.VirtualThreads2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable r = ()-> System.out.println("Using virtual thread");
//        Thread.Builder t1 = Thread.ofVirtual().name("worker-1");
//        Thread t = t1.start(r);
//        System.out.println("Virtual thread name is: "+t.getName());
//        //we will be waiting for virtual threads to get complete.
//        t.join();
//        System.out.println("Current thread is: "+Thread.currentThread().getName());
//
//        System.out.println("Main completed");

        for (int i=0;i<10;i++){
            try(ExecutorService ex = Executors.newVirtualThreadPerTaskExecutor()){
                Future<?> future = ex.submit(()-> System.out.println("Hello from virtual threads"));
                future.get();
                System.out.println("program number: "+ (i+1) + " completed");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
/*
Virtual Threads improves throughput of program we will get high throughput means it computes more tasks
in very less time and by task i mean Input output bound tasks and not CPU Bound tasks.
article to read : https://medium.com/@aravindcsebe/virtual-threads-in-java-21-a-deep-dive-into-lightweight-concurrency-c1743e7dbe04
 */
