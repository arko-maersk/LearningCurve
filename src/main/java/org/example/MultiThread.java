package org.example;


//Nothing here just learning about threads.
public class MultiThread extends Thread{
private  int threadNum;
public MultiThread(int threadNum) {
    this.threadNum = threadNum;
}
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i + " from thread number:- "+threadNum+" name of thread is:-"+ Thread.currentThread().getName());

        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
