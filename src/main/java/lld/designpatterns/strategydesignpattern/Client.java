package lld.designpatterns.strategydesignpattern;

import lld.designpatterns.strategydesignpattern.vehicle.NormalVehicle;
import lld.designpatterns.strategydesignpattern.vehicle.OffRoadVehicle;
import lld.designpatterns.strategydesignpattern.vehicle.SportsVehicle;
import lld.designpatterns.strategydesignpattern.vehicle.Vehicle;

/**
 * Strategy design pattern is useful to avoid duplicate code in child classes.
 * In this example, subclasses extends Vehicle which has its own driveStrategy like normal and special.
 * In such cases where each subclasses write same code for same strategy, its better to follow reusability technique.
 * Create DriveStrategy interface and create concrete classes,  and while creating vehicle objects, provide driveStrategy in constructor while initializing Vehicle object
 */


public class Client {
    public static void main(String[] args){
        Vehicle offRoadCar = new OffRoadVehicle();
        offRoadCar.driveStrategy.drive();
        Vehicle normalCar = new NormalVehicle();
        normalCar.driveStrategy.drive();
        Vehicle sportsCar = new SportsVehicle();
        sportsCar.driveStrategy.drive();
    }
}
