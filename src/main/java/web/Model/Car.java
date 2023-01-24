package web.Model;

import org.springframework.stereotype.Component;


public class Car {

    private String driver;
    private String model;
    private String registrationNumber;

    public Car(String driver, String model, String registrationNumber) {
        this.driver = driver;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    @Override
    public String toString() {
        return "Car{" +
                "driver='" + driver + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
