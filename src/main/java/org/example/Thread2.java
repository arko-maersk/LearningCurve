package org.example;

class test extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Hi "+ Thread.currentThread().getName());}
    }
}
class test2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Hey "+ Thread.currentThread().getName());
        }
    }
}
class test3 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Using Runnable "+ Thread.currentThread().getName());
        }
    }
}
public class Thread2 {

    public static void main(String[] args) {
        var test1=new test();
        var test11=new test2();
        var test2=new test3();
        var tr=new Thread(test2);
        test1.start();
//        test1.setPriority(10);
        test11.start();

        try{tr.setDaemon(true);
            tr.start();}
        catch(Exception e){
            System.out.println(e);
        }

        var test3=new Runnable(){

            @Override
            public void run() {
                for(int i=0;i<100;i++){
                System.out.println("Implementing Runnable without defining any class :"+ Thread.currentThread().getName());}
            }
        };
//        test3.run();
    var obj2=new Thread(test3);
    obj2.start();
        obj2.setPriority(10);


    }
}
//Even if we set priority and do stuff, there's no complete control over a thread.
//Ways to control a thread:-
//1. Thread.setPriority()
//2. Thread.sleep();

//Understanding a demon Thread:-
//A daemon thread is a thread that runs in the background and does not prevent the Java Virtual Machine (JVM)
// from exiting when all non-daemon threads in Java have been completed. -- Thread with the lowest priority\

//We cannot set the main thread as a demon thread. JVM simply ignores this stuff

