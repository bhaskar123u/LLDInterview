import java.util.List;

public class HasMoneyState implements VendingMachineState {

  String state;

  public HasMoneyState() {
    System.out.println("Currently Vending machine is in HasMoneyState");
    state = new String("HasMoneyState");
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    return;
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    vendingMachine.setVendingMachineState(new SelectionState());
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    System.out.println("Accepted the coin");
    vendingMachine.getCoinList().add(coin);
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("you need to click on start product selection button first");
  }

  @Override
  public int getChange(int returnChangeMoney) throws Exception {
    throw new Exception("you can not get change in hasMoney state");
  }

  @Override
  public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
    throw new Exception("product can not be dispensed in hasMoney state");
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
    System.out.println("Returned the full amount back in the Coin Dispense Tray");
    vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    return vendingMachine.getCoinList();
  }

  @Override
  public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
    throw new Exception("you can not update inventory in hasMoney  state");
  }

  @Override
  public String getState() throws Exception {
    return state;
  }
}
