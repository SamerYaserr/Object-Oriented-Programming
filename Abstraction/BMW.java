public class BMW extends Car {

    public BMW() {}

    public BMW(int maxSpeed, float height, float weight, int numbersOfWheels) {
        super(maxSpeed, height, weight, numbersOfWheels);
    }

    @Override
    void autoPilot() {
        System.out.println("BMW autoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("BMW streamingServices");
    }

    @Override
    void parkingSensors() {
        System.out.println("BMW parkingSensors");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}