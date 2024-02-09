public class TurnACOffCommand implements Command {

  AirConditioner airConditioner;

  TurnACOffCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOffAC();
  }
  
}
