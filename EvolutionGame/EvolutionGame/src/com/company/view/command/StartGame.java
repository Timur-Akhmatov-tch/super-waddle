package com.company.view.command;

import com.company.controller.GameMenu;
import com.company.controller.gamefunction.GamePhaseEvolution;
import com.company.view.MenuVisual;

/**
 * Класс , описывающий команду начала игры.
 */
public class StartGame extends Command {
    /**
     * Метод ,реализующий команду начала игры.
     */
    @Override
    public void execute() {
        GameMenu gameMenu=new GameMenu();
        MenuVisual.getSettings();
        gameMenu.setAndCheckCorrectSettingsOfGame();
        gameMenu.setNamesOfPlayers();
        //todo:ПОТОМ ВСЕ ЭТО БУДЕТ В ОДНОМ МЕТОДЕ GAME
        GamePhaseEvolution testGame = new GamePhaseEvolution();
        testGame.createPlayersAndDistributionCardsInHandsOfPlayers();
    }
}
