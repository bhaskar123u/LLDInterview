/*
 * Mediator design pattern
 * Usecase : When we have a system with N actor(who are user of system), performing any activity unknown of each other, such that
 * their activity might affect other user's activity(either change in UI, granting/revoking permissions), then we need a controller
 * for those systems. The controller can be implemented using mediator design pattern
 */
public class OnlineAuction {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to auction");
        System.out.println();

        AuctionMediator iplAuctionMediator = new IPLAuctionMediator();

        CricketTeam team1 = new CricketTeam("CSK", iplAuctionMediator);
        CricketTeam team2 = new CricketTeam("MI", iplAuctionMediator);
        CricketTeam team3 = new CricketTeam("SRH", iplAuctionMediator);

        team1.placeBid(1000);
    }
}
