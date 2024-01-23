public class ExtraCheese extends Toppings{
    Pizza pizza;
    ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    int getCost() {
        return 80 + pizza.getCost();
    }
    @Override
    String getDescription() {
        return pizza.getDescription()+", with extracheese topping";
    }
}