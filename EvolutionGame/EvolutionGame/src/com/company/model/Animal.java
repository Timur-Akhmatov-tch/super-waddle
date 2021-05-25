package com.company.model;

/**
 * Абстрактная сущность животного
 */
public  class Animal {
    /**
     * Сытость
     */
    public int hunger;

    /**
     * Свойства
     */
    public String[] propertiesOfAnimal;

    /**
     * Отношения между животными;
     */
    public String[] relationship;

    /**
     * Конструктор животного.
     * @param hunger сытость.
     * @param propertiesOfAnimal свойства.
     * @param relationships отношения;
     */
    public Animal(int hunger,String[]propertiesOfAnimal,String[]relationships){

this.hunger =hunger;
this.propertiesOfAnimal= propertiesOfAnimal;
this.relationship = relationships;
}

}
