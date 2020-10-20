package homework.Vehicle.Air;

import homework.Vehicle.Vehicle;

public abstract class Air extends Vehicle {
    protected double wingspan;
    protected double runwayLength;

    public Air(double power, double maxSpeed, double weight, String brand, double wingspan, double runwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    @Override
    protected double getPowerInHp() {
        return super.getPowerInHp();
    }
}
