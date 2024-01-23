public class EmailAlertObserverImpl implements NotificationAlertObserver {
  
  String emailId;
  StockObservable stockObservable;

  EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
    this.emailId = emailId;
    this.stockObservable = stockObservable;
  }

  @Override
  public void update() {
    sendEmail(emailId, "Product available in stock");
  }

  private void sendEmail(String emailId, String msg) {
    System.out.println("Mail sent to " + emailId);
  }
  
}
