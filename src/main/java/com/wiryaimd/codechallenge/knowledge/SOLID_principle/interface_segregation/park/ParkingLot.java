package com.wiryaimd.codechallenge.knowledge.SOLID_principle.interface_segregation.park;

import com.wiryaimd.codechallenge.knowledge.SOLID_principle.interface_segregation.park.free.FreeParkingLot;
import com.wiryaimd.codechallenge.knowledge.SOLID_principle.interface_segregation.park.paid.PaidParkingLot;

public interface ParkingLot extends FreeParkingLot, PaidParkingLot {

    void parkCar();
    void unparkCar();
    void getCapacity();

}
