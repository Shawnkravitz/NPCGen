package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Greeting;

@RestController
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(generateName()));
	}
	
    private static final String[] FIRST_NAMES = {
            "Aeris", "Brin", "Caelum", "Drake", "Eira", "Faelan"
        };

        private static final String[] LAST_NAMES = {
            "Windrider", "Stormbringer", "Ironheart", "Shadowalker", "Moonwhisper"
        };

        private static final Random RANDOM = new Random();

        public static String generateName() {
            String firstName = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
            return firstName + " " + lastName;
        }
}
