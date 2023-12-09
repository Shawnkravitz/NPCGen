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
	public Description description(@RequestParam(value = "className", defaultValue = "Fighter") String className) {
	    System.out.println("Class received: " + className);
	    return new Description(String.format(generateDescription(className)));
	}

	
	

        private static final Random RANDOM = new Random();

        public String generateDescription(String className) {
        	final String[] FANTASY_CHARACTERS = selectDescription(className);
            return FANTASY_CHARACTERS[RANDOM.nextInt(FANTASY_CHARACTERS.length)];
        }
        
        private String[] selectDescription(String characterClass) {
        	{
        		String[] character = {"none"};

                switch (characterClass) {
                    case "Barbarian":
                        System.out.println("You have chosen the path of the Barbarian!");
                        // Barbarian-specific logic here
                        character = new String[] {
                        	    "A towering half-orc with scars crisscrossing his arms, wielding a massive battleaxe.",
                        	    "A feral human with wild eyes and long, untamed hair, roaring in the heat of battle.",
                        	    "An elf with intricate tribal tattoos, expertly handling a pair of handaxes.",
                        	    "A dwarf with braided beard, wearing furs, and hefting a warhammer.",
                        	    "A goliath with a weathered face, carrying a greatsword nearly as tall as they are.",
                        	    "A human with a mohawk, adorned in bones and teeth, swinging a spiked flail.",
                        	    "A dragonborn with red scales, their eyes blazing with fury as they wield a greataxe.",
                        	    "A tiefling with horns curling back from their head, brandishing a large maul.",
                        	    "A half-elf with a wild look, covered in tribal markings and wielding a spear.",
                        	    "A gnome with surprisingly bulging muscles, eagerly brandishing a heavy mace."
                        	};
                        return character;
                    case "Bard":
                    	character = new String[] {
                    		    "A charismatic human with a lute slung across their back, always ready with a song.",
                    		    "An elf with a hauntingly beautiful voice, playing a silver flute.",
                    		    "A halfling with a quick wit, telling stories and jokes while strumming a mandolin.",
                    		    "A gnome with a collection of strange instruments, always ready to perform.",
                    		    "A tiefling with a deep, melodious voice, playing a haunting melody on a viol.",
                    		    "A dragonborn with a powerful presence, their voice resonating as they recite epic poems.",
                    		    "A dwarf with a deep, rumbling voice, playing a drum made from monster hide.",
                    		    "A half-orc who surprises many with their delicate harp playing and sweet singing.",
                    		    "A tabaxi with a love for dance and song, often seen with a tambourine.",
                    		    "A high elf with a penchant for operatic performances, expertly playing a harpsichord."
                    		};
                        return character;
                        
                    case "Cleric":
                    	character = new String[] {
                    		    "A human clad in heavy armor, their holy symbol prominently displayed on their shield.",
                    		    "An elf with a serene expression, wielding a staff topped with a symbol of their deity.",
                    		    "A dwarf with a thick beard, carrying a warhammer and a tome of sacred texts.",
                    		    "A half-elf with a kind demeanor, offering blessings and healing with a gentle touch.",
                    		    "A dragonborn with scales the color of their deity, fervently praying before battle.",
                    		    "A tiefling with an air of solemnity, their prayers accompanied by faint, mystical light.",
                    		    "A gnome with a curious nature, carrying various holy relics and artifacts.",
                    		    "A halfling with a warm smile, spreading the teachings of their faith through parables.",
                    		    "A half-orc with a scarred face, showing a surprising depth of religious knowledge.",
                    		    "An aasimar whose eyes glow softly, their presence exuding calm and peace."
                    		};
                        return character;
                    case "Druid":
                    	character = new String[] {
                    		    "An elf with a deep connection to nature, their skin adorned with leafy patterns.",
                    		    "A human who shifts seamlessly into animal forms, a protector of the natural world.",
                    		    "A dwarf with a long, braided beard, conversing fluently with animal companions.",
                    		    "A half-elf whose eyes reflect the colors of the forest, carrying a staff of gnarled wood.",
                    		    "A gnome with a mischievous grin, surrounded by fluttering butterflies.",
                    		    "A tiefling with antlers, their presence accompanied by the sounds of the wilderness.",
                    		    "A halfling with a love for gardening, able to encourage plants to grow with a touch.",
                    		    "A dragonborn with scales resembling tree bark, whispering to the plants around them.",
                    		    "A tabaxi who moves with the grace of a panther, at home in the densest jungles.",
                    		    "A firbolg who speaks in a gentle, rumbling tone, a friend to all creatures of the forest."
                    		};
                        return character;
                    case "Fighter":
                    	character = new String[] {
                    		    "A human in full plate armor, expertly wielding a longsword and shield.",
                    		    "An elf with a keen eye, taking precise shots with a longbow from a distance.",
                    		    "A dwarf with a battle-scarred face, swinging a mighty war axe.",
                    		    "A half-orc with bulging muscles, intimidating foes with a massive two-handed sword.",
                    		    "A dragonborn whose breath weapon complements their skill in combat.",
                    		    "A gnome with a tactical mind, using a combination of crossbow and gadgets.",
                    		    "A tiefling with a flair for dramatic combat, wielding a rapier with precision.",
                    		    "A halfling who darts around the battlefield, striking quickly with dual daggers.",
                    		    "A tabaxi with lightning-fast reflexes, engaging enemies with a pair of curved blades.",
                    		    "An aarakocra who takes advantage of their flight to attack from above with a spear."
                    		};
                        return character;
                    case "Monk":
                    	character = new String[] {
                    		    "A human with a calm demeanor, their movements flowing like water.",
                    		    "An elf who moves with a grace that belies their deadly martial skills.",
                    		    "A dwarf with a disciplined mind, their fists as hard as stone.",
                    		    "A half-elf with tattoos symbolizing their spiritual journey, adept in hand-to-hand combat.",
                    		    "A dragonborn whose martial arts are enhanced by their draconic heritage.",
                    		    "A gnome with surprising agility, using speed to overcome larger foes.",
                    		    "A tiefling who channels their inner fire through disciplined martial arts.",
                    		    "A halfling with a cheerful attitude, capable of striking unexpectedly and swiftly.",
                    		    "A kenku who mimics the fighting styles of other warriors perfectly.",
                    		    "An aarakocra with a meditative nature, combining aerial maneuvers with strikes."
                    		};
                        return character;
                    case "Paladin":
                    	character = new String[] {
                    		    "A human in shining armor, their holy symbol glowing with divine energy.",
                    		    "An elf who champions the cause of justice, wielding a sword that gleams with light.",
                    		    "A dwarf with a steadfast determination, their hammer ready to smite evil.",
                    		    "A half-orc who seeks redemption, their faith as strong as their armor.",
                    		    "A dragonborn with a noble bearing, their presence inspiring allies in battle.",
                    		    "A gnome with a fierce commitment to their oath, agile in both word and deed.",
                    		    "A tiefling who overcomes prejudice with their unwavering sense of righteousness.",
                    		    "A halfling with a heart full of courage, standing against foes much larger than themselves.",
                    		    "A tabaxi with a zeal for adventure, their blade always ready for a just cause.",
                    		    "An aasimar whose radiant wings unfurl as they champion the cause of the downtrodden."
                    		};
                        return character;
                    case "Ranger":
                    	character = new String[] {
                    		    "A human with a keen eye for tracking, their bow never missing its mark.",
                    		    "An elf who moves silently through the forest, one with the natural world.",
                    		    "A dwarf with a deep knowledge of underground terrains, wielding dual axes.",
                    		    "A half-elf with an affinity for animals, their loyal wolf companion always at their side.",
                    		    "A dragonborn who tracks their prey with relentless determination.",
                    		    "A gnome with a knack for setting traps and an uncanny sense of direction.",
                    		    "A tiefling who uses their innate abilities to survive and hunt in harsh landscapes.",
                    		    "A halfling with a sharpshooter's precision, able to hit targets at great distances.",
                    		    "A tabaxi with cat-like reflexes, adept at climbing and leaping through trees.",
                    		    "An aarakocra who scouts from the sky, relaying information to their allies below."
                    		};
                        return character;
                    case "Rogue":
                    	character = new String[] {
                    		    "A human with a mysterious past, their fingers deftly handling lockpicks.",
                    		    "An elf with a shadowy presence, moving unseen and unheard.",
                    		    "A dwarf with a gruff demeanor, skilled in the art of stealth and subterfuge.",
                    		    "A half-orc with a surprising agility, using their strength for daring heists.",
                    		    "A dragonborn with a talent for espionage, their scaled hide blending into the shadows.",
                    		    "A gnome with a mischievous grin, always a step ahead of their pursuers.",
                    		    "A tiefling with a knack for deception, their charm as deadly as their dagger.",
                    		    "A halfling with quick hands, pilfering treasures unnoticed.",
                    		    "A tabaxi with a curiosity for secrets, adept at climbing and sneaking.",
                    		    "An aarakocra with an eye for valuable items, swooping in to claim their prize."
                    		};
                        return character;
                    case "Sorcerer":
                    	character = new String[] {
                    		    "A human whose eyes crackle with arcane energy, their magic wild and unpredictable.",
                    		    "An elf who channels ancient magic, their spells woven with graceful movements.",
                    		    "A dwarf with a fiery temperament, their hands sparking with magical power.",
                    		    "A half-elf with a natural affinity for magic, their spells as versatile as their heritage.",
                    		    "A dragonborn whose breath is not just a weapon, but also a source of magic.",
                    		    "A gnome whose boundless enthusiasm is matched by their arcane prowess.",
                    		    "A tiefling whose innate magic is tinged with the infernal, their spells both beautiful and fearsome.",
                    		    "A halfling whose cheerful demeanor belies their potent magical abilities.",
                    		    "A tabaxi fascinated by the arcane, their quick reflexes aiding in spellcasting.",
                    		    "An aarakocra who channels the magic of the sky, their spells often involving air and lightning."
                    		};
                        return character;
                    case "Warlock":
                    	character = new String[] {
                    		    "A human with a dark aura, their eyes reflecting the pact with their otherworldly patron.",
                    		    "An elf whose elegance masks the eldritch power at their command.",
                    		    "A dwarf who delves into forbidden knowledge, their spells tinged with darkness.",
                    		    "A half-orc who draws strength from a mysterious entity, their loyalty unshakable.",
                    		    "A dragonborn whose scales shimmer with unnatural energies, a sign of their pact.",
                    		    "A gnome with a mischievous patron, their magic as unpredictable as it is powerful.",
                    		    "A tiefling who embraces their infernal heritage, their magic both seductive and terrifying.",
                    		    "A halfling with a pact that belies their size, wielding magic that can bend reality.",
                    		    "A tabaxi who whispers to the shadows, their patron's gifts enhancing their stealth.",
                    		    "An aasimar whose celestial pact guides them, their magic radiant and purifying."
                    		};
                        return character;
                    case "Wizard":
                    	character = new String[] {
                    		    "A human with a tome of ancient spells, their knowledge vast and deep.",
                    		    "An elf who weaves magic with centuries of practice, their spells elegant and precise.",
                    		    "A dwarf whose magic is as solid and reliable as the mountains they love.",
                    		    "A half-elf with a diverse spellbook, reflecting their mixed heritage and adaptability.",
                    		    "A dragonborn whose intellectual pursuit of magic rivals their physical might.",
                    		    "A gnome with a natural talent for invention, their spells often accompanied by gadgets.",
                    		    "A tiefling whose keen intellect allows them to master complex arcane theories.",
                    		    "A halfling with a curious nature, always experimenting with new spells.",
                    		    "A tabaxi with a thirst for arcane knowledge, their spellcasting swift and graceful.",
                    		    "An aarakocra who focuses on elemental magic, their spells as fluid as the air they command."
                    		};
                        return character;
                    default:
                        System.out.println("Unknown class! Are you sure you're in the right realm?");
                        return character;
                }
            }
        }
}
