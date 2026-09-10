package cars;

public class car {

    public int carId;
    public String car;
    public long PricePerDay;
    public boolean available;

    car[] cars;


    public static car se1 = new sedan(11,"Toyota Camry",5000,true);
    public static car se2 = new sedan(12,"Volkswagen Virtus",4500,true);
    public static car se3 = new sedan(13,"Hyundai Verna",4500,true);

    //car [] secar = {se1,se2,se3};

    public static car su1 = new suv(21,"Toyota Fortuner",8000,true);
    public static car su2 = new suv(22,"Mahindra Thar",7000,true);
    public static car su3 = new suv(23,"Ford Endeavour",8000,true);

    car [] sucar = {su1,su2,su3};

    public static car hb1 = new hatchback(31,"Suzuki Swift",3500,true);
    public static car hb2 = new hatchback(32,"Hyundai i20",4000,true);
    public static car hb3 = new hatchback(33,"Volkswagen Polo",4000,true);

    car [] hbcar = {hb1,hb2,hb3};


}
