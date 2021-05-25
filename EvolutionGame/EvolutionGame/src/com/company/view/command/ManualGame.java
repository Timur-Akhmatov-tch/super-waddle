package com.company.view.command;

import com.company.controller.GameMenu;
import com.company.view.MenuVisual;

/**
 * Класс, описывающий конманды инструкций игры.
 */
public class ManualGame extends Command {
    /**
     * Метод вызова инструкции игры.
     */
    @Override
    public void execute() {
        GameMenu gameMenu = new GameMenu();
        MenuVisual.getManual();
        gameMenu.doCommandOfGame();
    }
}
