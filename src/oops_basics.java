class GetSet{
    String name;
    int id;

    public void setName(String n){
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
public class oops_basics {
    public static void main(String [] args){
        GetSet omer = new GetSet();
        omer.setName("Mohammed Omer");
        System.out.println(omer.getName());
        omer.setId(539);
        System.out.println(omer.getId());
    }
}
