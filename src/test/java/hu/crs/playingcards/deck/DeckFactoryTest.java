package hu.crs.playingcards.deck;

import hu.crs.playingcards.domain.Card;
import hu.crs.playingcards.domain.DeckType;
import hu.crs.playingcards.domain.PlayingCard;
import hu.crs.playingcards.domain.Wildcard;
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
        assertThat(deck.cards, hasSize(52));
        assertThat(deck.cards, containsInAnyOrder(Card.values()));
    }

    @Test
    void shouldCreateStandardDeckWithJoker1() {
        //when
        var deck = DeckFactory.createDeck(DeckType.STANDARD_JOKER1);

        //then
        assertThat(deck, is(notNullValue()));
        assertThat(deck.cards, hasSize(53));

        PlayingCard[] playingCards = new PlayingCard[53];
        System.arraycopy(Card.values(), 0, playingCards, 0, 52);
        playingCards[52] = Wildcard.RED_JOKER;

        assertThat(deck.cards, containsInAnyOrder(playingCards));
    }
}