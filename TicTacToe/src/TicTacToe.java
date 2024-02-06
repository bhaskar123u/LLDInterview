public class TicTacToe {

    public static void main(String args[]) {
        Game game = new Game();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
