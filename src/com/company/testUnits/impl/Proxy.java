package com.company.testUnits.impl;

import com.company.testUnits.Bridge;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

public class Proxy implements Bridge {

    @Override
    public int addNewConcert(String concertName, String kind, String Location, String Theater, LocalDateTime date, LocalDateTime hour, LocalDateTime lastOrderDate, String userEmail) {
        return 0;
    }

    @Override
    public int approvePayment(String userEmail, int order_id, Boolean approved) {
        return 0;
    }

    @Override
    public int userOrderChairs(String userEmail, int concertId, List<Integer> charis) {
        return 0;
    }

    @Override
    public int orderChair(String name, String email, String phoneNumber, int concertId, List<Integer> chairs) {
        return 0;
    }

    @Override
    public int login(String email, String password) {
        return 0;
    }
}
