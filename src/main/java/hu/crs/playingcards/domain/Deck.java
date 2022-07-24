package hu.crs.playingcards.domain;

import java.util.Deque;

public record Deck(Deque<Card> cards) {
}
