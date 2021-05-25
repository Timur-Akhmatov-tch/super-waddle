package com.company.view;

import java.util.Scanner;

/**
 * Класс взаимодействия с пользователем.
 */
public class Console {


    Scanner in = new Scanner(System.in);

    /**
     * Ввод новой строки пользователем.
     */
    public  String getInputLine() {
        return  in.nextLine();
    }



    }

