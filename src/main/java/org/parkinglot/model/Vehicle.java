package org.parkinglot.model;

import lombok.Getter;
import org.parkinglot.util.VehicleType;

@Getter
public class Vehicle {
    private String registrationNumber;
    private String color;
    private VehicleType vehicleType;

    public Vehicle(String registrationNumber, String color, VehicleType vehicleType){
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }
}
