public class mainnnnn {
    public static void main(String [] args){

        call call = new call();
        photo photo = new photo();
        light light = new light();

        poly [] phone = {call,photo,light};
        for (poly x : phone){
            x.start();
        }

    } 
}
