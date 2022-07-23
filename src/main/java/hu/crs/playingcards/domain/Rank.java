package hu.crs.playingcards.domain;

import org.springframework.util.StringUtils;

import java.util.Locale;

public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    @Override
    public String toString() {
        return StringUtils.capitalize(this.name().toLowerCase(Locale.ROOT));
    }
}
