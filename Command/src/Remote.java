public class Remote {
  
  Command command;

  Remote() {

  }
  
  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }
}
