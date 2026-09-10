public class array_objects {
    String name;
    array_objects(String name){
        this.name = name;
    }
    public static void main(String [] args){
       // array_objects[] fridge = new array_objects[5];

        array_objects food1 = new array_objects("Bread");
        array_objects food2 = new array_objects("Eggs");
        array_objects food3 = new array_objects("Cake");
        array_objects food4 = new array_objects("Ice cream");
        array_objects food5 = new array_objects("Pizza");

        array_objects [] fridge = {food1,food2,food3,food4,food5};  // <-- this is the array which is created using objects......

       /* fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;
        fridge[3] = food4;
        fridge[4] = food5;
        */

        for (int i = 0; i < fridge.length; i++) {
            System.out.println(fridge[i].name);
        }

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
        System.out.println(fridge[3].name);
        System.out.println(fridge[4].name);
    }
}
