package com.spring.core;

public class Client {
    public static void main(String[] args) {

        Vehicle v = new Bike();
        Traveller t = new Traveller(v);
        t.startJourney();
    }
}
