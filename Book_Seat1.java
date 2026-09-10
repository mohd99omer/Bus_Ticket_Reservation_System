package Ticket_Reservation;
import java.util.Random;
import java.util.Scanner;

import static Ticket_Reservation.Seat.*;

public class Book_Seat1 implements Runnable{

    Random RA = new Random();

    int SeatNumber;
    String CustomerName;
    int Ticket_Id = RA.nextInt(900)+100;
    long phone;
    int bus_id;
    boolean AllSeatsBooked = true;
    int Tk_id;

    Scanner sc = new Scanner(System.in);

    public synchronized void Book(int SeatNumber, String CustomerName, long phone, int bus_id){

        this.SeatNumber = SeatNumber;
        this.CustomerName = CustomerName;
        this.phone = phone;
        this.bus_id = bus_id;

        for (boolean seats : Available1){
            if (seats){
                AllSeatsBooked = false;
            }
        }

        if (AllSeatsBooked){

            System.out.println("ALL THE SEATS ARE BOOKED.....\nTHE BUS IS FULL !!!");
            System.exit(0);
        }
    }

    @Override
    public void run() {

        int index = SeatNumber - 1;

         if (Available1[index] == true){

             System.out.println("YOUR TOTAL FARE WILL BE 1000 RUPEES ...");
             System.out.println("SELECT YOUR MODE OF PAYMENT : \n1. UPI\n2. DEBIT/CREDIT CARD");
             int pay = sc.nextInt();
             switch (pay){
                 case 1:
                     System.out.println("ENTER YOUR UPI ID :");
                     sc.nextLine();
                     String upi = sc.nextLine();
                     System.out.println("ENTER THE AMOUNT : ");
                     int upiam = sc.nextInt();
                     try{
                         if (upiam == 1000){
                             Thread.sleep(500);
                             System.out.println("PAYMENT DONE !!!");

                             try{
                                 Thread.sleep(1000);
                             } catch (InterruptedException e) {
                                 throw new RuntimeException(e);
                             }

                             System.out.println();
                             System.out.println("Seat Number : " + SeatNumber + " is Booked by " + CustomerName);
                             System.out.println("YOUR SEAT HAS BEEN CONFIRMED !!!");

                         }else {
                             throw new ArithmeticException("INCORRECT AMOUNT......");
                         }
                     } catch (Exception e) {
                         System.out.println(e.getMessage());
                         System.exit(0);
                     }
                     break;

                 case 2:
                     System.out.println("ENTER YOUR CARD NUMBER :");
                     sc.nextLine();
                     String crd = sc.nextLine();
                     System.out.println("ENTER THE AMOUNT :");
                     int crdam = sc.nextInt();
                     try{
                         if (crdam == 1000){
                             Thread.sleep(500);
                             System.out.println("PAYMENT DONE !!!");

                             try{
                                 Thread.sleep(1000);
                             } catch (InterruptedException e) {
                                 throw new RuntimeException(e);
                             }

                             System.out.println();
                             System.out.println("Seat Number : " + SeatNumber + " is Booked by " + CustomerName);
                             System.out.println("YOUR SEAT HAS BEEN CONFIRMED !!!");
                             System.out.println("TICKET ID : " + Ticket_Id );

                         }else {
                             throw new ArithmeticException("INCORRECT AMOUNT......");
                         }
                     } catch (Exception e) {
                         System.out.println(e.getMessage());
                         System.exit(0);
                     }
                     break;

                 default:
                     System.out.println("INVALID INPUT");
                     System.exit(0);

             }

            Available1[index] = false;
            System.out.println();

        }
        else {
            System.out.println("Seat Number : " + SeatNumber + " is Already Booked...");
            System.out.println("PLEASE BOOK ANOTHER SEAT....");

        }



    }

    public void Display_Ticket1(int Tk_id){
        while (true){
            try{
                if (Tk_id == Ticket_Id){
                    System.out.println("***** YOUR TICKET IS DISPLAYED BELOW *****");
                    System.out.println();

                    try{
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("***** YOUR TICKET IS DISPLAYED BELOW *****");
                    System.out.println();

                    System.out.println(":::: NAME : " + CustomerName + " ::::");
                    System.out.println(":::: MOBILE NO : " + phone + " ::::");
                    System.out.println(":::: BUS ID : " + bus_id + " ::::");
                    System.out.println(":::: SEAT NUMBER : " + SeatNumber + " ::::");
                    System.out.println(":::: SEAT ID : " + Ticket_Id + " ::::");
                }
                else {
                    throw new InvalidTicketId("INVALID TICKET ID");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void ShowAvailableSeats(){
        for (int i = 0; i < Available1.length; i++) {
            if (Available1[i]){
                System.out.print((i + 1) + " ");
            }
            else {
                System.out.println("null");
            }
        }
    }

}
