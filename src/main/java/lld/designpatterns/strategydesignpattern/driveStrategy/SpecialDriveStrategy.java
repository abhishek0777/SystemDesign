package lld.designpatterns.strategydesignpattern.driveStrategy;

import lld.designpatterns.strategydesignpattern.driveStrategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("DriveStrategy: Special");
    }
}
