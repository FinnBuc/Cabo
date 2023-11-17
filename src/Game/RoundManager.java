package Game;

import Game.Phase.ActionPhase;
import Game.Phase.DiscardPhase;
import Game.Phase.PullPhase;
import Game.Player;

public class RoundManager {

    int Round = 0;
    int turn = 0;
    private final Player[] players;
    ActionPhase actionPhase = new ActionPhase();
    DiscardPhase discardPhase = new DiscardPhase();
    PullPhase pullPhase = new PullPhase();

    public void start() {

    }
    public RoundManager(Player[] players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return players[1];
    }
    public int getRound() {
        return Round;
    }

    public int getTurn() {
        return turn;
    }
}
