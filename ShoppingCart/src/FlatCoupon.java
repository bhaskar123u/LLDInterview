public class FlatCoupon extends Coupon {
  
  Product product;
  double discountAmount;

  FlatCoupon(Product product, double discountAmount) {
    this.product = product;
    this.discountAmount = discountAmount;
  }

  @Override
  public double getPrice() {
    double price = product.getPrice();
    return price - discountAmount;
  }
}
