package lld.designpatterns.strategydesignpattern.vehicle;

import lld.designpatterns.strategydesignpattern.driveStrategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
}
