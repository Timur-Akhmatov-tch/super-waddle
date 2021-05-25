package com.company.model;

import java.util.ArrayList;

/**
 * Сущность карт
 */
public class Card {
    /**
     * animal - возможность создать животное
     */
    public boolean animalIsActive;

    /**
     * property - Возможность придать свойство существу
     */
    public ArrayList<String> properties;

    public Card (boolean animal, ArrayList<String> properties){
        this.animalIsActive = animal;
        this.properties = properties;
    }


}
