package Car_Rental;
import cars.*;

//import java.sql.SQLOutput;
import java.util.Scanner;


public class CarRental{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        car [] secar = {car.se1, car.se2, car.se3};
        car [] sucar = {car.su1, car.su2, car.su3};
        car [] hbcar = {car.hb1, car.hb2, car.hb3};

        Customer customer;

        Rental rental;

        while (true) {

            System.out.println("=== WELCOME TO UNIVERSAL CARS RENTAL ===");
            System.out.println("WHICH TYPE OF CAR DO YOU WANT TO RENT....");
            System.out.println("1. SEDAN\n2. SUV\n3. HATCHBACK\n4. EXIT (If Not Intrested)");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :

                    for (car ele : secar) {
                        System.out.println("Car Id: " + ele.carId + ", " + ele.car + ", " + "Price/Day " + ele.PricePerDay);
                    }

                    System.out.println("ENTER THE CAR ID OF CAR YOU WANT :");
                    int carid = sc.nextInt();
                    sc.nextLine();

                    car SelectedCar = null;
                    boolean found = false;

                    for (car ele : secar) {
                        if (carid == ele.carId) {

                            found = true;

                            if (ele.available == false) {
                                System.out.println("SORRY " + ele.car + " IS NOT AVAILABLE.");
                                System.exit(0);
                            } else {
                                SelectedCar = ele;
                                System.out.println(ele.car + " IS A GREAT CHOICE...");
                                break;
                            }
                         break;
                        }
                    }
                    if (found == false){
                        System.out.println("INVALID CAR ID");
                        System.exit(0);
                    }


                    System.out.println("ENTER YOU NAME :");
                    String name = sc.nextLine();

                    System.out.println("ENTER YOUR MOBILE NUMBER :");
                    long num = sc.nextLong();

                    System.out.println("ENTER YOUR LICENSE ID :");
                    String lic = sc.nextLine();
                    sc.nextLine();

                    customer = new Customer(name,num,lic);
                    System.out.println("CUSTOMER DETAILS ENTERED SUCCESSFULLY!!");


                    System.out.println("ENTER THE NUMBER OF DAYS YOU WANT TO RENT THE CAR :");
                    int days = sc.nextInt();


                    rental = new Rental(SelectedCar,days);

                    System.out.println("THE TOTAL COST FOR YOUR CAR RENTAL IS : " + rental.TotalCost);

                    System.out.println("HOW WOULD YOU LIKE TO PAY : ");
                    System.out.println("1. CASH\n2. UPI");
                    int payment = sc.nextInt();
                    sc.nextLine();

                    if (payment == 1){
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE IN CASH..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days + " DAYS :::");
                        break;
                    } else if (payment == 2) {
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE BY UPI..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days + " DAYS :::");
                        break;
                    }
                    else {
                        System.out.println("YOU ONLY HAVE TO CHOOSE THE NUMBER'S WHICH WE PROVIDE. NOT OF YOUR OWN !!");
                        System.out.println("YOU HAVE CHOSE THE WRONG NUMBER \n NOW ENTER DETAIL ONCE AGAIN :)");
                        break;
                    }

                case 2 :
                    for (car ele : sucar) {
                        System.out.println("Car Id: " + ele.carId + ", " + ele.car + ", " + "Price/Day " + ele.PricePerDay);
                    }

                    System.out.println("ENTER THE CAR ID OF CAR YOU WANT :");
                    int carid2 = sc.nextInt();
                    sc.nextLine();

                    car SelectedCar2 = null;
                    boolean found2 = false;

                    for (car ele : sucar) {
                        if (carid2 == ele.carId) {

                            found2 = true;

                            if (ele.available == false) {
                                System.out.println("SORRY " + ele.car + " IS NOT AVAILABLE.");
                                System.exit(0);
                            } else {
                                SelectedCar2 = ele;
                                System.out.println(ele.car + " IS A GREAT CHOICE...");
                                break;
                            }
                            break;
                        }
                    }
                    if (found2 == false){
                        System.out.println("INVALID CAR ID");
                        System.exit(0);
                    }


                    System.out.println("ENTER YOU NAME :");
                    String name2 = sc.nextLine();

                    System.out.println("ENTER YOUR MOBILE NUMBER :");
                    long num2 = sc.nextLong();

                    System.out.println("ENTER YOUR LICENSE ID :");
                    String lic2 = sc.nextLine();
                    sc.nextLine();

                    customer = new Customer(name2,num2,lic2);
                    System.out.println("CUSTOMER DETAILS ENTERED SUCCESSFULLY!!");


                    System.out.println("ENTER THE NUMBER OF DAYS YOU WANT TO RENT THE CAR :");
                    int days2 = sc.nextInt();
                    sc.nextLine();


                    rental = new Rental(SelectedCar2,days2);

                    System.out.println("THE TOTAL COST FOR YOUR CAR RENTAL IS : " + rental.TotalCost);

                    System.out.println("HOW WOULD YOU LIKE TO PAY : ");
                    System.out.println("1. CASH\n2. UPI");
                    int payment2 = sc.nextInt();
                    sc.nextLine();

                    if (payment2 == 1){
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE IN CASH..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days2 + " DAYS :::");
                        break;
                    } else if (payment2 == 2) {
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE BY UPI..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days2 + " DAYS :::");
                        break;
                    }
                    else {
                        System.out.println("YOU ONLY HAVE TO CHOOSE THE NUMBER'S WHICH WE PROVIDE. NOT OF YOUR OWN !!");
                        System.out.println("YOU HAVE CHOSE THE WRONG NUMBER \n NOW ENTER DETAIL ONCE AGAIN :)");
                        break;
                    }

                case 3 :
                    for (car ele : hbcar) {
                        System.out.println("Car Id: " + ele.carId + ", " + ele.car + ", " + "Price/Day " + ele.PricePerDay);
                    }

                    System.out.println("ENTER THE CAR ID OF CAR YOU WANT :");
                    int carid3 = sc.nextInt();
                    sc.nextLine();

                    car SelectedCar3 = null;
                    boolean found3 = false;

                    for (car ele : hbcar) {
                        if (carid3 == ele.carId) {

                            found3 = true;

                            if (ele.available == false) {
                                System.out.println("SORRY " + ele.car + " IS NOT AVAILABLE.");
                                System.exit(0);
                            } else {
                                SelectedCar3 = ele;
                                System.out.println(ele.car + " IS A GREAT CHOICE...");
                                break;
                            }
                            break;
                        }
                    }
                    if (found3 == false){
                        System.out.println("INVALID CAR ID");
                        System.exit(0);
                    }


                    System.out.println("ENTER YOU NAME :");
                    String name3 = sc.nextLine();

                    System.out.println("ENTER YOUR MOBILE NUMBER :");
                    long num3 = sc.nextLong();

                    System.out.println("ENTER YOUR LICENSE ID :");
                    String lic3 = sc.nextLine();
                    sc.nextLine();

                    customer = new Customer(name3,num3,lic3);
                    System.out.println("CUSTOMER DETAILS ENTERED SUCCESSFULLY!!");


                    System.out.println("ENTER THE NUMBER OF DAYS YOU WANT TO RENT THE CAR :");
                    int days3 = sc.nextInt();
                    sc.nextLine();


                    rental = new Rental(SelectedCar3,days3);

                    System.out.println("THE TOTAL COST FOR YOUR CAR RENTAL IS : " + rental.TotalCost);

                    System.out.println("HOW WOULD YOU LIKE TO PAY : ");
                    System.out.println("1. CASH\n2. UPI");
                    int payment3 = sc.nextInt();
                    sc.nextLine();

                    if (payment3 == 1){
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE IN CASH..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days3 + " DAYS :::");
                        break;
                    } else if (payment3 == 2) {
                        System.out.println("YOUR PAYMENT SUCCESSFULLY DONE BY UPI..!!!");
                        System.out.println("::: YOU CAN HAVE THE CAR FOR " + days3 + " DAYS :::");
                        break;
                    }
                    else {
                        System.out.println("YOU ONLY HAVE TO CHOOSE THE NUMBER'S WHICH WE PROVIDE. NOT OF YOUR OWN !!");
                        System.out.println("YOU HAVE CHOSE THE WRONG NUMBER \nNOW ENTER DETAIL ONCE AGAIN :)");
                        break;
                    }

                case 4 :
                    System.out.println("THANK YOU FOR VISITING OUR SHOP :)");
                    System.exit(0);

                default :
                    System.exit(0);
            }

        }

    }

}