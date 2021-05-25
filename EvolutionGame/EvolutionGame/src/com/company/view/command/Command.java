package com.company.view.command;

/**
 * Абстрактный класс команада , описывающий сущность каманда
 */
public abstract class Command implements ICommand {
    /**
     * Метод выполнения команды
     */
    @Override
public abstract void execute();


}
