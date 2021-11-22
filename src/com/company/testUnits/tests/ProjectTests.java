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
                LocalDateTime.now(),null,LocalDateTime.now(), "ido@test.com");
        assert concert > 0 ;
    }

    @Test
    public void createConcertWithUnknownHour_Failure(){
        assert false;
    }

    @Test
    public void orderConcertWithUnkownHour_freeChair(){
        List<Integer> charList =  new LinkedList<>();
        charList.add(1);
        int first  = bridge.orderChair("ido" , "email", "0502008215"
                ,152,charList  );

        assert (first != -1 ) ;
    }


    @Test
    public void orderConcertWithUnkownHour_ChairNotFree(){
        List<Integer> charList =  new LinkedList<>();
        charList.add(1);
        int first  = bridge.orderChair("ido" , "email", "0502008215"
                ,152,charList  );
        int sec  = bridge.orderChair("ayala" , "email@gmail.com", "0502008215"
                ,152,charList  );
        assert (first != -1 ) && (sec == -1);
    }

    @Test
    public void orderConcertWithUnkownHour_wrongInsertedData(){
        assert false;

    }

    @Test
    public void createConcertValidUser(){
        assert false;

    }
    @Test
    public void createConcertInValidUser(){
        assert false;

    }



    @Test
    public void createConcertNegativePrice(){
        assert false;

    }

    @Test
    public void createConcertNonNegativePrice(){
        assert false;

    }

    @Test
    public void createTwoConcertsSameTimeSameTheater(){
        assert false;

    }
    @Test
    public void createTwoConcertSuccess(){
        assert false;

    }

    @Test
    public void approvePayment_statusChanged(){
        assert false;

    }

    @Test
    public void paymentNotApproved(){
        assert false;

    }

    @Test
    public void userOrderChair_VIPChair_VipUser(){
        assert false;

    }

    @Test
    public void userOrderChair_VIPChair_NotVipUser(){
        assert false;

    }

    @Test
    public void login_invalidField(){
        assert false;

    }


    @Test
    public void orderChairs_outOfIndex(){
        assert false;

    }
    @Test
    public void orderChairs_valid(){
        assert false;

    }






}
