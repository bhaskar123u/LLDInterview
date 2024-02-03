public class Card {

  private int cardNumber;
  private int cvv;
  private int expiryDate;
  private int holderName;
  private int pin = 1234;
  private UserBankAccount bankAccount;

  public boolean isCorrectPINEntered(int pin) {

    if (this.pin == pin) {
      return true;
    }
    return false;
  }

  public int getBankBalance() {
    return bankAccount.balance;
  }

  public void deductBankBalance(int amount) {
    bankAccount.withdrawalBalance(amount);
  }

  public void setBankAccount(UserBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String setPin(int pin) {
    this.pin = pin;
    return "Pin changed successfully";
  }
}
