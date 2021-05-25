package com.company.model;

public class Player {

    private int playerId;
    private String name;
    private HandPlayer handOfCards;

    /**
     * Конструктор сущности: Игрок
     * @param playerId ID игрока
     * @param name имя игрока
     * @param handOfCards карты в руке игрока
     */
    public Player(int playerId, String name, HandPlayer handOfCards){
        this.playerId = playerId;
        this.name = name;
        this.handOfCards = handOfCards;
    }

    /**
     * Метод для получения номера игрока
     * @return ID игрока
     */
    public  int getPlayerId(){
        return this.playerId;
    }

    /**
     * Метод для получения имени игрока
     * @return имя игрока
     */
    public  String getName(){
        return this.name;
    }

    /**
     * Метод для получения массива карт игрока
     * @return карты в руке игрока
     */
    public HandPlayer getHandOfCards(){
        return this.handOfCards;
    }

    /**
     * Метод для установления номера определенного игрока
     * @param playerId ID игрока
     */
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    /**
     * Метод для установления имени определенного игрока
     * @param name имя игрока
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Метод для передачи карт определенному игроку
     * @param handOfCards карты в руке игрока
     */
    public void setHandOfCards(HandPlayer handOfCards){
        this.handOfCards = handOfCards;
    }

}
