package zad5;

public class SensorTest {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor(25.5);
        System.out.println("TemperatureSensor value: " + tempSensor.readValue());
        System.out.println("TemperatureSensor status: " + tempSensor.getStatus());
        tempSensor.reset();
        System.out.println("TemperatureSensor value after reset: " + tempSensor.readValue());
        System.out.println("TemperatureSensor status after reset: " + tempSensor.getStatus());

        Sensor pressureSensor = new PressureSensor(1.2);
        System.out.println("PressureSensor value: " + pressureSensor.readValue());
        System.out.println("PressureSensor status: " + pressureSensor.getStatus());
        pressureSensor.reset();
        System.out.println("PressureSensor value after reset: " + pressureSensor.readValue());
        System.out.println("PressureSensor status after reset: " + pressureSensor.getStatus());
    }
}
