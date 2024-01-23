public class PanPizza extends PizzaBaseType{
    Pizza pizza;
    PanPizza(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    int getCost() {
        return 70 + pizza.getCost();
    }
    @Override
    String getDescription() {
        return pizza.getDescription()+", with panPizza base";
    }
}