public class encap {
    public static void main(String [] args){
        sample sa = new sample("Omer",19);
        sa.setName("Omer");
        sa.setAge(19);
        System.out.println(sa.getName());
        System.out.println(sa.getAge());

        // THE PROCESS OF COMBINING DATA AND METHODS TO PERFORM A PROCESS IS CALLED ENCAPSULATION, WITHOUT GIVING THE DIRECT ACCESS TO
        // DATA (VARIABLES) BY USING "PRIVATE" ACCESS MODIFIER........
    }
}
