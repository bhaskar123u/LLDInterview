import java.util.ArrayList;
import java.util.List;

public class IPLAuctionMediator implements AuctionMediator {
  
  List<Team> teamList;

  IPLAuctionMediator() {
    System.out.println("IPL Auction has started");
    System.out.println();
    teamList = new ArrayList<>();
  }
  
  @Override
  public void addBidder(Team iplTeam) {
    teamList.add(iplTeam);
  }

  @Override
  public void placeBid(Team iplTeam, int bidAmount) {
    
    for (Team team : teamList) {
      if (!team.getName().equals(iplTeam.getName())) {
        team.receiveBidNotification(bidAmount, iplTeam.getName());
      }
    }
  }
  
}
