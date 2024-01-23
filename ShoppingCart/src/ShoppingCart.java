import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;
    double totalOriginalAmount;

    public ShoppingCart() {
        productList = new ArrayList<>();
        totalOriginalAmount = 0;
    }

    public void addToCart(Product product) {
        totalOriginalAmount += product.getOriginalPrice();
        Product productWithDiscount = new FlatCoupon(new PercentageCoupon(product, 10), 50);
        productList.add(productWithDiscount);
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Product product : productList)
            totalPrice += product.getPrice();

        return totalPrice;
    }
    
    public double getTotalOriginalAmount() {
        return totalOriginalAmount;
    }
}
