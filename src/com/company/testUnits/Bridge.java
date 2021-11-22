package com.company.testUnits;


import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface Bridge {

        public int addNewConcert
                (String concertName, String kind, String Location, String Theater, LocalDateTime date,
                 LocalTime hour, LocalDateTime lastOrderDate, String userEmail);

        public int approvePayment(String userEmail, int order_id, Boolean approved);

        public int orderSeats(String name , String email, String phoneNumber, int concertId,
                              List<Integer> chairs);

        public int login(String email, String password);
        public void cancelOrder(int orderId);
}
