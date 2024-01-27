public class ATMIdleState extends ATMState {

  ATMIdleState() {
    System.out.println("ATM is in idle state");
  }

  @Override
  public void insertCard(ATM atm, Card card) {
    System.out.println("Card is inserted");
    atm.setCurrentATMState(new HasCardState());
  }
}
