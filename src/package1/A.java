package package1;
import package2.*;

public class A {
     String defaultVa = "This is default";
     public String publicVa = "This is public";
     protected String protectedVa = "This is protected";
     private String privateVa = "This is private";
}
class a extends A{
    public static void main(String[] args){
      //  System.out.println(privateVa);   ---> privateVa can't run in any other class except the one in which it is created
    }
}
