package Ticket_Reservation;

import java.util.ArrayList;
import java.util.List;

public class Available_Buses {

    public String journey;
    public String travels_name;
    public int Bus_Id;

    Available_Buses(String journey,String travels_name,int Bus_Id){
        this.journey = journey;
        this.travels_name = travels_name;
        this.Bus_Id = Bus_Id;
    }

    public static Available_Buses ab1 = new Available_Buses("HYD-BLR ::: ","CRASH TRAVELS ::: ", 100);
    public static Available_Buses ab2 = new Available_Buses("HYD-DEL ::: ","HI_JACK TRAVELS ::: ", 200);
    public static Available_Buses ab3 = new Available_Buses("HYD-MUM ::: ","911 TRAVELS ::: ", 300);


}
