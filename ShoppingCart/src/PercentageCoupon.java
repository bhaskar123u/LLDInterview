public class PercentageCoupon extends Coupon {
  
  Product product;
  int discountPercentage;

  PercentageCoupon(Product product, int discountPercentage) {
    this.product = product;
    this.discountPercentage = discountPercentage;
  }

  @Override
  public double getPrice() {
    double price = product.getPrice();
    return price - (price * discountPercentage) / 100;
  }
}
