public class BMWNormalCar extends Car{
    public BMWNormalCar(String modelName, String maker, int price, DriveStrategy driveStrategy) {
        super(modelName, maker, price, driveStrategy);
    }
    String completeDescription(){
        return "Model: "+modelName+
                    ", Maker: "+maker+
                    ", Price: "+price+
                    ", with "+driveStrategy.driveStrategy();
    }
}