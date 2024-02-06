import java.util.ArrayList;
import java.util.List;

public class VendingMachineIdleState implements VendingMachineState {

  String state;

  public VendingMachineIdleState() {
    System.out.println("Currently Vending machine is in IdleState");
    state = new String("IdleState");
  }

  public VendingMachineIdleState(VendingMachine vendingMachine) {
    System.out.println("Currently Vending machine is in IdleState");
    vendingMachine.setCoinList(new ArrayList<>());
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    vendingMachine.setVendingMachineState(new HasMoneyState());
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("first you need to click on insert coin button");

  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("you can not insert Coin in idle state");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("you can not choose Product in idle state");
  }

  @Override
  public int getChange(int returnChangeMoney) throws Exception {
    throw new Exception("you can not get change in idle state");
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
    throw new Exception("you can not get refunded in idle state");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("proeduct can not be dispensed idle state");
  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    vendingMachine.getInventory().addItem(item, codeNumber);
  }

  @Override
  public String getState() throws Exception {
    return state;
  }
}
