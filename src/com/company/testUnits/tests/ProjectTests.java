package com.company.testUnits.tests;
import com.company.testUnits.Bridge;
import org.junit.Test;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public abstract class ProjectTests {
     protected Bridge bridge;




    @Test
    public void createConcertWithUnknownHour_Success(){
        int concert = bridge.addNewConcert("test" , "Comedy" , "Tel aviv" , "",
                LocalDateTime.now(),null,LocalDateTime.now().plusDays(1), "ido@test.com");
        assert concert > 0 ;
    }

    @Test
    public void createConcertWithUnknownHour_notValidTheater(){
        assert false;

    }

    @Test
    public void createConcert_PastDate(){
        assert false;
    }

    @Test
    public void createConcert_invalidDate(){
        assert false;
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
