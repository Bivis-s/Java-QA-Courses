package homework.Vehicle.Land;

public class Truck extends Land {
    protected double carryingCapacity;

    public Truck(double power, double maxSpeed, double weight, String brand, int wheels, double totalFuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, weight, brand, wheels, totalFuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    protected double getPowerInHp() {
        return super.getPowerInHp();
    }

    public String description() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", wheels=" + wheels +
                ", fuelConsumption=" + totalFuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", power in hp=" + this.getPowerInHp() +
                '}';
    }

    public String loadCargo(double cargoWeight) {
        if (cargoWeight <= carryingCapacity) {
            return "Грузовик загружен.";
        } else {
            return "Вам нужен грузовик побольше.";
        }
    }
}
