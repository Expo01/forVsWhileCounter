package com.company;

public class Main {

    public static void main(String[] args) {
        forCounter();
        whileCounter();
    }

    public static void forCounter() {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            counter++;
            sum += i;
            System.out.println("counter is now " + counter + " with a sum of " + sum);
            if(counter == 5){
                System.out.println("first 5 values acquired. exiting for loop");
                break;
            }
        }
    }

    public static void whileCounter() {
        System.out.println("=======================");
        int counter = 0;
        int sum = 0;
        while (counter <6){
            counter++;
            sum+=counter;
            System.out.println("counter is now " + counter + " with a sum of " + sum);
            if(counter == 5){
                System.out.println("first 5 values acquired. exiting while loop");
                break;
            }
        }

    }
}
