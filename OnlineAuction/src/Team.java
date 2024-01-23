public interface Team {
  
  void placeBid(int bidAmount);

  void receiveBidNotification(int bidAmount, String bidderName);

  String getName();
}
