public class ACRemote {
    public static void main(String[] args) throws Exception {
        System.out.println("This is your AC remote");
        System.out.println();

        AirConditioner airConditioner = new AirConditioner();

        Remote remote = new Remote();

        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();

        remote.setCommand(new TurnACOffCommand(airConditioner));
        remote.pressButton();

    }
}
