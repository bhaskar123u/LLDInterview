public class Strategy {
    public static void main(String[] args) {
        BMWNormalCar newCar = new BMWNormalCar("BMW550d", "BMWNormalCar", 2000000, new NormalDriveStrategy());
        System.out.println(newCar.completeDescription());
    }
}
