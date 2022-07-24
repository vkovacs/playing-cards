package hu.crs.playingcards.deck;

import hu.crs.playingcards.domain.Card;
import hu.crs.playingcards.domain.Deck;
import hu.crs.playingcards.domain.DeckType;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DeckFactory {
    public static Deck createDeck(DeckType deckType) {
        switch (deckType) {
            case STANDARD -> {
                var deck = Arrays.stream(Card.values())
                        .collect(Collectors.toCollection(ArrayDeque::new));
                return new Deck(deck);
            }

            default -> throw new UnsupportedOperationException();
        }
    }
}
