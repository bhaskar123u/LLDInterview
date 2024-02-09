public class AirConditioner {

  boolean isOn;
  int temperature;

  public void turnOnAC() {
    isOn = true;
    System.out.println("AC is On");
  }

  public void turnOffAC() {
    isOn = false;
    System.out.println("AC is Off");
  }

  public void setTemperature(int temperature) {
    if(!isOn)
      System.out.println("AC is off, can't set temperature");
    else
      this.temperature = temperature;
  }
}
