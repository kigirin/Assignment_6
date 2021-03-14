package Builder;

public class Director {
    private Builder builder=new Builder();

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void constructSportsCar(Builder car){
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
    public void tSYV(Builder builder){
        
    }
}
