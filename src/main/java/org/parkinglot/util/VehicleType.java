package org.parkinglot.util;

import java.util.EnumSet;
import java.util.Set;

public enum VehicleType {

    MOTORCYCLE(ParkingSpotType.MOTORCYCLE, ParkingSpotType.SMALL, ParkingSpotType.MEDIUM, ParkingSpotType.LARGE),
    CAR(ParkingSpotType.SMALL, ParkingSpotType.MEDIUM),
    TRUCK(ParkingSpotType.LARGE);

    private final Set<ParkingSpotType> allowedSpots;

    VehicleType(ParkingSpotType... allowed) {
        this.allowedSpots = EnumSet.copyOf(Set.of(allowed));
    }

    public boolean fits(ParkingSpotType spot) {
        return allowedSpots.contains(spot);
    }
}
