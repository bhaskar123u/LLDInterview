// Using decorator design pattern
// Different products can have different coupons, design a shopping cart that computes final net payable for list of product in cart
public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to Jio");
    System.out.println();

    ShoppingCart shoppingCart = new ShoppingCart();

    Product item1 = new Shoe("Adidas", 200, ProductType.FOOTWEAR);
    Product item2 = new Tshirt("Levis", 100, ProductType.APPAREL);

    shoppingCart.addToCart(item1);
    shoppingCart.addToCart(item2);

    System.out.println("Your total bill amount is : " + shoppingCart.getTotalOriginalAmount());
    System.out.println("Net payable amount is : " + shoppingCart.getTotalPrice());
  }
}
