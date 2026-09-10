package package1;
import package2.*;

public class B {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.defaultVa);
        System.out.println(a.publicVa);
        System.out.println(a.protectedVa);
        //  System.out.println(privateVa);   ---> privateVa can't run in any other class except the one in which it is created
    }
}
