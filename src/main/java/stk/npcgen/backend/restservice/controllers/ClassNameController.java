package stk.npcgen.backend.restservice.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stk.npcgen.backend.restservice.records.Description;

@RestController
public class ClassNameController {


	@GetMapping("/class")
	public Description description() {
		
		return new Description(String.format(generateDescription()));
	}
	
	
        String[] dndClasses = {
            "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", 
            "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(dndClasses.length);

        //String selectedClass = dndClasses[randomIndex];
    

        public String generateDescription() {
        	System.out.println(dndClasses[random.nextInt(dndClasses.length)]);
            return dndClasses[random.nextInt(dndClasses.length)];
        }
}
