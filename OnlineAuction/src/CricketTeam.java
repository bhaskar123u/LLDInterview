public class CricketTeam implements Team {
  
  String name;
  AuctionMediator auctionMediator;

  CricketTeam(String name, AuctionMediator auctionMediator) {
    this.name = name;
    this.auctionMediator = auctionMediator;
    auctionMediator.addBidder(this);
  }

  @Override
  public void placeBid(int bidAmount) {
    auctionMediator.placeBid(this, bidAmount);
  }

  @Override
  public void receiveBidNotification(int bidAmount, String bidderName) {
    System.out.println("Notification received by team ["+ name +"] :: Bidder " + bidderName + " has placed a bid of INR " + bidAmount);
  }

  @Override
  public String getName() {
    return name;
  }
  
}
