public class WeightMachineAdapterImpl implements WeightMachineAdapter {
  
  WeightMachine weightMachine;

  WeightMachineAdapterImpl(WeightMachine weightMachine) {
    this.weightMachine = weightMachine;
  }

  @Override
  public double getWeightInKg() {
    double weightInPound = weightMachine.getWeightInPounds();
    double weightInKg = weightInPound * 0.45;
    return weightInKg;
  }
  
}
