package hu.crs.playingcards.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

import java.util.Locale;

@RequiredArgsConstructor
public enum Wildcard implements PlayingCard{
    RED_JOKER("🃟"),
    BLACK_JOKER("🃏");

    private final String unicodeImage;

    @Override
    public String toString() {
        return StringUtils.capitalize(this.name().toLowerCase(Locale.ROOT));
    }
}
