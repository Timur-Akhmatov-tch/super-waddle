package com.company.view;

import com.company.controller.GameMenu;

/**
 * Класс игровых сообщений
 */
public class MenuVisual {
    
    private static final String GREETING = """
            Добро пожаловать в игру Эволюция!\s
            Данная игра является аналогом настольной игры и повторяет все ее механики!\s
            
            Основыне команды:
            /manual - Инструкция к игре.
            /start - Начать игру.
            /exit - Завершить игру.
            """;

    //TODO: Нужно прописать инструкцию к игре.
    private static final String MANUAL ="Инструкция к игре...";

    private static final String EXIT = "Спасибо за игру! Ждем вашего возвращения!";

    private static final String SETTINGS ="Добро пожаловать в настройки игры!\nВведите количество игроков:";

    /**
     * Метод вывода приветвсия.
     */
    public static void getGreeting(){
        System.out.println(GREETING);
    }

    /**
     * Метод вывода инструкции.
     */
    public static void getManual(){
        System.out.println(MANUAL);
    }

    /**
     * Метод вывода заверщающего сообщения.
     */
    public static void getExit(){
        System.out.println(EXIT);
    }

    /**
     * Метод для вывода меню игровых настроек.
     */
    public static void getSettings(){
        System.out.println(SETTINGS);
    }

    /**
     * Метод для вывода списка игроков.
     */
    public static void getNamesOfPlayers(){
        System.out.println("Список Игроков:");
        for(int i = 0; i< GameMenu.namesOfPlayers.size(); i++){
            System.out.println((i+1)+": "+GameMenu.namesOfPlayers.get(i));
        }

    }
}
