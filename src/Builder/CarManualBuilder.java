package Builder;

public class CarManualBuilder {
    private Manual manual=new Manual("text");

    public CarManualBuilder(Manual manual) {
        reset(manual);

    }
    private void reset(Manual manual){
        this.manual = manual;
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
