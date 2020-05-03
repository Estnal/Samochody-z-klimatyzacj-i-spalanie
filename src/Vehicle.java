public class Vehicle {
    private String carName;
    private double tankCapacity;
    private double averageFuelOn100km;

    public Vehicle(String carName, double tankCapacity, double averageFuelOn100km) {
        this.carName = carName;
        this.tankCapacity = tankCapacity;
        this.averageFuelOn100km = averageFuelOn100km;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelOn100km() {
        return averageFuelOn100km;
    }

    public void setAverageFuelOn100km(double averageFuelOn100km) {
        this.averageFuelOn100km = averageFuelOn100km;
    }
}
