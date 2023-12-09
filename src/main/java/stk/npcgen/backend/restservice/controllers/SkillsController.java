package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Description;

@RestController
public class SkillsController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/skills")
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
                        	    "Athletics and Intimidation",
                        	    "Survival and Perception",
                        	    "Nature and Athletics",
                        	    "Intimidation and Animal Handling",
                        	    "Athletics and Survival",
                        	    "Perception and Intimidation",
                        	    "Athletics and Nature",
                        	    "Survival and Athletics",
                        	    "Intimidation and Survival",
                        	    "Athletics and Perception"
                        	};
                        return character;
                    case "Bard":
                    	character = new String[] {
                    		    "Performance and Persuasion",
                    		    "Deception and Acrobatics",
                    		    "Insight and Performance",
                    		    "Persuasion and Deception",
                    		    "History and Performance",
                    		    "Acrobatics and Sleight of Hand",
                    		    "Performance and Insight",
                    		    "Deception and Performance",
                    		    "Persuasion and History",
                    		    "Performance and Deception"
                    		};
                        return character;
                        
                    case "Cleric":
                    	character = new String[] {
                    			"Insight and Medicine",
                    		    "Religion and Persuasion",
                    		    "History and Insight",
                    		    "Medicine and Religion",
                    		    "Insight and Religion",
                    		    "Persuasion and Medicine",
                    		    "Religion and History",
                    		    "Insight and Persuasion",
                    		    "Medicine and History",
                    		    "Religion and Insight"
                    		};
                        return character;
                    case "Druid":
                    	character = new String[] {
                    			"Nature and Survival",
                    		    "Animal Handling and Insight",
                    		    "Medicine and Nature",
                    		    "Survival and Perception",
                    		    "Nature and Animal Handling",
                    		    "Insight and Medicine",
                    		    "Survival and Nature",
                    		    "Animal Handling and Survival",
                    		    "Perception and Medicine",
                    		    "Nature and Insight"
                    		};
                        return character;
                    case "Fighter":
                    	character = new String[] {
                    			 "Athletics and History",
                    			    "Survival and Perception",
                    			    "Acrobatics and Athletics",
                    			    "Insight and Intimidation",
                    			    "Athletics and Survival",
                    			    "Perception and History",
                    			    "Athletics and Acrobatics",
                    			    "Survival and Insight",
                    			    "Intimidation and Perception",
                    			    "Athletics and Intimidation"
                    			};
                        return character;
                    case "Monk":
                    	character = new String[] {
                    			 "Acrobatics and Stealth",
                    			    "Insight and Athletics",
                    			    "Stealth and History",
                    			    "Athletics and Acrobatics",
                    			    "Insight and Religion",
                    			    "Stealth and Insight",
                    			    "Acrobatics and Religion",
                    			    "Athletics and Stealth",
                    			    "History and Insight",
                    			    "Acrobatics and Athletics"
                    			};
                        return character;
                    case "Paladin":
                    	character = new String[] {
                    			 "Athletics and Persuasion",
                    			    "Intimidation and Religion",
                    			    "Medicine and Insight",
                    			    "Persuasion and History",
                    			    "Religion and Athletics",
                    			    "Insight and Medicine",
                    			    "Athletics and Intimidation",
                    			    "Persuasion and Religion",
                    			    "History and Insight",
                    			    "Medicine and Athletics"
                    			};
                        return character;
                    case "Ranger":
                    	character = new String[] {
                    			 "Survival and Perception",
                    			    "Nature and Stealth",
                    			    "Athletics and Animal Handling",
                    			    "Survival and Investigation",
                    			    "Perception and Nature",
                    			    "Stealth and Athletics",
                    			    "Animal Handling and Survival",
                    			    "Nature and Perception",
                    			    "Investigation and Athletics",
                    			    "Survival and Stealth"
                    			};
                        return character;
                    case "Rogue":
                    	character = new String[] {
                    			 "Stealth and Acrobatics",
                    			    "Deception and Insight",
                    			    "Perception and Sleight of Hand",
                    			    "Acrobatics and Investigation",
                    			    "Insight and Stealth",
                    			    "Deception and Perception",
                    			    "Sleight of Hand and Acrobatics",
                    			    "Investigation and Deception",
                    			    "Stealth and Perception",
                    			    "Acrobatics and Deception"
                    			};
                        return character;
                    case "Sorcerer":
                    	character = new String[] {
                    			 "Arcana and Persuasion",
                    			    "Deception and Insight",
                    			    "Intimidation and Arcana",
                    			    "Persuasion and Deception",
                    			    "Arcana and Intimidation",
                    			    "Insight and Persuasion",
                    			    "Deception and Arcana",
                    			    "Intimidation and Insight",
                    			    "Persuasion and Arcana",
                    			    "Deception and Intimidation"
                    			};
                        return character;
                    case "Warlock":
                    	character = new String[] {
                    			  "Arcana and Deception",
                    			    "Intimidation and Investigation",
                    			    "Persuasion and History",
                    			    "Deception and Arcana",
                    			    "Investigation and Intimidation",
                    			    "History and Persuasion",
                    			    "Arcana and Persuasion",
                    			    "Deception and History",
                    			    "Intimidation and Arcana",
                    			    "Persuasion and Investigation"
                    			};
                        return character;
                    case "Wizard":
                    	character = new String[] {
                    			 "Arcana and History",
                    			    "Investigation and Insight",
                    			    "History and Arcana",
                    			    "Insight and Investigation",
                    			    "Arcana and Insight",
                    			    "History and Investigation",
                    			    "Investigation and Arcana",
                    			    "Insight and History",
                    			    "Arcana and Investigation",
                    			    "History and Insight"
                    			};
                        return character;
                    default:
                        System.out.println("Unknown class! Are you sure you're in the right realm?");
                        return character;
                }
            }
        }
}
