public class SelectOperationState extends ATMState {

  SelectOperationState() {
    System.out.println("ATM is in SelectOperationState");
    showOperations();
  }

  @Override
  public void selectOperation(ATM atmObject, Card card, TransactionType txnType) {

    switch (txnType) {

      case CASH_WITHDRAWAL:
        atmObject.setCurrentATMState(new CashWithdrawalState());
        break;
      case BALANCE_CHECK:
        atmObject.setCurrentATMState(new CheckBalanceState());
        break;
      default: {
        System.out.println("Invalid Option");
        exit(atmObject);
      }

    }
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

  private void showOperations() {
    System.out.println("Please select the Operation");
    TransactionType.showAllTransactionTypes();
  }
}
