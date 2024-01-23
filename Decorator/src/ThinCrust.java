public class ThinCrust extends PizzaBaseType{
    Pizza pizza;
    ThinCrust(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    int getCost() {
        return 60 + pizza.getCost();
    }
    @Override
    String getDescription() {
        return pizza.getDescription()+", with thinCrust base";
    }
    
}