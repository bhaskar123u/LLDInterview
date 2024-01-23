public class Decorator {
    public static void main(String[] args) {
        Pizza newPizza = new ExtraCheese(new FarmHouse());

        System.out.println(newPizza.getDescription());
        System.out.println("Total cost = Rs "+newPizza.getCost());
    }
}
