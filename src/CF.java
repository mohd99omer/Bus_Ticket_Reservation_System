import java.util.*;


class student implements Comparable<student>{

    String name;
    int age;

    student(String name, int age){
        this.name = name;
        this.age = age;
    }

  /*  @Override
    public String toString() {
        return "Student [age : " + age + " name : " + name + " ]";
    }

   */

    public int compareTo(student o) {
        if (this.age > o.age)
            return 1;
        else return -1;
    }
}
public class CF {
    public static void main(String[] args) {
        List<String> num = new ArrayList<>();

        num.add("Omer");
        num.add("Mohammed");
        num.add("Conor");
        num.add("Modi");

        Comparator<String> name = new Comparator<>() {
            @Override
            public int compare(String i, String j) {
                if (i.length() > j.length())
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(num,name);

       // System.out.println(num);

       /* for (Object n : num){
            System.out.println(n);
        }
        */

        List<student> stfu = new ArrayList<>();

        stfu.add(new student("Omer",19));
        stfu.add(new student("Mohammed",49));
        stfu.add(new student("Ali",89));
        stfu.add(new student("Conor",29));
        stfu.add(new student("Modi",13));

        Collections.sort(stfu,student::compareTo);

        for (student s : stfu){
            System.out.println(s.name +" "+s.age);
        }

        // INSTEAD OF ADDING NUMBERS OR NAMES MANUALLY IN ARRAY WE CAN USE ......
        List<Integer> in = Arrays.asList(2,6,4,3,2);

        //System.out.println(in);

        for (int n : in)
            System.out.println(n);

        Set<Integer> op = new HashSet<>(Arrays.asList(2,8,6,4,9,2));

        System.out.println(op);

        // NO NEED TO ENTER MANUALLY LIKE WE ENTERED IN LINES 31-34.........

        // AND ALSO WE DONT NEED TO WRITE FOR EACH LOOP
        // INSTEAD OF THAT WE CAN USE FOR EACH METHOD, WHICH ALSO REDUCES THE CODE LENGTH...

        List<Integer> p = Arrays.asList(5,8,6,14,6);

        p.forEach(n -> System.out.println(n));
        // THIS METHOD REDUCES THE CODE USING LAMBDA EXPRESSION



        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // STREAM API IN JAVA.......

        List<Integer> q = Arrays.asList(5,8,20,45,69,12,50,30);

        q.stream()
                .filter(n -> n%5 == 0)
                .sorted()
                .forEach(n -> System.out.println(n));

        q.stream().sorted().filter(n -> n%5 == 0).forEach(System.out::println);

        // BOTH OF THESE PRINT THE SAME THING..............000000000000


    }
}
