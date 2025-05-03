package lld.designpatterns.strategydesignpattern.vehicle;

import lld.designpatterns.strategydesignpattern.driveStrategy.SpecialDriveStrategy;
import lld.designpatterns.strategydesignpattern.vehicle.Vehicle;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
