package com.company;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt = new ArrayList<Card>();
    private ArrayList<Card> Dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suit, int[] pointValue) {

        for (int i = 0; i < rank.length; i++) {

            unDealt.add(new Card(rank[i],suit[i],pointValue[i]));
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
        else

        while(unDealt.size()>0) {
            Card returned = unDealt.get(0);
            unDealt.remove(0);
            Dealt.add(returned);
            return returned;

        }
        return null;
    }

    public void shuffle() {

        unDealt.addAll(Dealt);
        Dealt.clear();

        for (int k = 52; k > 0; k --) {
            int random = (int) (Math.random() * (52));

            Card temp = unDealt.get(random);
            unDealt.set(random, unDealt.get(k));
            unDealt.set(k, temp);
        }
    }
}
