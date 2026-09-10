public class car {

    String company = "Ford";
    String car1 = "Endeavour";
    String colour = "Black";
    int model1 = 2015;

    public String toCar(){
        return company+" "+car1+" "+colour+" "+model1;
    }

    String com;
    String car;
    String col;
    int model;
    car(String com,String car,String col,int model){
        this.com = com;
        this.car = car;
        this.col = col;
        this.model = model;
    }
    car(car x){
        this.copy(x);
    }

    private void copy(car x) {
    }

    String name;
    car(String name){
        this.name = name;
    }
}
