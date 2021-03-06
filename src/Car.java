public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String carName, double tankCapacity, double averageFuelOn100km, boolean airConditioning) {
        super(carName, tankCapacity, averageFuelOn100km);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    double carAdictionalCombustion() {
        if (isAirConditioning()) {
            return getAverageFuelOn100km() + 0.8;
        } else {
            return getAverageFuelOn100km();
        }
    }

    @Override
    public double range() {
        if (isAirConditioning()) {
            return getTankCapacity() + carAdictionalCombustion() * 100;
        } else {
            return super.range();
        }


    }

    @Override
    String getInfo() {
        return super.getInfo() + " " + airConditioning + " " + range();
    }
}
