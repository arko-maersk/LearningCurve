package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            var thread = new MultiThread(i);
            System.out.println(thread.getState());
            thread.start();
            System.out.println(thread.getState());
        }


    }
}