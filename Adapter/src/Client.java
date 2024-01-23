// Adapter design pattern
// When client want to use a interface, but it is not compatible with it. In such cases we create a adapter layer similar to adapter for electric sockets at home. The client can call adapter and internally the adapter calls the actual interface.
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Adapter design pattern");
        System.out.println();

        BabyWeightMachine machine1 = new BabyWeightMachine();
        WeightMachineAdapter adapterMachine = new WeightMachineAdapterImpl(machine1);

        System.out.println("Weight in kg " + adapterMachine.getWeightInKg());
    }
}
