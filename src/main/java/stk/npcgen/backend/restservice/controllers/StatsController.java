package stk.npcgen.backend.restservice.controllers;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Description;

@RestController
public class StatsController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/stats")
	public Description description(@RequestParam(value = "stats", defaultValue = "A Mysterious Figure") String description) {
		return new Description(String.format(generateDescription()));
	}
	
    private static final Random random = new Random();

    public static int roll4d6DropLowest() {
        int[] rolls = new int[4];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }
        Arrays.sort(rolls);
        return rolls[1] + rolls[2] + rolls[3]; // Sum the three highest rolls
    }
    
    public static String getFormattedStat(int stat) {
        int modifier = (stat - 10) / 2;
        return String.format("%d (%+d)", stat, modifier);
    }

    public static String generateStats() {
        int[] stats = new int[6];
        for (int i = 0; i < stats.length; i++) {
            stats[i] = roll4d6DropLowest();
        }
        String formattedStats = "STR " + getFormattedStat(stats[0]) + "\n" +
                                "DEX " + getFormattedStat(stats[1]) + "\n" +
                                "CON " + getFormattedStat(stats[2]) + "\n" +
                                "INT " + getFormattedStat(stats[3]) + "\n" +
                                "WIS " + getFormattedStat(stats[4]) + "\n" +
                                "CHA " + getFormattedStat(stats[5]);
        return formattedStats;
    }


        public static String generateDescription() {
            return generateStats();
        }
}
