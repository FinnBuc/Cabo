package Game;

import Game.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean test = true;
        if (test == false) {
            System.out.println("Let's start a new Game!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many Players are in the Game?");
            int playerNumber = Integer.parseInt(scanner.nextLine());
            Player[] players = new Player[playerNumber];
            for (int i = 0; i < playerNumber; i++) {
                System.out.println("What is the name of Player " + i + "?");
                players[i] = new Player(scanner.nextLine());
            }
            System.out.println("Game is starting!");
            Game game = new Game(players);
            game.start();
        }else{
            int playerNumber = 3;
            Player[] players = new Player[playerNumber];
            Player player1 = new Player("player1");
            Player player2 = new Player("player2");
            Player player3 = new Player("player3");
            players[0] = player1;
            players[1] = player2;
            players[2] = player3;
            Game game = new Game(players);
            game.start();
        }
    }
}