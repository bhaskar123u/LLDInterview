public class RelianceJioVendingMachine {
  public static void main(String args[]) {

    VendingMachine vendingMachine = new VendingMachine();
    try {

      System.out.println("|");
      System.out.println("filling up the inventory");
      System.out.println("|");

      fillUpInventory(vendingMachine);
      displayInventory(vendingMachine);

      System.out.println("|");
      System.out.println("clicking on InsertCoinButton");
      System.out.println("|");

      VendingMachineState vendingMachineState = vendingMachine.getVendingMachineState();
      
      vendingMachineState.clickOnInsertCoinButton(vendingMachine);

      vendingMachineState = vendingMachine.getVendingMachineState();
      

      vendingMachineState.clickOnInsertCoinButton(vendingMachine);
      vendingMachineState.insertCoin(vendingMachine, Coin.FIVERUPEE);
      vendingMachineState.insertCoin(vendingMachine, Coin.TWENTYRUPEE);
      // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

      System.out.println("|");
      System.out.println("clicking on ProductSelectionButton");
      System.out.println("|");
      vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);

      vendingMachineState = vendingMachine.getVendingMachineState();
      
      vendingMachineState.chooseProduct(vendingMachine, 102);

      displayInventory(vendingMachine);

    } catch (Exception e) {
      displayInventory(vendingMachine);
    }

  }

  private static void fillUpInventory(VendingMachine vendingMachine) {
    ItemShelf itemShelf[] = vendingMachine.getInventory().getItemShelf();
    for (int i = 0; i < itemShelf.length; i++) {
      Item newItem = new Item();
      if (i >= 0 && i < 3) {
        newItem.setItemType(ItemType.COKE);
        newItem.setPrice(12);
      } else if (i >= 3 && i < 5) {
        newItem.setItemType(ItemType.PEPSI);
        newItem.setPrice(9);
      } else if (i >= 5 && i < 7) {
        newItem.setItemType(ItemType.JUICE);
        newItem.setPrice(13);
      } else if (i >= 7 && i < 10) {
        newItem.setItemType(ItemType.SODA);
        newItem.setPrice(7);
      }
      itemShelf[i].setItem(newItem);
      itemShelf[i].setSoldOut(false);
    }
  }

  private static void displayInventory(VendingMachine vendingMachine) {

    ItemShelf[] itemShelf = vendingMachine.getInventory().getItemShelf();
    for (int i = 0; i < itemShelf.length; i++) {

      System.out.println("CodeNumber: " + itemShelf[i].getCode() +
          " Item: " + itemShelf[i].getItem().getItemType().name() +
          " Price: " + itemShelf[i].getItem().getPrice() +
          " isAvailable: " + !itemShelf[i].isSoldOut());
    }
  }
}
