package hu.crs.playingcards.domain;

import lombok.RequiredArgsConstructor;

import static hu.crs.playingcards.domain.Rank.*;
import static hu.crs.playingcards.domain.Suit.*;

@RequiredArgsConstructor
public enum Card {
    ACE_OF_SPADES(ACE, SPADES, "🂡"),
    ACE_OF_HEARTS(ACE, HEARTS, "🂱"),
    ACE_OF_DIAMONDS(ACE, DIAMONDS, "🃁"),
    ACE_OF_CLUBS(ACE, CLUBS, "🂡");

    private final Rank rank;
    private final Suit suit;
    private final String unicodeImage;
    }
