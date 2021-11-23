package com.company.testUnits.impl;

import com.company.testUnits.Bridge;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Proxy implements Bridge {
    Bridge real = null;

    @Override
    public int addNewConcert(String concertName, String kind, String Location,
                             String Theater, LocalDateTime date, LocalTime hour,
                             LocalDateTime lastOrderDate, double price, String userEmail) {
        if (real!= null)
            return real.addNewConcert(concertName, kind, Location,Theater, date, hour, lastOrderDate, price, userEmail);
        return 0;
    }

    @Override
    public boolean approvePayment(String userEmail, int order_id) {
        if (real != null){
            real.approvePayment(userEmail,order_id);
        }
        return true;
    }


    @Override
    public int orderSeats(String name, String email, String phoneNumber, int concertId, List<Integer> chairs) {
        if (real!= null)
        {
            real.orderSeats(name, email,phoneNumber,concertId,chairs);
        }
        return 0;
    }


    @Override
    public int login(String email, String password) {
        if (real !=null){
            real.login(email,password);
        }
        return 0;
    }

    @Override
    public boolean cancelOrder(int orderId) {

        if (real != null)
        {
            real.cancelOrder(orderId);
        }
        return true;
    }
}
