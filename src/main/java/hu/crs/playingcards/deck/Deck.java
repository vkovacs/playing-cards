package hu.crs.playingcards.deck;

import hu.crs.playingcards.domain.PlayingCard;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Deck {
    final List<PlayingCard> cards;

    public Deck(List<PlayingCard> cards) {
        if (cards == null) {
            throw new IllegalArgumentException("Cards must not be null");
        }
        this.cards = cards;
    }

    public Optional<PlayingCard> nextCard() {
        if (!isEmpty()) {
            return Optional.of(cards.get(0));
        }

        return Optional.empty();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
