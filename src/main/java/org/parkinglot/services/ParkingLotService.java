package org.parkinglot.services;

import org.parkinglot.model.ParkingFloor;

public class ParkingLotService {
    private static volatile ParkingLotService instance;
    private ParkingFloor[] parkingFloors;
    private String name;
    private String address;

    private ParkingLotService(){
        this.name = "ABC-ParkingLot";
        this.address ="ABD";
        this.parkingFloors = new ParkingFloor[5];

        for(int floorNumber = 0; floorNumber < this.parkingFloors.length; floorNumber++){
            ParkingFloor parkingFloor = new ParkingFloor(floorNumber, 100);
            this.parkingFloors[floorNumber] = parkingFloor;
        }
    }

    public static  ParkingLotService getInstance(){

        if(ParkingLotService.instance != null){
            return ParkingLotService.instance;
        }

        ParkingLotService.instance = new ParkingLotService();
        return ParkingLotService.instance;
    }

//    public ParkingTicket parkVehicle(String registrationNumber, String color, long entryTime){
////        ParkingTicket ticket = new ParkingTicket(registrationNumber, color, entryTime);
//    }
//
    public void unparkVehicle(String ticketNumber)
}
