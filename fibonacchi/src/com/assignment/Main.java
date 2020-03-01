package com.assignment;

public class Main {
    public static void main(String[] args){
        Fibonacchi fibonacchi=new Fibonacchi();
        int n=20;
        for(int i=0; i<=n; i++)
            System.out.println(fibonacchi.fib(i));
    }
}