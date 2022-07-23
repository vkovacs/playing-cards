package hu.crs.playingcards.domain;

import org.springframework.util.StringUtils;

import java.util.Locale;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return StringUtils.capitalize(this.name().toLowerCase(Locale.ROOT));
    }
}
