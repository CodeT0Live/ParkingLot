package org.parkinglot.model;

import org.parkinglot.model.Vehicle;

import java.time.LocalDateTime;

public class ParkingTicket {

    private final String registrationNumber;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private final String id;
    private final int parkingSpotId;


    public ParkingTicket(String ticketId, int parkingSpot, String registrationNumber, LocalDateTime entryTime){
        this.registrationNumber = registrationNumber;
        this.entryTime = entryTime;
        this.id = ticketId;
        this.parkingSpotId = parkingSpot;
    }
}
