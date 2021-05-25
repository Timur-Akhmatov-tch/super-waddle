package com.company.controller;

import com.company.view.Console;
import com.company.view.MenuVisual;
import com.company.view.command.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Игровое меню
 */
public class GameMenu {



   public static int countOfPlayers;

    public static ArrayList<String> namesOfPlayers=new ArrayList<>();



    /**
     * Метод реализации команд,введенных пользователем.
     */
    public  void doCommandOfGame() {
        Console inputLine = new Console();
        boolean exit = false;
       String command=inputLine.getInputLine();
        Map<String, Command> gameCommand = new HashMap<>();
        gameCommand.put("/manual", new ManualGame());
        gameCommand.put("/start", new StartGame());
        gameCommand.put("/exit", new ExitGame());
        while (!exit) {
            try {
                ICommand iCommand = gameCommand.get(command);
                iCommand.execute();
                exit = true;
            } catch (Exception exception) {
                System.out.println("Не понял команду!");
                command = inputLine.getInputLine();
            }
        }
    }


    /**
     * Метод для настройки игрового сеанса(метод  ввода и проверки кол-ва игроков.)
     */
    public void setAndCheckCorrectSettingsOfGame() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            countOfPlayers = in.nextInt();
            in.nextLine();
            if (countOfPlayers >= 2 && countOfPlayers <= 4) {
                System.out.println("Количесво игроков в игре: " + countOfPlayers );
            } else {
                System.out.println("Количесво игроков не может быть меньше 2 или больше 4!\nПовторите ввод.");
                setAndCheckCorrectSettingsOfGame();
            }
        } else {
            System.out.println("Некорректный ввод!\nПовторите попытку.");
            setAndCheckCorrectSettingsOfGame();
        }
    }

    /**
     * Метод ввода имен игроков.
     */
    public void setNamesOfPlayers() {
        Console inputLine = new Console();
        System.out.print("Введите имена игроков.\n");
        for (int i = 0; i < countOfPlayers; i++) {
            System.out.println((i+1)+":");
            String s = inputLine.getInputLine();
            if (s.equals("")) {
                while (s.equals("")) {
                    System.out.println("Имя не может быть пустой строкой!\nПовторите ввод!\n"+(i+1)+":");
                    s = inputLine.getInputLine();
                }
            }

                namesOfPlayers.add(s);
        }
        MenuVisual.getNamesOfPlayers();
    }


}
