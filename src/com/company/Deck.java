package com.company;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] rank, String[] suit, int[] pointValue) {
        ArrayList<Card> unDealt = new ArrayList<Card>(rank.length);

        for (int i = 0; i < rank.length; i++) {

            unDealt.get(i).rank = rank[i];
            unDealt.get(i).suit = suit[i];
            unDealt.get(i).pointValue = pointValue[i];

        }
    }
    public boolean isEmpty()
    {
        if (unDealt.size() == 0)
        {
            return true;
        }
        else return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public Card deal ()
    {
        if (isEmpty()==true)
        {
            return null;
        }

        while(unDealt.size()>0) {
            Card returned = unDealt.get(0);
            unDealt.remove(0);
            Dealt.add(returned);
            return returned;

        }
        return null;
    }

    public void shuffle()
    {
        for (int i =0;i<Dealt.size();i++)
        {
            unDealt.add(Dealt.get(i));
            unDealt.remove(i);

        }

        for (int k=1;k<51;k++)
        {
            int r = (int)(Math.random()*k);
            
            Card temp = unDealt.get(k);
            unDealt.set(k,unDealt.get(r));
            unDealt.set(r,temp);

        }
    }
}
