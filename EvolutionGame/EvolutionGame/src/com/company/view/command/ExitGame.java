package com.company.view.command;

import com.company.view.MenuVisual;

/**
 * Класс выхода из меню
 */
public class ExitGame extends Command {
    /**
     * Метод реализующий выход из игры.
     */
    @Override
    public void execute() {
        MenuVisual.getExit();
    }
}