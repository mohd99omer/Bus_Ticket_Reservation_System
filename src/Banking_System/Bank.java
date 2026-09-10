package Banking_System;
import java.util.Objects;
import java.util.Scanner;

// we need create account method which creates the account
// credit and debit methods
// transfer from one account to another

public class Bank {

    String AccHolder;
    long AccNo;
    double balance;

    Bank(String AccHolder, long AccNo){
        this.AccHolder = AccHolder;
        this.AccNo = AccNo;
    }

    void deposit(double Amount){
        balance = balance + Amount;
    }

    boolean withdraw(double Amount){
        if (Amount <= balance){
            balance = balance - Amount;
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        Bank [] accounts = new Bank[15];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("=== WELCOME TO VIJAY MALLYA BANK ===");
            System.out.println("OUR SERVICES ARE FOLLOWS");
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. DEPOSIT AMOUNT");
            System.out.println("3. WITHDRAW AMOUNT");
            System.out.println("4. CHECK ACCOUNT BALANCE");
            System.out.println("5. TRANSFER AMOUNT");
            System.out.println("6. TO CLOSE");
            System.out.println("ENTER YOUR CHOICE, WHAT DO YOU NEED...");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ENTER ACCOUNT HOLDERS NAME :");
                    String name = sc.nextLine();

                    System.out.println("ENTER ACCOUNT NUMBER :");
                    long number = sc.nextLong();

                    accounts[count] = new Bank(name,number);
                            System.out.println("ACCOUNT CREATED");
                            count ++;
                    break;

                case 2:
                    System.out.println("ENTER ACCOUNT NUMBER");
                    long  depositAccount = sc.nextLong();

                    System.out.println("ENTER DEPOSIT AMOUNT");
                    double depositAmount = sc.nextDouble();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].AccNo == depositAccount){
                            accounts[i].deposit(depositAmount);

                            System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
                            found = true;
                            break;
                        }
                    }
                    if (found == false){
                        System.out.println("ACCOUNT NOT FOUND");
                        break;
                    }
                    break;

                case 3:
                    System.out.println("ENTER ACCOUNT NUMBER");
                    long withdrawAccount = sc.nextLong();

                    System.out.println("ENTER WITHDRAW AMOUNT");
                    double withdrawAmount = sc.nextDouble();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].AccNo == withdrawAccount){
                            accounts[i].withdraw(withdrawAmount);
                            System.out.println("THE AMOUNT HAS BEEN WITHDRAWN");
                            break;
                        }
                    }

                    if (found == false){
                        System.out.println("ACCOUNT NOT FOUND");
                        break;
                    }
                    break;

                case 4:
                    System.out.println("ENTER ACCOUNT NUMBER");
                    long accountNumber = sc.nextLong();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].AccNo == accountNumber){
                            System.out.println("YOUR AVAILABLE BALANCE IS " + accounts[i].balance);
                            break;
                        }
                    }
                    if(found == false){
                        System.out.println("INVALID ACCOUNT NUMBER");
                    }
                    break;


                case 5:
                    System.out.println("ENTER SENDER'S ACCOUNT NUMBER");
                    long senderAccount = sc.nextLong();

                    System.out.println("ENTER RECEIVER'S ACCOUNT NUMBER");
                    long receiverAccount = sc.nextLong();

                    System.out.println("ENTER TRANSFER AMOUNT");
                    double transferAmount = sc.nextDouble();

                    Bank sender = null;
                    Bank receiver = null;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].AccNo == senderAccount){
                            sender = accounts[i];
                        }
                        if (accounts[i].AccNo == receiverAccount){
                            receiver = accounts[i];
                        }
                    }
                    if (sender == null || receiver == null){
                        System.out.println("INVALID INFORMATION\nACCOUNTS NOT FOUND");
                    }
                    else if (sender.withdraw(transferAmount)){
                        receiver.deposit(transferAmount);
                        System.out.println("TRANSFER SUCCESSFUL...");
                    }
                    else {
                        System.out.println("INSUFFICIENT BALANCE TO TRANSFER");
                    }
                    break;

                case 6:
                    System.out.println("THANK YOU!!!!");
                    sc.close();
                    return;

                default:
                    System.out.println("INVALID CHOICE :)");
                    break;
            }

        }

    }

}
