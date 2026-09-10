package Car_Rental;
import cars.*;

public class Rental {

    car car;
    int Days;
    long TotalCost;

    Rental(car car,int Days){

        this.car = car;
        this.Days = Days;
        this.TotalCost = car.PricePerDay*Days;

        car.available = false;
    }

}
