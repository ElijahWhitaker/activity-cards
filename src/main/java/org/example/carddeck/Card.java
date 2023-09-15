package org.example.carddeck;

public class Card {

    private Suit suit;
    private FaceValue value;

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
    }

    public Card(FaceValue value) {
        this.value = value;
    }
}
