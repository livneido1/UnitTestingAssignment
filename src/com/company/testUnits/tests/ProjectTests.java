package com.company.testUnits.tests;
import com.company.testUnits.Bridge;
import com.company.testUnits.impl.Proxy;
import org.junit.Before;
import org.junit.Test;



import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public abstract class ProjectTests {
    protected Bridge bridge;
    private String email_tester1 = "Test@gmail.com";
    private String email_tester2 = "Test2@gmail.com";
    private String name_tester1 =  "tester1";
    private String name_tester2 =  "tester2";
    private String password_tester2 = "aA0987654321";
    private String password_tester1  = "123456789Aa";
    private String phoneNumber_tester1 = "0501234567";
    private String phoneNumber_tester2  = "0521234568";
    private String kind_comedy = "Comedy";
    private String kind_Ballet = "Ballet";
    private String location_TLV = "Tel Aviv";
    private String location_Netanya = "Netanya";
    private String theater_1 = "1";
    private String theater_2 = "2";
    private LocalTime hour_1 = LocalTime.of(1,30);

    private String name_salesMan = "sales";
    private String email_salesMan = "sales@gmail.com";
    private String password_salesMan = "bB1234567890";
    private String  phoneNumber_salesMan = "0549876543";


    public ProjectTests(){
        this.bridge= new Proxy();
    }

    @Test
    public void createConcertWithUnknownHour_Success(){
        int x = 3;
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1), 1,"ido@test.com");
        assert (concert > 0) ;
    }

    @Test
    public void createConcertWithUnknownHour_notValidTheater(){
        int concert  = bridge.addNewConcert("test" , kind_comedy, location_TLV,"UnKnown" ,
                LocalDateTime.now().plusDays(30), null, LocalDateTime.now().plusDays(20), 1,email_tester1);
        assert  (concert == -1);

    }

    @Test
    public void createConcert_PastDate(){
        int concert1  = bridge.addNewConcert("test" , kind_comedy, location_TLV,theater_1,
                LocalDateTime.now().minusDays(10),null , LocalDateTime.now().minusDays(20),1, email_tester1);
        int concert2 = bridge.addNewConcert("test2" , kind_comedy, location_TLV,theater_1 ,
                LocalDateTime.now().minusDays(5), null, LocalDateTime.now().minusDays(6), 1,email_tester1);

        assert  ((concert1 == -1)&& (concert2 == -1)) ;    }

    @Test
    public void createConcert_invalidDate(){
        int concert1  = bridge.addNewConcert("test" , kind_comedy, location_TLV,theater_1,
                LocalDateTime.now().minusDays(10), null, LocalDateTime.now().minusDays(20), 1,email_tester1);
        assert ( concert1 == -1);
    }

    @Test
    public void createConcertWithUnknownHour_inValidCity(){
        int concert1  = bridge.addNewConcert("test" , kind_comedy, "Mars",theater_1,
                LocalDateTime.now().minusDays(10), null, LocalDateTime.now().minusDays(20),1, email_tester1);
        assert ( concert1 == -1);

    }

    @Test
    public void orderSeatsWithUnknownHour_freeSeats(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1),1, "ido@test.com");

        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int orderID = bridge.orderSeats(name_tester1,email_tester1,phoneNumber_tester1,1, seats);
        assert (orderID != -1);
    }


    @Test
    public void orderSeatsWithUnkownHour_inValidPhoneNumer(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1),1, "ido@test.com");

        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int orderID = bridge.orderSeats(name_tester1,email_tester1,"0589a!3$123",1, seats);
        assert (orderID != -1);
    }

    @Test
    public void  orderSeatsWithUnkownHour_phoneNumberOutOfCountry(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1), 1,"ido@test.com");

        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int orderID = bridge.orderSeats(name_tester1,email_tester1,"+902200821512",1, seats);
        assert (orderID != -1);
    }

    @Test
    public void loginValid(){
        int userID = bridge.login(email_tester1,password_tester1);
        assert (userID != 1);
    }

    @Test
    public void loginWrongPassword(){
        int userID = bridge.login(email_tester1,password_tester1 + "!");
        assert (userID == -1);
    }
    @Test
    public void loginNullPassword(){
        int userID = bridge.login(email_tester1,null);
        assert (userID == -1);
    }
    @Test
    public void createConcertValid(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1),1, "ido@test.com");
        assert (concert > 0) ;

    }
    @Test
    public void createConcertNegativeTicketPrice(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1), -1,"ido@test.com");
        assert (concert ==-1) ;

    }



    @Test
    public void createConcertOutOfBoundTicketPrice(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1), Integer.MAX_VALUE +1,"ido@test.com");
        assert (concert ==-1) ;

    }


    @Test
    public void orderSeatsRegularCustomer(){
        createConcertValid();
        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int orderID = bridge.orderSeats(name_tester2,null,phoneNumber_tester2,1, seats);
        assert (orderID != -1);
    }

    @Test
    public void orderSeats_NegativeSeat(){
        createValidConcert();
        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(-1);
        int orderID = bridge.orderSeats(name_tester2,null,phoneNumber_tester2,1, seats);
        assert (orderID == -1);
    }
    @Test
    public void orderSeatsIndexOutOfIntegerBounds(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1), 1,"ido@test.com");

        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(Integer.MAX_VALUE+1);
        int orderID = bridge.orderSeats(name_tester2,null,phoneNumber_tester2,1, seats);
        assert (orderID != -1);
    }
    @Test
    public void approvePayment(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1), 1,"ido@test.com");

        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int orderID = bridge.orderSeats(name_tester2,null,phoneNumber_tester2,1, seats);

        assert bridge.approvePayment(email_salesMan,orderID);
    }

    @Test
    public void approvePayment_wrongDetails(){
        int orderID = orderValidSeats();
        assert ! (bridge.approvePayment(email_salesMan, -3));
    }

    @Test
    public void approvePayment_orderNumberOutOfIntegerBounds(){
        assert (!bridge.approvePayment ( "ayala@gmail.com", Integer.MAX_VALUE + 1 ));
    }

    @Test
    public void cancelOrder(){
        int concert_id = createValidConcert ();
        List<Integer> seats = new LinkedList<> (  );
        seats.add ( 8 );
        int order_id = bridge.orderSeats ( "Ayala", "ayala@gmail.com", "0501112223", concert_id, seats);
        assert (bridge.cancelOrder ( order_id ));
    }

    @Test
    public void cancelOrder_invalidOrderId(){
        assert (bridge.cancelOrder ( 99 ));
    }

    @Test
    public void cancelOrder_IdOutOfIntegerBounds(){
        assert (bridge.cancelOrder ( Integer.MAX_VALUE + 1 ));
    }


    private int createValidConcert(){
        return bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),LocalTime.of(17,30),LocalDateTime.now().plusDays(1), 1,"ido@test.com");

    }

    private int orderValidSeats(){
        LinkedList<Integer> seats = new LinkedList<>();
        seats.add(1);
        int concert = createValidConcert();
        return bridge.orderSeats(name_tester1,email_tester1,phoneNumber_tester1,concert, seats);
    }









}
