import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

  public int stockCount = 0;
  public List<NotificationAlertObserver> iphoneObserverList = new ArrayList<>();

  @Override
  public void add(NotificationAlertObserver observer) {
    iphoneObserverList.add(observer);
  }

  @Override
  public void remove(NotificationAlertObserver observer) {
    iphoneObserverList.remove(observer);
  }

  @Override
  public void notifySubscribers() {
    for(NotificationAlertObserver observer : iphoneObserverList)
      observer.update();
  }

  @Override
  public void setStockCount(int newStockAdded) {
    if (stockCount == 0) {
      notifySubscribers();
    }
    stockCount += newStockAdded;
  }

  @Override
  public int getStockCount() {
    return stockCount;
  }
  
}
