package lld.designpatterns.strategydesignpattern.driveStrategy;

import lld.designpatterns.strategydesignpattern.driveStrategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("DriveStrategy: Normal");
    }
}
