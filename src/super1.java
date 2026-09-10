public class super1 {
    String name;
    String power;
    super1(String name,String power){
        this.name = name;
        this.power = power;
    }
    void p(String n){
        System.out.println(n);
    }
}
class sub extends super1{
    int aura;
    sub(String name,String power,int aura){
        super(name,power);
        this.aura = aura;
    }
}
class mani{
    public static void main(String[] args){
        sub iop = new sub("Batman","Sacrifice", (int) 99999);
        System.out.println(iop.name+", "+iop.power+", "+ iop.aura);

        String q = "Omer";
        int o = 19;
        //p(q,o);
    }
}
