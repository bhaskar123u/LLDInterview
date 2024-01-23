public class BMWSportsCar extends Car{
    public BMWSportsCar(String modelName, String maker, int price, DriveStrategy driveStrategy) {
        super(modelName, maker, price, driveStrategy);
    }
    
    String completeDescription(){
        return "Model: "+modelName+
                    ", Maker: "+maker+
                    ", Price: "+price+
                    ", with "+driveStrategy.driveStrategy();
    }
}