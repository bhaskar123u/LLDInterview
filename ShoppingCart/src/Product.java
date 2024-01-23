public abstract class Product {
  String name;
  double originalPrice;
  ProductType productType;

  Product() {
  }

  public Product(String name, double originalPrice, ProductType productType) {
    this.name = name;
    this.originalPrice = originalPrice;
    this.productType = productType;
  }

  public String getName() {
    return name;
  }

  public double getOriginalPrice() {
    return originalPrice;
  }

  public ProductType getProductType() {
    return productType;
  }

  // to be implemented
  public abstract double getPrice();
}
