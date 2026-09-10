public class su1 extends su0{
    void p(String n,int a){
        super.p(n);
        System.out.println(a);
    }
    int q = super.p;
    public static void main (String[] args){
        su1 a = new su1();
        System.out.println(a.q);
    }
}
