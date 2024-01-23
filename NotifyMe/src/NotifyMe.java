// let's say we are browsing a product on amazon and found it to be out of stock, we can click on NOTIFY ME, to get updates when the product is in stock again. This can be done using observer design pattern
public class NotifyMe {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Notify Me");
        System.out.println();

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver user1 = new EmailAlertObserverImpl("bhaskar123u@gmail.com", iphoneStockObservable);
        NotificationAlertObserver user2 = new EmailAlertObserverImpl("sharanbhaskar123u@gmail.com",
                iphoneStockObservable);
        
        iphoneStockObservable.add(user1);
        iphoneStockObservable.add(user2);

        iphoneStockObservable.setStockCount(10);
    }
}
