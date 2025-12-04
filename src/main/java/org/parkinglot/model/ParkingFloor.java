package org.parkinglot.model;

import org.parkinglot.util.ParkingSpotType;

import java.util.concurrent.ThreadLocalRandom;

public class ParkingFloor {

    private int floorNumber;
    private int numberOfSpots;
    private ParkingSpot[] parkingSpots;

    public ParkingFloor(int floorNumber, int numberOfSpots){
        this.floorNumber = floorNumber;
        this.numberOfSpots = numberOfSpots;
        this.parkingSpots = createSpots(numberOfSpots);
    }

    private ParkingSpot[] createSpots(int numberOfSpots){
        ParkingSpot[] spots = new ParkingSpot[numberOfSpots];
        for(int i=0; i< spots.length; i++){
            spots[i] = new ParkingSpot(i, getRandomSpotType());
        }
        return  spots;
    }

    private ParkingSpotType getRandomSpotType(){
        ParkingSpotType[] types = ParkingSpotType.values();
        return types[ThreadLocalRandom.current().nextInt(types.length)];
    }
}
