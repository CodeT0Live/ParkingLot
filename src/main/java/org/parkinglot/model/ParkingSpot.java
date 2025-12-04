package org.parkinglot.model;

import lombok.Getter;
import org.parkinglot.util.ParkingSpotType;
import org.parkinglot.util.VehicleType;

@Getter
public class ParkingSpot {

    private final int id;
    private final ParkingSpotType spotType;
    private boolean isAvailable = true;
    private Vehicle currentVehicle;

    public  ParkingSpot(int parkingSpotId, ParkingSpotType spotType){
        this.id = parkingSpotId;
        this.spotType = spotType;
    }

    public void assignVehicle(Vehicle vehicle){
        this.currentVehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle(){
        this.currentVehicle = null;
        this.isAvailable = true;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        VehicleType vehicleType =  vehicle.getVehicleType();
        return vehicleType.fits(this.spotType);
    }
}
