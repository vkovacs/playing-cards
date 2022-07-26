package hu.crs.playingcards.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

import java.util.Locale;

@RequiredArgsConstructor
public enum Suit {
    CLUBS("♣"), DIAMONDS("♦"), HEARTS( 	"♥"), SPADES("♠");

    private final String unicodeImage;

    @Override
    public String toString() {
        return StringUtils.capitalize(this.name().toLowerCase(Locale.ROOT));
    }
}
