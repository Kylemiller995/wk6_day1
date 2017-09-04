public class Bus{
  private int number;
  private Passenger[] riders;

  public Bus(int number){
    this.number = number;
    this.riders = new Passenger[10];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for (Passenger element : riders){
      if (element != null){
        count ++;
      }
    }
    return count;
  }


  public void board(Passenger person){
    if(this.isBusFull()){
      return;
    }
    int passengerCount = passengerCount();
    riders[passengerCount] = person;
  }

  public boolean isBusFull(){
    return this.passengerCount() == this.riders.length;
  }

  public void unload(){
    for(int i = 0; i < riders.length; i++){
      riders[i] = null;
    }
  }


}
