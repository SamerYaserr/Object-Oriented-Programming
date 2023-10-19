public abstract class Car {

    private int maxSpeed;
    private float height;
    private float weight;
    private int numbersOfWheels;

    public Car() {}

    public Car(int maxSpeed, float height, float weight, int numbersOfWheels) {

        this.maxSpeed = maxSpeed;
        this.height = height;
        this.weight = weight;
        this.numbersOfWheels = numbersOfWheels;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }

    public void setNumbersOfWheels(int numbersOfWheels) {
        this.numbersOfWheels = numbersOfWheels;
    }

    abstract void autoPilot();

    abstract void streamingServices();

    abstract void parkingSensors();

    public String toString() {
        return "Cars{" +
                "maxSpeed=" + maxSpeed +
                ", height=" + height +
                ", weight=" + weight +
                ", numbersOfWheels=" + numbersOfWheels +
                '}';
    }
}