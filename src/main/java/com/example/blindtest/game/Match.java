package com.example.blindtest.game;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private final List<Player> players;

    private final List<Round> rounds;
    
    private Player winner;

    private int roundCount;

    public Match() {
        this.players = new ArrayList<>();
        this.rounds = new ArrayList<>();
        this.winner = null;
        this.roundCount = 0;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addRounds(List<Round> rounds) {
        this.rounds.addAll(rounds);
    }

    public Round getRound(int i){
        return this.rounds.get(i);
    }

    public Player getPlayer(int i) {
        return this.players.get(i);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void incrementRoundCount() {
        this.roundCount++;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}
