package com.hibernate.proxy_example;

public class ProxyMain {

    public static void main(String[] args) {

        Student first = new Student("Vlad");

        System.out.println(first);

        Student second = new Student("Rost");

        System.out.println(second);

        System.out.println(first);
        System.out.println(second);

        first.setName("Great Vlad");


        System.out.println(first);
        System.out.println(second);
    }
}
