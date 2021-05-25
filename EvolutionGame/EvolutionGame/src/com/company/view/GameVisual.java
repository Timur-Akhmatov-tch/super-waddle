package com.company.view;

import com.company.controller.GameMenu;
import com.company.controller.gamefunction.GamePhaseEvolution;

public class GameVisual {

    private static final String FIRST_PLAYER = "\nПервым ходит игрок №" + GamePhaseEvolution.firstPlayer +" "+ GameMenu.namesOfPlayers.get(GamePhaseEvolution.firstPlayer-1);

    /**
     *Метод вывода информации о первом игроке.
     */
    public static void getFirstPlayer(){
        System.out.println(FIRST_PLAYER);
    }
}
