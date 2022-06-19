package com.wiryaimd.codechallenge.knowledge.SOLID_principle.interface_segregation.park.paid;

public interface PaidParkingLot extends HourlyFeeParkingLot, ConstantFeeparkingLot{

//    @Override
//    void countFeePerMinutes();
//
//    @Override
//    void countFeePerHours();

    void calculateFee();
    void doPayment();
}
