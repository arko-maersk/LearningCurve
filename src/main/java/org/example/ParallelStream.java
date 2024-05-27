package org.example;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        System.out.println("Comparing between parallel stream and normal");

        long start=System.currentTimeMillis();
        IntStream.range(0,1000).forEach(System.out::print);
        long end=System.currentTimeMillis();

        System.out.println();
        System.out.println("Time taken: "+(end-start));
        System.out.println();


        start=System.currentTimeMillis();
        IntStream.range(0,1000).parallel().forEach(System.out::print);
        end=System.currentTimeMillis();

        System.out.println();
        System.out.println("Time taken: "+(end-start));
        System.out.println();
    }
}
