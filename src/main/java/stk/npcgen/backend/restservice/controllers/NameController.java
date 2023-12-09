package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Name;

@RestController
public class NameController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/name")
	public Name name(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Name(counter.incrementAndGet(), String.format(generateName()));
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
