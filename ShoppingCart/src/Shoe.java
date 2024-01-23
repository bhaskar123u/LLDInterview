public class Shoe extends Product {
  
  Shoe(String name, double originalPrice, ProductType productType) {
    super(name, originalPrice, productType);
  }

  @Override
  public double getPrice() {
    return originalPrice;
  }
  
}
