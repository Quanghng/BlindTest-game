package com.example.blindtest.service;

import com.example.blindtest.game.Match;
import com.example.blindtest.utilities.GameFactory;

public class GameServiceImpl implements GameService {

    @Override
    public Match startGame() {
        /*  todo :
             - récupérer toutes les données des utilisateurs
         */
        final Match match = GameFactory.initMatch();

        return match;
    }

    @Override
    public void joinGame() {
        /* todo :
            - récupérer les données des autres joueurs
            - notifier les autres joueurs
        */
    }
}
