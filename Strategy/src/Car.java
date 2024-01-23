public class Car {
    protected String modelName;
    protected String maker;
    protected int price;
    protected DriveStrategy driveStrategy;
    public Car(String modelName, String maker, int price, DriveStrategy driveStrategy) {
        this.modelName = modelName;
        this.maker = maker;
        this.price = price;
        this.driveStrategy = driveStrategy;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public DriveStrategy getDriveStrategy() {
        return driveStrategy;
    }
    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}