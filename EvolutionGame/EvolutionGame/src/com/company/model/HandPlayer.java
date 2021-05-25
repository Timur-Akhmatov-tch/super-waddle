package com.company.model;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Класс для создания сущности рука игрок
 */
public class HandPlayer {

    /**
     *  динамический массив для хранения карт в руке игрока
     */
    public ArrayList<Card> cardsInHandOfPlayer =new ArrayList<>();

    /**
     *  Принимает массив (колоду карт)
     */
    Stack<Card> deck = Deck.deck;

    /**
     * Метод для раздачи карт в начале игры
     */
    public void startDistributionCardsInHand() {

        for(int i=0; i< 6; i++){
            addCardInHand();
        }
        System.out.println( "Размер массива карт в руке:"+cardsInHandOfPlayer.size());
        // для визуализаци
        /*for(int i=0; i < 6; i++){
            System.out.println(i+" "+cardInHandOfPlayer.get(i).animalIsActive+" "+cardInHandOfPlayer.get(i).properties);
        }*/

    }
    public String visualCardsInHand(){
        String cards = "Ты лох , я не буду выводить!";
      for(int i=0; i < 6; i++){
           cards = " " + cardsInHandOfPlayer.get(i).properties;
        }
     return cards;
    }

    /**
     * Метод для добавления карт по ходу игры
     */
    public void addCardInHand() {
        cardsInHandOfPlayer.add(deck.pop());
    }



}


