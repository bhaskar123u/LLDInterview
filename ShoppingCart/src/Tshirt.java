public class Tshirt extends Product {
  
  Tshirt(String name, double originalPrice, ProductType productType) {
    super(name, originalPrice, productType);
  }

  @Override
  public double getPrice() {
    return originalPrice;
  }
  
}
