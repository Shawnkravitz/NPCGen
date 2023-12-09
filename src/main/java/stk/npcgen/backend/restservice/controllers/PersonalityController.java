package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Description;

@RestController
public class PersonalityController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/personality")
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
                        		"Values freedom above all, loyal to their tribe, but struggles with a quick temper.",
                        	    "Upholds honor, reveres an ancestral weapon, but is overconfident in their abilities.",
                        	    "Believes in the survival of the fittest, deeply connected to the wilds, but is impatient.",
                        	    "Cherishes strength, bound by a promise to a fallen comrade, but fears showing weakness.",
                        	    "Seeks justice, dedicated to avenging a past wrong, but harbors deep-seated anger.",
                        	    "Desires peace, remembers the teachings of a lost mentor, but struggles with inner turmoil.",
                        	    "Values honesty, holds a deep love for family, but is brutally blunt to a fault.",
                        	    "Pursues freedom, haunted by a past failure, but harbors a fear of confinement.",
                        	    "Embraces challenge, driven by a competitive spirit, but often acts recklessly.",
                        	    "Seeks self-improvement, reveres nature’s beauty, but is susceptible to temptations."
                        	};
                        return character;
                    case "Bard":
                    	character = new String[] {
                    			 "Sees art in everything, devoted to a mentor, but obsessed with appearance and talent.",
                    			    "Desires to learn and teach, pines for a lost love, but harbors a dark secret.",
                    			    "Strives to bring joy, always sings songs from their hometown, but has a gambling weakness.",
                    			    "Values creativity, seeks to emulate a legendary hero, but struggles with envy.",
                    			    "Cherishes freedom, inspired by a traveling troupe, but fears commitment.",
                    			    "Believes in the power of words, loyal to an old friend, but struggles with pride.",
                    			    "Seeks to entertain, driven by the memory of a joyful event, but is prone to exaggeration.",
                    			    "Pursues knowledge, dedicated to preserving ancient lore, but is overly critical.",
                    			    "Values friendship, always carries a token from a loved one, but has trust issues.",
                    			    "Desires fame, obsessed with a rival's success, but fears being forgotten."
                    			};
                        return character;
                        
                    case "Cleric":
                    	character = new String[] {
                    			"Believes in helping others, dedicated to their temple, but faces a crisis of faith.",
                    		    "Seeks to spread their deity's teachings, bonded to a sacred relic, but doubts their deity.",
                    		    "Fights against evil, driven by a vision of a better world, but acts recklessly at times.",
                    		    "Values compassion, cherishes a family heirloom, but struggles with personal greed.",
                    		    "Seeks knowledge, guided by divine dreams, but fears the unknown.",
                    		    "Cherishes life, loyal to their community, but is haunted by a past mistake.",
                    		    "Upholds justice, dedicated to a cause, but struggles with a desire for revenge.",
                    		    "Values humility, remembers a humble upbringing, but is prone to jealousy.",
                    		    "Pursues truth, seeks to fulfill a prophecy, but is secretive about their past.",
                    		    "Believes in redemption, bound by a promise to a lost love, but harbors a forbidden desire."
                    		};
                        return character;
                    case "Druid":
                    	character = new String[] {
                    			 "Respects the balance of nature, feels a deep connection to a sacred grove, but is distrustful of city folk.",
                    			    "Cherishes freedom, guided by the spirit of an animal companion, but struggles with civilization’s rules.",
                    			    "Seeks harmony, bound to protect an ancient artifact, but harbors a fear of fire.",
                    			    "Values the cycle of life, follows the teachings of a druidic circle, but is haunted by a past tragedy.",
                    			    "Pursues knowledge, collects rare seeds and plants, but is overly obsessive about their collection.",
                    			    "Desires peace, remembers the destruction of a beloved forest, but struggles with anger towards defilers.",
                    			    "Upholds tradition, dedicated to an ancestral path, but is resistant to change.",
                    			    "Values simplicity, cherishes a simple token from their homeland, but is naive about the wider world.",
                    			    "Believes in self-sufficiency, loyal to a band of outcasts, but is overly suspicious.",
                    			    "Seeks to restore balance, guided by visions of nature, but is plagued by a sense of impending doom."
                    			};
                        return character;
                    case "Fighter":
                    	character = new String[] {
                    			"Values discipline, dedicated to mastering their craft, but struggles with arrogance.",
                    		    "Seeks glory, inspired by tales of legendary warriors, but is reckless in pursuit of fame.",
                    		    "Upholds duty, loyal to a military unit, but harbors a deep-seated grudge.",
                    		    "Cherishes honor, adheres to a strict code, but is inflexible to a fault.",
                    		    "Pursues mastery, driven by a competitive spirit, but is envious of others’ success.",
                    		    "Believes in protection, committed to defending their homeland, but is overprotective.",
                    		    "Seeks adventure, carries a memento from a fallen comrade, but has a fear of loss.",
                    		    "Values strength, proud of their battle scars, but struggles with vulnerability.",
                    		    "Upholds justice, seeks to right a past wrong, but is blinded by vengeance.",
                    		    "Desires respect, guided by a mentor’s teachings, but is quick to anger."
                    		};
                        return character;
                    case "Monk":
                    	character = new String[] {
                    			 "Values inner peace, seeks enlightenment, but struggles with earthly desires.",
                    			    "Upholds discipline, follows a strict monastic tradition, but is rigid in beliefs.",
                    			    "Cherishes simplicity, remembers a humble origin, but is distrustful of wealth.",
                    			    "Seeks balance, guided by a spiritual journey, but is conflicted by inner turmoil.",
                    			    "Believes in self-control, disciplined in martial arts, but harbors a secret passion.",
                    			    "Pursues perfection, inspired by a legendary monk, but is overly critical of self and others.",
                    			    "Values serenity, dedicated to meditation, but is aloof and detached.",
                    			    "Cherishes harmony, connected deeply with a natural sanctuary, but fears chaos and disorder.",
                    			    "Upholds tradition, loyal to a monastic order, but struggles with doubt.",
                    			    "Seeks knowledge, carries scriptures of ancient wisdom, but is haunted by a fear of ignorance."
                    			};
                        return character;
                    case "Paladin":
                    	character = new String[] {
                    			"Driven by a quest for justice, loyal to a sacred oath, but often struggles with self-righteousness.",
                    		    "Upholds the ideals of honor and duty, bound to protect a holy site, but is inflexible in their views.",
                    		    "Seeks to vanquish evil, inspired by a divine vision, but is haunted by a past failure.",
                    		    "Cherishes the virtue of compassion, committed to a charitable order, but struggles with personal pride.",
                    		    "Pursues righteousness, carries a relic of a saint, but is tempted by worldly desires.",
                    		    "Believes in redemption, dedicated to atoning for a past sin, but harbors a forbidden love.",
                    		    "Values courage, remembers the teachings of a fallen mentor, but fears their own inadequacy.",
                    		    "Driven by a sense of destiny, sworn to avenge an injustice, but is blind to their own flaws.",
                    		    "Upholds the law, loyal to a sovereign ruler, but struggles with a vengeful streak.",
                    		    "Seeks to protect the innocent, guided by prophetic dreams, but is wary of trusting others."
                    		};
                        return character;
                    case "Ranger":
                    	character = new String[] {
                    			 "Values the sanctity of nature, dedicated to protecting a wild region, but distrusts civilization.",
                    			    "Driven by the thrill of the hunt, loyal to a pack of animal companions, but struggles with solitude.",
                    			    "Seeks knowledge of the wilderness, remembers the path shown by a mentor, but harbors a deep-seated revenge.",
                    			    "Cherishes freedom, guided by a wanderlust spirit, but is haunted by a tragic loss.",
                    			    "Upholds the balance of nature, bound to eradicate a particular threat, but is obsessive in pursuit.",
                    			    "Believes in self-reliance, carries a token from their upbringing, but is suspicious of strangers.",
                    			    "Pursues mastery of survival skills, inspired by legendary explorers, but is competitive to a fault.",
                    			    "Values stealth and cunning, trained in guerilla tactics, but struggles with paranoia.",
                    			    "Driven by curiosity, seeks to map uncharted lands, but is fearful of confinement.",
                    			    "Seeks to preserve natural order, guided by omens and signs, but is resistant to change."
                    			};
                        return character;
                    case "Rogue":
                    	character = new String[] {
                    			"Values cunning and resourcefulness, loyal to a thieves' guild, but struggles with greed.",
                    		    "Driven by a thirst for adventure, cherishes a locket from a lost love, but is haunted by a past betrayal.",
                    		    "Seeks wealth and power, guided by a desire for revenge, but is distrustful of others.",
                    		    "Cherishes freedom, remembers the thrill of their first heist, but fears capture.",
                    		    "Upholds a personal code of honor, bound to repay a debt, but is tempted by risky ventures.",
                    		    "Believes in survival at all costs, carries a keepsake from a forgotten home, but struggles with loneliness.",
                    		    "Pursues knowledge, inspired by tales of a legendary spy, but is overly secretive.",
                    		    "Values quick thinking, trained in the art of escape, but is claustrophobic.",
                    		    "Driven by curiosity, seeks to uncover hidden truths, but is reckless in pursuit.",
                    		    "Seeks to challenge authority, guided by a mocking spirit, but is prone to overconfidence."
                    		};
                        return character;
                    case "Sorcerer":
                    	character = new String[] {
                    			"Driven by a desire to understand their innate powers, loyal to a mentor who helps control them, but fears losing control.",
                    		    "Cherishes their unique abilities, seeks to uncover the origin of their powers, but struggles with feelings of alienation.",
                    		    "Believes in using magic for the greater good, bonded to a magical heirloom, but is haunted by a dark prophecy.",
                    		    "Values freedom and self-expression, inspired by the unpredictable nature of their magic, but is impulsive.",
                    		    "Seeks to master their arcane abilities, guided by a vision of a magical entity, but is wary of others’ intentions.",
                    		    "Upholds the responsibility that comes with power, dedicated to protecting a secret, but struggles with paranoia.",
                    		    "Driven by a quest for knowledge, carries a tome of arcane lore, but is obsessed with uncovering forbidden magic.",
                    		    "Values creativity and innovation, fascinated by the potential of their magic, but is reckless in experimentation.",
                    		    "Believes in destiny, follows the path set by a mystical sign, but is fearful of an unknown future.",
                    		    "Seeks to balance their magical abilities, remembers the lessons from a tragic accident, but is burdened by guilt."
                    		};
                        return character;
                    case "Warlock":
                    	character = new String[] {
                    			"Values the power granted by their patron, dedicated to fulfilling their pact, but struggles with moral dilemmas.",
                    		    "Driven by a quest for knowledge, bound to an ancient tome, but is secretive about their patron.",
                    		    "Seeks to wield their power responsibly, inspired by a vision, but fears their patron's true intentions.",
                    		    "Cherishes their newfound abilities, committed to a cause larger than themselves, but is wary of dependency.",
                    		    "Upholds a sense of independence, guided by cryptic messages, but is haunted by a fear of betrayal.",
                    		    "Believes in using their power for personal gain, carries a symbol of their pact, but struggles with trust issues.",
                    		    "Pursues forbidden knowledge, drawn to the mysteries of the universe, but is obsessive in their studies.",
                    		    "Values the cunning their patron teaches, remembers the allure of dark power, but is fearful of losing their soul.",
                    		    "Driven by ambition, seeks to rise in power, but is blind to the consequences.",
                    		    "Seeks to break free from their patron's grasp, guided by a desire for redemption, but is conflicted by their reliance."
                    		};
                        return character;
                    case "Wizard":
                    	character = new String[] {"Values knowledge above all, dedicated to their studies, but struggles with arrogance.",
                    		    "Driven by a thirst for arcane power, cherishes an ancient spellbook, but is secretive about their research.",
                    		    "Seeks to understand the mysteries of magic, inspired by a legendary wizard, but fears the unknown.",
                    		    "Cherishes the pursuit of wisdom, committed to a scholarly order, but is detached from worldly matters.",
                    		    "Upholds the responsibility of magic, guided by a moral code, but is haunted by a past experiment gone wrong.",
                    		    "Believes in the practical application of magic, carries a gadget of their own invention, but is overly critical.",
                    		    "Pursues mastery of spells, drawn to magical artifacts, but is obsessive about collecting them.",
                    		    "Values logic and reason, remembers the teachings of a mentor, but struggles with emotional connections.",
                    		    "Driven by curiosity, seeks to explore ancient ruins, but is reckless in the pursuit of discovery.",
                    		    "Seeks to balance magical theory with practice, guided by a sense of discovery, but is paranoid about intellectual theft."
                    		};
                        return character;
                    default:
                        System.out.println("Unknown class! Are you sure you're in the right realm?");
                        return character;
                }
            }
        }
}
