package lld.designpatterns.strategydesignpattern.vehicle;

import lld.designpatterns.strategydesignpattern.driveStrategy.SpecialDriveStrategy;
import lld.designpatterns.strategydesignpattern.vehicle.Vehicle;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
