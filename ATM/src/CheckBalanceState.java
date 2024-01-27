public class CheckBalanceState extends ATMState {

  CheckBalanceState() {
    System.out.println("ATM is in checkBalanceState");
  }

  @Override
  public void displayBalance(ATM atm, Card card) {
    System.out.println("Your Balance is: " + card.getBankBalance());
    exit(atm);
  }

  @Override
  public void exit(ATM atmObject) {
    returnCard();
    atmObject.setCurrentATMState(new ATMIdleState());
    System.out.println("Exit happens");
  }

  @Override
  public void returnCard() {
    System.out.println("Please collect your card");
  }
}
