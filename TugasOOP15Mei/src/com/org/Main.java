package com.org;

public class Main {
    public static void main(String[] args) {
        // package 1
        com.org.package1.Car car = new com.org.package1.Car();
        car.starterInstruction();

        // package 2
        com.org.package2.Car car2 = new com.org.package2.Car();
        car2.starterInstruction();
    }
}