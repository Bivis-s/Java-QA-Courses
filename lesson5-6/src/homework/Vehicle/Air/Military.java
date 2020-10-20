package homework.Vehicle.Air;

public class Military extends Air {
    protected boolean ejectionSystem;
    protected int ammunition;

    public Military(double power, double maxSpeed, double weight, String brand, double wingspan, double runwayLength, boolean ejectionSystem, int ammunition) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.ejectionSystem = ejectionSystem;
        this.ammunition = ammunition;
    }

    public String description() {
        return "Military{" +
                "ejectionSystem=" + ejectionSystem +
                ", ammunition=" + ammunition +
                ", wingspan=" + wingspan +
                ", runwayLength=" + runwayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", power in hp=" + this.getPowerInHp() +
                '}';
    }

    public String shot() {
        if (ammunition > 0) {
            ammunition--;
            return "Ракета пошла...";
        } else {
            return "Боеприпасы отсутствуют.";
        }
    }

    public String ejection() {
        if (ejectionSystem) {
            return "Катапультирование прошло успешно.";
        } else {
            return "У вас нет такой системы.";
        }
    }

}
