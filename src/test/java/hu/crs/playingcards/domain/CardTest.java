package hu.crs.playingcards.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CardTest {
    @Test
    void shouldShowStringRepresentationPass() {
        assertThat(Card.ACE_OF_SPADES.toString(), is("Ace of Spades"));
    }
}