package package2;
import package1.*;

public class C extends A{
    public static void main(String[] args){
        C a = new C();
       //  System.out.println(a.defaultVa);  ---> defaultVa can't run in another package sub class because it is default..

        System.out.println(a.publicVa);   // --> publicVa don't even need extends keyword we mentioned it because other access modifiers can use it..

        System.out.println(a.protectedVa);   //  --> protectedVa can run in different package and sub class

        //  System.out.println(privateVa);   ---> privateVa can't run in any other class except the one in which it is created
    }
}
