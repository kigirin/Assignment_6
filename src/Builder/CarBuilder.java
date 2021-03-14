package Builder;

public class CarBuilder {
    private Car car=new Car("Example");

    public CarBuilder(Car car) {
        reset(car);
    }
    private void reset(Car car){
        this.car = car;
    }
    public void setSeats(){

    }
    public void setEngine(){

    }
    public void setTripComputer(){}
    public void setGPS(){}
    public void getProduct(){
    }
}
