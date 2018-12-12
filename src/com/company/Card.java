package com.company;

public class Card {
    public String rank;
    public String suit;
    public int pointValue;

    public Card (String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank()
    {
        return this.rank;
    }
    public String getSuit()
    {
        return this.suit;
    }
    public int getPointValue()
    {
        return this.pointValue;
    }

    public boolean equals(Card othercard)
    {
        if (pointValue == othercard.pointValue )
        return true;

        else return false;
    }

    public String toString()
    {
        String temp = rank +" " +suit + " " + Integer.toString(pointValue);
        return temp;
    }
}
