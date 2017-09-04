public class BusStop{
  private Passenger[] waitingPeople;
  private String name;

  public BusStop(String name){
    this.name = "crossroads";
    this.waitingPeople = new Passenger[20];
  }

  public int getName(){
    return this.name;
  }

  public void peopleLeaveBus(Bus bus){
    int numPeople = bus.passengerCount();
    bus.unload();
    return numPeople;
    }





  }














}
