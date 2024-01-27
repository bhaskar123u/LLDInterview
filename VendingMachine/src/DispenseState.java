import java.util.List;

public class DispenseState implements VendingMachineState {

  String state;

  DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {

    System.out.println("Currently Vending machine is in DispenseState");
    state = new String("Dispense State");
    dispenseProduct(vendingMachine, codeNumber);
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("insert coin button can not clicked on Dispense state");
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("product selection buttion can not be clicked in Dispense state");

  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("coin can not be inserted in Dispense state");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("product can not be choosen in Dispense state");
  }

  @Override
  public int getChange(int returnChangeMoney) throws Exception {
    throw new Exception("change can not returned in Dispense state");
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
    throw new Exception("refund can not be happen in Dispense state");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    System.out.println("Product has been dispensed");
    Item item = vendingMachine.getInventory().getItem(codeNumber);
    vendingMachine.getInventory().updateSoldOutItem(codeNumber);
    vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    return item;
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    throw new Exception("inventory can not be updated in Dispense state");
  }

  @Override
  public String getState() throws Exception {
    return state;
  }
}
