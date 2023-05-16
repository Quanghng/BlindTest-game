package com.example.blindtest.game;

public class Player {
    private String pseudo;

    private String answer;

    private int score;

    public Player(String pseudo, String answer, int score) {
        this.pseudo = pseudo;
        this.answer = answer;
        this.score = score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore() {
        this.score++;
    }
}
