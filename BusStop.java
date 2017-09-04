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

  public int waitingPeopleCount(){
    return this.waitingPeople;
  }













}
