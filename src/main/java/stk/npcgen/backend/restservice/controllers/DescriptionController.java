package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Description;

@RestController
public class DescriptionController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/description")
	public Description description(@RequestParam(value = "description", defaultValue = "A Mysterious Figure") String description) {
		return new Description(String.format(generateDescription()));
	}
	
	private static final String[] FANTASY_CHARACTERS = {
            "An elf with long, silver hair and piercing blue eyes, wearing a cloak of emerald green that blends with the forest. A skilled archer, accompanied by a white wolf, possessing a mysterious aura and the ability to appear and disappear silently.",
            "A noble human paladin, clad in shining armor with a red cape. This character has a strong jawline, short, cropped hair, and a stern expression. Carries a large shield and sword, and is known for their unwavering sense of justice and bravery.",
            "A stout and muscular dwarf with a thick beard braided with golden rings. Wearing heavy armor and wielding a battle-axe, this character has a boisterous laugh and a heart of gold, renowned for their strength and loyalty in battle.",
            "An enigmatic wizard with flowing robes adorned with celestial patterns. They have a long, white beard and twinkling eyes. Carrying a staff topped with a glowing crystal, this character is a master of ancient spells and arcane knowledge.",
            "A sly rogue dressed in dark leathers, adept at moving through shadows. This character has sharp, cunning features and is armed with a set of daggers. Known for their agility and stealth, they are a master of lock-picking and disarming traps.",
            "A mystical mermaid with shimmering scales and long, flowing hair. She wields the power of the sea, casting spells with a trident. Her voice is enchanting, capable of soothing even the most troubled hearts or summoning fierce ocean storms.",
            "A clever gnome with a penchant for creating bizarre inventions. They have wild hair, bright eyes, and wear a belt filled with various tools. Always curious and full of ideas, this character is a genius at crafting gadgets and solving complex problems.",
            "An imposing orc shaman, with green skin and tribal tattoos. This character wears a necklace of bones and carries a totemic staff. They are revered for their wisdom and connection to the spirit world, offering guidance and performing ancient rituals.",
            "A tiny fairy sprite with iridescent wings that flutter rapidly. This character has a mischievous smile and loves to play pranks. They possess magical abilities to cast minor spells and can communicate with animals and plants.",
            "A dragonkin, with scales along their arms and piercing reptilian eyes. They wear robes that mimic the appearance of dragon wings. Known for their fiery breath and command over dragons, this sorcerer is a formidable and respected figure in the realm of magic."
        };

        private static final Random RANDOM = new Random();

        public static String generateDescription() {
            return FANTASY_CHARACTERS[RANDOM.nextInt(FANTASY_CHARACTERS.length)];
        }
}
