public class ProductTypeCoupon extends Coupon {

  Product product;
  ProductType productType;
  int discountPercentage;

  ProductTypeCoupon(ProductType productType, int discountPercentage) {
    this.productType = productType;
    this.discountPercentage = discountPercentage;
  }

  @Override
  public double getPrice() {
    if (product.getProductType().equals(productType)) {
      double price = product.getPrice();
      return price - (price * discountPercentage) / 100;
    }
    return product.getOriginalPrice();
  }
}
