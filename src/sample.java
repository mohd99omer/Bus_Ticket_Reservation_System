import static java.lang.Character.getName;

public class sample {
    private String name;
    private int age;

    sample(String name,int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // method for copying a object

    public void copy(sample x){
        this.setName(x.name);
        this.setAge(x.age);
    }

    sample(sample x){
        this.copy(x);
    }

    // we can also copy object using constructor mentioned above
}
class main1{
    public static void main(String [] args){
        sample s = new sample("sgb",97);
        System.out.println(s.getName()+s.getAge());

        sample e = new sample(s);
        System.out.println(e.getName());

    }
}
