package com.company.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;



/**
 * Класс описывающий сущность колода.
 */
public class Deck {

       public static Stack<Card> deck = creatingDeck();
    /**
     * Метод для генерации колод.
     * @return сгенерированная колода
     */

    private static Stack<Card> creatingDeck(){
Stack<Card> deck = new Stack<>();
Card[] deckStart = new Card[84];
String[] deckProperties = new String[]{Properties.CAMOUFLAGE.toString(),Properties.BURROWING.toString(),
        Properties.SHARP_VISION.toString(),Properties.SYMBIOSIS.toString(),Properties.PIRACY.toString(),
        Properties.STOMPERS.toString(),Properties.DROPPING_TAIL.toString(),Properties.HIBERNATION.toString(),
        Properties.POISONOUS.toString(),Properties.INTERACTION.toString(),Properties.SCAVENGER.toString(),
        Properties.FAST.toString(),Properties.MIMICRY.toString(),Properties.WATER_FLOATING.toString(),
        Properties.PARASITE.toString(),Properties.PREDATOR.toString(),Properties.FAT_RESERVE.toString(),
        Properties.COOPERATION.toString(),Properties.BIG.toString()};
int countOfCards =0;
        countOfCards=creatingCardInDeck1_13(countOfCards,deckProperties,deckStart);
        countOfCards= creatingCardInDeck14(countOfCards,deckProperties,deckStart);
        countOfCards= creatingCardInDeck15_16(countOfCards,deckProperties,deckStart);
        creatingCardInDeck17_19(countOfCards,deckProperties,deckStart);


        Collections.shuffle(Arrays.asList(deckStart));

        for(int i=0; i<84; i++) {
            deck.push(deckStart[i]);
        }
//для визуализации колоды
       /* for(int i=0; i<84; i++) {
            System.out.println(deck.elementAt(i).properties);
        }*/

        return deck;

    }

    /**
     * Метод создания карт в колоде с одним свойством (с 1 по 13 карту)
     * @param countOfCards счетчик карт
     * @param deckProperties массив свойств карт.
     * @param deckStart массив карт.
     * @return счетчик карт.
     */
    private static int creatingCardInDeck1_13(int countOfCards, String[] deckProperties, Card[] deckStart){
        for(int i=0;i<13;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[i]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;

            }
        }
        return countOfCards;
    }

    /**
     * Метод создания карт в колоде со свойством ВОДОПЛАВАЮЩЕЕ(14)
     * @param countOfCards счетчик карт
     * @param deckProperties массив свойств карт.
     * @param deckStart массив карт.
     * @return счетчик карт.
     */
    private static int creatingCardInDeck14(int countOfCards, String[] deckProperties, Card[] deckStart){
        for(int i=13;i<14;i++) {
            for (int j = 0; j < 8; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[i]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;
            }
        }
        return countOfCards;
    }
    /**
     * Метод создания карт в колоде с двумя свойствами (с 14 по 16 карту)
     * @param countOfCards счетчик карт
     * @param deckProperties массив свойств карт.
     * @param deckStart массив карт.
     */
    private static int creatingCardInDeck15_16(int countOfCards, String[] deckProperties, Card[] deckStart){
        for(int i=14;i<15;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[14]);
                properties.add(deckProperties[15]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;
            }
        }
        for(int i=15;i<16;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[14]);
                properties.add(deckProperties[16]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;

            }
        }
        for(int i=16;i<17;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[17]);
                properties.add(deckProperties[15]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;
            }
        }
        return countOfCards;
    }

    /**
     * Метод создания карт в колоде с двумя свойствами (с 17 по 19 карту)
     * @param countOfCards счетчик карт
     * @param deckProperties массив свойств карт.
     * @param deckStart массив карт.
     */
    private static void creatingCardInDeck17_19(int countOfCards, String[] deckProperties, Card[] deckStart){
        for(int i=17;i<18;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[17]);
                properties.add(deckProperties[16]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;

            }
        }
        for(int i=17;i<18;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[18]);
                properties.add(deckProperties[15]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;

            }
        }
        for(int i=18;i<19;i++) {
            for (int j = 0; j < 4; j++) {
                ArrayList<String> properties = new ArrayList<>();
                properties.add(deckProperties[18]);
                properties.add(deckProperties[16]);
                deckStart[countOfCards] = new Card(false, properties);
                countOfCards++;

            }
        }
    }
}
