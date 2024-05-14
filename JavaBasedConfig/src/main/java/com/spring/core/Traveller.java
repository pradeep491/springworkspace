package com.spring.core;

public class Traveller {
    //Car car = null;
    //Bike b = null;
    //Cycle c = null;
private Vehicle vehicle;
    /*public Traveller() {
        //this.car = new Car();
        //this.b = new Bike();
        //this.c = new Cycle();
    }*/
    public Traveller(Vehicle v){
        this.vehicle = v;
    }

    public void startJourney() {
        //this.car.move();
        //this.b.move();
        //this.c.move();
        this.vehicle.move();
    }
}
