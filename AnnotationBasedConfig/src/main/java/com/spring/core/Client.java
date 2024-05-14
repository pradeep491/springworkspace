package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.move();

        Bike bike = context.getBean(Bike.class);
        bike.move();

        Cycle cycle = context.getBean(Cycle.class);
        cycle.move();

        Traveller traveller = context.getBean(Traveller.class);
        traveller.startJourney();
    }
}
