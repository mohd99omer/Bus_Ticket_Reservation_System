package Ticket_Reservation;
import java.util.Scanner;


class OutOfSeatsExpection extends Exception{
    public OutOfSeatsExpection(String msg){
        super(msg);
    }
}
class WrongBusException extends Exception{
    public WrongBusException(String msg){
        super(msg);
    }
}
class InvalidTicketId extends Exception{
    public InvalidTicketId(String msg){
        super(msg);
    }
}
public class Ticket_Booking {

    public static void main(String[] args) {

        Available_Buses [] AVB = {Available_Buses.ab1,Available_Buses.ab2,Available_Buses.ab3};

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("::::: WELCOME TO BookMyTicket.com :::::");
        System.out.println("::::: WE PROVIDE THE BEST 10 SEATER SERVICE :::::");
        System.out.println(".....OUR SERVICES ARE FOLLOWS.....");

        int seat1;
        int seat2;
        int seat3;

        while (true){
              System.out.println();
              System.out.println("""
                      1. BUS TRIPS PROVIDED.\s
                      2. BOOK TICKET.\s
                      3. CANCEL TICKET. \s
                      4. DISPLAY TICKET.\s
                      5. EXIT.""");
              System.out.println("CHOOSE ANY SERVICE :: ");
              int service = sc.nextInt();

              switch (service){

                  case 1:

                      System.out.println();
                      System.out.println("OUR PROVIDED BUSES ARE.....");
                      for (Available_Buses ab : AVB){
                          System.out.println(ab.journey + ab.travels_name + ab.Bus_Id);
                      }
                      break;

                  case 2:

                      System.out.println("ENTER YOUR BUS ID : ");
                      int Bus_Id = sc.nextInt();

                      switch (Bus_Id){
                          case 100:
                              System.out.println();
                              System.out.println("HYDERABAD - BANGALORE");
                              System.out.println("THE AVAILABLE SEATS IN THIS BUS ARE :");
                              Book_Seat1 ss1 = new Book_Seat1();
                              ss1.ShowAvailableSeats();
                              System.out.println();
                              System.out.println("ENTER YOUR NAME : ");
                              sc.nextLine();
                              String name1 = sc.nextLine();
                              System.out.println("ENTER YOUR MOBILE NUMBER : ");
                              long mobile1 = sc.nextLong();

                              System.out.println("ENTER SEAT NUMBER : ");
                              seat1 = sc.nextInt();
                              try{
                                  if (seat1 < 1 || seat1 > 10){
                                      throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                                              "YOU SHOULD ENTER A VALID SEAT NUMBER");
                                  }
                              } catch (OutOfSeatsExpection e) {
                                  System.out.println(e.getMessage());
                                  System.exit(0);
                              }

                              Book_Seat1 book1 = new Book_Seat1();
                              book1.Book(seat1,name1,mobile1,Bus_Id);
                              Thread T1 = new Thread(book1);
                              T1.start();
                              try{
                                  T1.join();
                              } catch (InterruptedException e) {
                                  throw new RuntimeException(e);
                              }
                              System.out.println();

                              break;

                          case 200:
                              System.out.println();
                              System.out.println("HYDERABAD - DELHI");
                              System.out.println("THE AVAILABLE SEATS IN THIS BUS ARE :");
                              Book_Seat2 ss2 = new Book_Seat2();
                              ss2.ShowAvailableSeats();
                              System.out.println();
                              System.out.println("ENTER YOUR NAME : ");
                              sc.nextLine();
                              String name2 = sc.nextLine();
                              System.out.println("ENTER YOUR MOBILE NUMBER : ");
                              long mobile2 = sc.nextLong();

                              System.out.println("ENTER SEAT NUMBER : ");
                              seat2 = sc.nextInt();
                              try{
                                  if (seat2 < 1 || seat2 > 10){
                                      throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                                              "YOU SHOULD ENTER A VALID SEAT NUMBER");
                                  }
                              } catch (OutOfSeatsExpection e) {
                                  System.out.println(e.getMessage());
                                  System.exit(0);
                              }

                              Book_Seat2 book2 = new Book_Seat2();
                              book2.Book(seat2,name2,mobile2,Bus_Id);
                              Thread T2 = new Thread(book2);
                              T2.start();
                              try{
                                  T2.join();
                              } catch (InterruptedException e) {
                                  throw new RuntimeException(e);
                              }
                              System.out.println();

                              break;

                          case 300:
                              System.out.println();
                              System.out.println("HYDERABAD - MUMBAI");
                              System.out.println("THE AVAILABLE SEATS IN THIS BUS ARE :");
                              Book_Seat3 ss3 = new Book_Seat3();
                              ss3.ShowAvailableSeats();
                              System.out.println();
                              System.out.println("ENTER YOUR NAME : ");
                              sc.nextLine();
                              String name3 = sc.nextLine();
                              System.out.println("ENTER YOUR MOBILE NUMBER : ");
                              long mobile3 = sc.nextLong();

                              System.out.println("ENTER SEAT NUMBER : ");
                              seat3 = sc.nextInt();
                              try{
                                  if (seat3 < 1 || seat3 > 10){
                                      throw new OutOfSeatsExpection("THIS IS A 10 SEATER SERVICE..." +
                                              "YOU SHOULD ENTER A VALID SEAT NUMBER");
                                  }
                              } catch (OutOfSeatsExpection e) {
                                  System.out.println(e.getMessage());
                                  System.exit(0);
                              }

                              Book_Seat3 book3 = new Book_Seat3();
                              book3.Book(seat3,name3,mobile3,Bus_Id);
                              Thread T3 = new Thread(book3);
                              T3.start();
                              try{
                                  T3.join();
                              } catch (InterruptedException e) {
                                  throw new RuntimeException(e);
                              }
                              System.out.println();

                              break;

                          default:
                              try{
                                  throw new WrongBusException("INVALID BUD ID");
                              }catch(Exception e){
                                  System.out.println(e.getMessage());
                                  System.exit(0);
                          }

                      }
                      break;

                  case 3:
                      System.out.println("ENTER YOUR BUS ID : ");
                      Bus_Id = sc.nextInt();

                      switch (Bus_Id){
                          case 100:
                              Cancel_tkt CT1 = new Cancel_tkt();
                              System.out.println("ENTER YOUR SEAT NUMBER : '");
                              seat1 = sc.nextInt();
                              CT1.Cancel_ticket1(seat1);
                              break;

                          case 200:
                              Cancel_tkt CT2 = new Cancel_tkt();
                              System.out.println("ENTER YOUR SEAT NUMBER : ");
                              seat2 = sc.nextInt();
                              CT2.Cancel_ticket2(seat2);
                              break;

                          case 300:
                              Cancel_tkt CT3 = new Cancel_tkt();
                              System.out.println("ENTER YOUR SEAT NUMBER : ");
                              seat3 = sc.nextInt();
                              CT3.Cancel_ticket3(seat3);
                              break;

                          default:
                              System.out.println("INVALID INPUT");
                              System.exit(0);
                      }

                  case 4:
                      System.out.println("ENTER YOUR BUS ID :'");
                      int bus_id = sc.nextInt();

                      switch (bus_id){
                          case 100:
                              System.out.println("ENTER YOUR TICKET ID :");
                              int tk_id1 = sc.nextInt();

                              Book_Seat1 bs1 = new Book_Seat1();
                              bs1.Display_Ticket1(tk_id1);
                              break;

                          case 200:
                              System.out.println("ENTER YOUR TICKET ID :");
                              int tk_id2 = sc.nextInt();

                              Book_Seat2 bs2 = new Book_Seat2();
                              bs2.Display_Ticket1(tk_id2);
                              break;

                          case 300:
                              System.out.println("ENTER YOUR TICKET ID :");
                              int tk_id3 = sc.nextInt();

                              Book_Seat3 bs3 = new Book_Seat3();
                              bs3.Display_Ticket1(tk_id3);
                              break;

                          default:
                              System.out.println("INVALID BUS ID");
                              System.exit(0);

                      }

                  case 5:
                      System.out.println("THANK YOU FOR VISITING OUR BOOKING SITE !!!");
                      System.exit(0);
                      break;

                  default:
                      System.out.println("INVALID INPUT");
                      System.exit(0);

              }

        }

    }

}
