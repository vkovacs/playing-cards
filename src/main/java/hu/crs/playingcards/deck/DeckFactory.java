package hu.crs.playingcards.deck;

import hu.crs.playingcards.domain.Card;
import hu.crs.playingcards.domain.DeckType;
import hu.crs.playingcards.domain.PlayingCard;
import hu.crs.playingcards.domain.Wildcard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DeckFactory {
    public static Deck createDeck(DeckType deckType) {
        var cards = Arrays.stream(Card.values())
                .map(PlayingCard.class::cast)
                .collect(Collectors.toList());

        switch (deckType) {
            case STANDARD -> {
                return new Deck(cards);
            }
            case STANDARD_JOKER1 ->  {
                cards.add(Wildcard.RED_JOKER);

                return new Deck(cards);
            }

            default -> throw new UnsupportedOperationException();
        }
    }
}
