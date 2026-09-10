package Ticket_Reservation;

import static Ticket_Reservation.Seat.*;

public class Cancel_tkt {

    public void Cancel_ticket1(int SeatNumber){

        try{
            if (SeatNumber < 1 || SeatNumber > 10){
                throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                        "YOU SHOULD ENTER A VALID SEAT NUMBER");
            }
        } catch (OutOfSeatsExpection e) {
            System.out.println(e.getMessage());
            System.exit(0);
            return;
        }

        if(Available1[SeatNumber - 1]){

            System.out.println("SEAT NOT BOOOKED ... PLEASE SELECT THE BOOKED SEAT");

            return;
        }

        else{
            System.out.println("CANCELLING SEAT....");
            try{
                Thread.sleep(1000);
                System.out.println("SEAT CANCELLED SUCCESSFULLY...!!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Available1[SeatNumber - 1] = true;
        }

    }

    public void Cancel_ticket2(int SeatNumber){

        try{
            if (SeatNumber < 1 || SeatNumber > 10){
                throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                        "YOU SHOULD ENTER A VALID SEAT NUMBER");
            }
        } catch (OutOfSeatsExpection e) {
            System.out.println(e.getMessage());
            System.exit(0);
            return;
        }

        if(Available2[SeatNumber - 1]){

            System.out.println("SEAT NOT BOOOKED ... PLEASE SELECT THE BOOKED SEAT");

            return;
        }
        else{
            System.out.println("CANCELLING SEAT....");
            try{
                Thread.sleep(1000);
                System.out.println("SEAT CANCELLED SUCCESSFULLY...!!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Available2[SeatNumber - 1] = true;
        }

    }

    public void Cancel_ticket3(int SeatNumber){

        try{
            if (SeatNumber < 1 || SeatNumber > 10){
                throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                        "YOU SHOULD ENTER A VALID SEAT NUMBER");
            }
        } catch (OutOfSeatsExpection e) {
            System.out.println(e.getMessage());
            System.exit(0);
            return;
        }

        if(Available3[SeatNumber - 1]){

            System.out.println("SEAT NOT BOOOKED ... PLEASE SELECT THE BOOKED SEAT");

            return;
        }

        else{
            System.out.println("CANCELLING SEAT....");
            try{
                Thread.sleep(1000);
                System.out.println("SEAT CANCELLED SUCCESSFULLY...!!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Available3[SeatNumber - 1] = true;
        }

    }

}
