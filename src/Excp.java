import java.io.IOException;

public class Excp {

    static void withdraw(int amount,int balance) throws Exception{
        if(amount>balance){
            throw new Exception("Insufficient Balance");
        }
        else {
            System.out.println("withdraw successful");
        }
    }

    public static void main(String[] args) throws IOException {
        int i = 5;
        int j = 0;

        try{
            j = 40/i;
            throw new ArithmeticException("something wrong");
        } catch (ArithmeticException e) {
           // j = 40/1;
            System.out.println("Something went wrong " + e);
        }

        try{
            withdraw(5000,30000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("GET OUT");
        }

        System.out.println(j);

        int num = System.in.read();
        System.out.println(num - 48);
    }
}
