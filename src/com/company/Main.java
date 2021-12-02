package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(walk(25, 15));
        System.out.println(walk(15, 25));
        System.out.println(walk(50, 20));
        System.out.println(walk(30, 40));
        System.out.println(walk(20, 20));
    }

    public static String walk(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if(age > 45 && temp > -10 && temp < 25){
            return "Можно идти гулять";
        } else {
             return "Оставайтесь дома";
        }
    }
}