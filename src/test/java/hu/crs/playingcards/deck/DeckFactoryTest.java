package hu.crs.playingcards.deck;

import hu.crs.playingcards.domain.Card;
import hu.crs.playingcards.domain.DeckType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

class DeckFactoryTest {
    @Test
    void shouldCreateStandardDeck() {
        //when
        var deck = DeckFactory.createDeck(DeckType.STANDARD);

        //then
        assertThat(deck, is(notNullValue()));
        assertThat(deck.cards(), hasSize(52));
        assertThat(deck.cards(), containsInAnyOrder(Card.values()));
    }
}