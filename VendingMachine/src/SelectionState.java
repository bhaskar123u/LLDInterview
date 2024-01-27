import java.util.List;

public class SelectionState implements VendingMachineState {

  String state;

  public SelectionState() {
    System.out.println("Currently Vending machine is in SelectionState");
    state = new String("SelectionState");
  }

  @Override
  public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
    throw new Exception("you can not click on insert coin button in Selection state");
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
    return;
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
    throw new Exception("you can not insert Coin in selection state");
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    // 1. get item of this codeNumber
    Item item = vendingMachine.getInventory().getItem(codeNumber);

    // 2. total amount paid by User
    int paidByUser = 0;
    for (Coin coin : vendingMachine.getCoinList()) {
      paidByUser = paidByUser + coin.value;
    }

    // 3. compare product price and amount paid by user
    if (paidByUser < item.getPrice()) {
      System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice()
          + " and you paid: " + paidByUser);
      refundFullMoney(vendingMachine);
      throw new Exception("insufficient amount");
    } else if (paidByUser >= item.getPrice()) {

      if (paidByUser > item.getPrice()) {
        getChange(paidByUser - item.getPrice());
      }
      vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
    }
  }

  @Override
  public int getChange(int returnExtraMoney) throws Exception {
    // actual logic should be to return COINs in the dispense tray, but for
    // simplicity i am just returning the amount to be refunded
    System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
    return returnExtraMoney;
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    System.out.println("Returned the full amount back in the Coin Dispense Tray");
    machine.setVendingMachineState(new VendingMachineIdleState(machine));
    return machine.getCoinList();
  }

  @Override
  public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
    throw new Exception("product can not be dispensed Selection state");
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    throw new Exception("Inventory can not be updated in Selection state");
  }

  @Override
  public String getState() throws Exception {
    return state;
  }
}
