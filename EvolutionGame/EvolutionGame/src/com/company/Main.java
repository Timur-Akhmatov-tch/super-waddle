package com.company;

import com.company.controller.GameMenu;
import com.company.controller.gamefunction.GamePhaseEvolution;
import com.company.view.GameVisual;
import com.company.view.MenuVisual;

public class Main {

    public static void main(String[]args ){
        GameMenu menu = new GameMenu();
        MenuVisual.getGreeting();

        menu.doCommandOfGame();
        GameVisual.getFirstPlayer();
        //  menu.setNamesOfPlayers();
        //GamePhaseEvolution.b();

    }
}
