package sbt.pdris;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            TimeUnit.MINUTES.sleep(1);
            System.out.println("Hello world!");
        }
    }
}