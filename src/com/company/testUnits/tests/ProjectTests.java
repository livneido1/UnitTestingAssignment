package com.company.testUnits.tests;
import com.company.testUnits.Bridge;
import org.junit.Test;


import java.time.LocalDateTime;

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
        assert false;

    }


    @Test
    public void orderConcertWithUnkownHour_ChairNotFree(){
        assert false;

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
