import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;
  BusStop busStop;

  @Before
  public void before(){
    bus = new Bus(1);
    passenger = new Passenger();
  }

  @Test
  public void hasNumber(){
    assertEquals(1, bus.getNumber());
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canLoadPassengers(){
    bus.board(passenger);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busGetsFull(){
    for(int i = 0; i < 20; i++){
      bus.board(passenger);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void BusIsFull(){
    for(int i = 0; i < 10; i++){
      bus.board(passenger);
    }
    assertEquals( true, bus.isBusFull());
  }

  @Test
  public void BusEmptyAfterUnloading(){
    bus.board(passenger);
    bus.unload();
    assertEquals(0 , bus.passengerCount());
  }






}
