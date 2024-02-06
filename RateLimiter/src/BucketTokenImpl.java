import java.util.concurrent.atomic.AtomicInteger;

public class BucketTokenImpl implements BucketToken {

  AtomicInteger currentTokenCount = new AtomicInteger();
  @Override
  public int getToken() {
    if (currentTokenCount.get() < TokenConfig.MAX_TOKEN_PER_SECOND) {
      return currentTokenCount.incrementAndGet();
    }

    return -1;
  }

  public void resetTokenCounter() {
    currentTokenCount.set(0);
  }
  
}
