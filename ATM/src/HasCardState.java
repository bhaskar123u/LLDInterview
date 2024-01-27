public class HasCardState extends ATMState {

  HasCardState() {
    System.out.println("AMT is in h");
    System.out.println("enter your card pin number");
  }

  @Override
  public void authenticatePin(ATM atm, Card card, int pin) {
    boolean isCorrectPinEntered = card.isCorrectPINEntered(pin);

    if (isCorrectPinEntered) {
      atm.setCurrentATMState(new SelectOperationState());
    } else {
      System.out.println("Invalid PIN Number");
      exit(atm);
    }
  }

  @Override
  public void exit(ATM atm) {
    returnCard();
    atm.setCurrentATMState(new ATMIdleState());
    System.out.println("Exit happens");
  }

  @Override
  public void returnCard() {
    System.out.println("Please collect your card");
  }
}
