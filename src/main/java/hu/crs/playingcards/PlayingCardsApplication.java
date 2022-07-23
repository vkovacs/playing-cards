package hu.crs.playingcards;

import hu.crs.playingcards.domain.Card;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayingCardsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlayingCardsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(Card.ACE_OF_CLUBS.getUnicodeImage());
	}
}
