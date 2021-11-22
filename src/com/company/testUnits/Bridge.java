package com.company.testUnits;


import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

public interface Bridge {

        public int addNewConcert
                (String concertName, String kind, String Location, String Theater,LocalDateTime date,
                 LocalDateTime hour, LocalDateTime lastOrderDate, String userEmail);

        public int approvePayment(String userEmail, int order_id, Boolean approved);

        public int userOrderChairs(String userEmail, int concertId, List<Integer> charis);

        public int orderChair(String name , String email, String phoneNumber, int concertId,
                              List<Integer> chairs);

        public int login(String email, String password);
        public void cancelOrder(int orderId);
}
