public class constructors {
    String name;
    int age;
    constructors(String name, int age){
        this.name = name;
        this.age = age;
    }
    static void iop(constructors t){
        System.out.println(t.name+t.age);
    }
     public static void main(String [] args){
        constructors human = new constructors("Omer",19);
        constructors human1 = new constructors("Mohammed",19);
        System.out.println(human1.name+" "+human1.age);
        System.out.println(human.name+" "+ human.age);

        car car = new car("Toyota","Fortuner","Black",2016);
        System.out.println(car.toCar());
        System.out.println(car.com+" "+car.car+" "+car.col+" "+car.model);
    }
}
