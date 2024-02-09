public class TurnACOnCommand implements Command {

  AirConditioner airConditioner;

  TurnACOnCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOnAC();
  }
  
}
