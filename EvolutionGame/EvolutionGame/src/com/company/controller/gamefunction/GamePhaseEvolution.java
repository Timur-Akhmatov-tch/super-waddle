package com.company.controller.gamefunction;

import com.company.controller.GameMenu;
import com.company.model.HandPlayer;
import com.company.model.Player;


public class GamePhaseEvolution {
    Player[] playersBase = new Player[GameMenu.countOfPlayers];
    public static int firstPlayer = 1+(int) (Math.random() *  GameMenu.countOfPlayers);

public void createPlayersAndDistributionCardsInHandsOfPlayers(){
    for(int i=0;i<GameMenu.countOfPlayers;i++){
        HandPlayer handOfCards = new HandPlayer();
        handOfCards.startDistributionCardsInHand();
        Player player = new Player(i,GameMenu.namesOfPlayers.get(i),handOfCards);


        System.out.println(player.getHandOfCards().visualCardsInHand());
        playersBase[i]=player;

    }


   /* for(int i=0;i<GameMenu.countOfPlayers;i++){
        //System.out.println(playersBase[i].getPlayerId() + ": "+playersBase[i].getName()+" "+playersBase[i].getHandOfCards().cardInHandOfPlayer.get(i).properties);
        System.out.println(playersBase[i].getPlayerId() + ": " + playersBase[i].getName()+" " + playersBase[i].getHandOfCards().visualCardsInHand());
    }*/
}



    }
