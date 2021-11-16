package com.company.testUnits.impl;

import com.company.testUnits.Bridge;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

public class Proxy implements Bridge {
    @Override
    public int addNewConcert(String concertName, String kind, String Location, String Theater, LocalDateTime date, Time hour, LocalDateTime lastOrderDate, User currentUser) {
        return 0;
    }

    @Override
    public int approvePayment(String userId, Order order, Boolean approved) {
        return 0;
    }

    @Override
    public int userOrderChairs(User currentUser, Concert concert, List<Integer> charirs) {
        return 0;
    }

    @Override
    public int orderChair(String name, String email, String phoneNumber, Concert concert, List<Integer> chairs) {
        return 0;
    }

    @Override
    public int login(String email, String password) {
        return 0;
    }
}
