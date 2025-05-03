package lld.designpatterns.strategydesignpattern.vehicle;

import lld.designpatterns.strategydesignpattern.driveStrategy.NormalDriveStrategy;
import lld.designpatterns.strategydesignpattern.vehicle.Vehicle;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
