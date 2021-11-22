package com.company.testUnits.impl;

import com.company.testUnits.Bridge;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

public class Proxy implements Bridge {

    @Override
    public int addNewConcert(String concertName, String kind, String Location,
                             String Theater, LocalDateTime date, LocalTime hour,
                             LocalDateTime lastOrderDate, double price, String userEmail) {
        return 0;
    }

    @Override
    public Boolean approvePayment(String userEmail, int order_id) {
        return false;
    }


    @Override
    public int orderSeats(String name, String email, String phoneNumber, int concertId, List<Integer> chairs) {
        return 0;
    }


    @Override
    public int login(String email, String password) {
        return 0;
    }

    @Override
    public void cancelOrder(int orderId) {
    }
}
