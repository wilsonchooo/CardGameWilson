package com.company;

import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args){

        String [] rank = new String[53];
        String[] suit = new String[53];
        int[] pointvalue = new int[53];
        String[] RankNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int[] PointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] SuitNames = {"Diamonds", "Clubs", "Hearts", "Spades"};
        for (int i =0; i<RankNames.length;i++)
        {
            for (int j =0;j<SuitNames.length;j++)
            {
                //cards.add(new Card(RankNames[i],SuitNames[j], PointValues[i]));
                rank[(i*4)+j]=RankNames[i];
                suit[(i*4)+j]=SuitNames[j];
                pointvalue[(i*4)+j]=PointValues[i];
            }
        }

        Deck deck = new Deck(rank,suit,pointvalue);

        for(int i =0;i<rank.length-1;i++)
        {
            System.out.println(deck.deal());
        }

        System.out.println("");
        System.out.println("Shuffled");
        System.out.println("");

        deck.shuffle();
        for(int i =0;i<rank.length-1;i++)
        {
            System.out.println(deck.deal());
        }

    }


}
