public class abstraction extends move{

   // @Override
    void go(){
        System.out.println("The vehicle is moving..");
    }

    public static void main(String [] args){

        abstraction car = new abstraction();
        car.go();

    }

}
