package com.company.testUnits;


import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

public interface Bridge {

        public int addNewConcert
                (String concertName, String kind, String Location, String Theater,LocalDateTime date,
                 Time hour, LocalDateTime lastOrderDate, User currentUser);

        public int approvePayment(String userId, Order order, Boolean approved);

        public int userOrderChairs(User currentUser, Concert concert, List<Integer> charirs);

        public int orderChair(String name , String email, String phoneNumber, Concert concert,
                              List<Integer> chairs);

        public User login(String email, String password);

}
