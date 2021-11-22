package com.company.testUnits.tests;
import com.company.testUnits.Bridge;
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




    @Test
    public void createConcertWithUnknownHour_Success(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1), "ido@test.com");
        assert (concert > 0) ;
    }

    @Test
    public void createConcertWithUnknownHour_notValidTheater(){
        int concert  = bridge.addNewConcert("test" , kind_comedy, location_TLV,"UnKnown" ,
                LocalDateTime.now().plusDays(30), null, LocalDateTime.now().plusDays(20), email_tester1);
        assert  (concert == -1);

    }

    @Test
    public void createConcert_PastDate(){
        int concert1  = bridge.addNewConcert("test" , kind_comedy, location_TLV,theater_1,
                LocalDateTime.now().minusDays(10),null , LocalDateTime.now().minusDays(20), email_tester1);
        int concert2 = bridge.addNewConcert("test2" , kind_comedy, location_TLV,theater_1 ,
                LocalDateTime.now().minusDays(5), null, LocalDateTime.now().minusDays(6), email_tester1);

        assert  ((concert1 == -1)&& (concert2 == -1)) ;    }

    @Test
    public void createConcert_invalidDate(){
        int concert1  = bridge.addNewConcert("test" , kind_comedy, location_TLV,theater_1,
                LocalDateTime.now().minusDays(10), null, LocalDateTime.now().minusDays(20), email_tester1);

    }

    @Test
    public void createConcertWithUnknownHour_inValidCity(){
        assert false;

    }

    @Test
    public void orderSeatsWithUnkownHour_freeSeats(){
        List<Integer> charList =  new LinkedList<>();
        charList.add(1);
        int first  = bridge.orderSeats("ido" , "email", "0502008215"
                ,152,charList  );
        // already taken chair
        int sec  = bridge.orderSeats("ayala" , "email@gmail.com", "0502008215"
                ,152,charList  );
        assert (first != -1 ) && (sec == -1);
    }


    @Test
    public void orderSeatsWithUnkownHour_inValidPhoneNumer(){

    }

    @Test
    public void  orderSeatsWithUnkownHour_phoneNumberOutOfCountry(){
        assert false;

    }

    @Test
    public void loginValid(){
        assert false;
    }

    @Test
    public void loginWrongPassword(){
        assert false;
    }
    @Test
    public void loginNullPassword(){
        assert false;
    }
    @Test
    public void createConcertValid(){
        assert false;

    }
    @Test
    public void createConcertNegativeTicketPrice(){
        assert false;

    }



    @Test
    public void createConcertOutOfBoundTicketPrice(){
        assert false;

    }


    @Test
    public void orderSeatsRegularCutomer(){
        assert false;
    }

    @Test
    public void orderSeats_NegativeSeat(){
        assert false;
    }
    @Test
    public void orderSeatsIndexOutOfIntegerBounds(){
        assert false;
    }
    @Test
    public void approvePayment(){
        assert false;
    }

    @Test
    public void approvePayment_wrongDetails(){
        assert false;
    }

    @Test
    public void approvePayment_orderNumberOutOfIntegerBounds(){
        assert false;
    }

    @Test
    public void cancelOrder(){
        assert false;
    }

    @Test
    public void cancelOrder_invalidOrderId(){
        assert false;
    }

    @Test
    public void cancelOrder_IdOutOfIntegerBounds(){
        assert false;
    }









}
