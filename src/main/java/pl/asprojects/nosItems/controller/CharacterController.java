package pl.asprojects.nosItems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.asprojects.nosItems.dto.NewCharacterDto;
import pl.asprojects.nosItems.service.CharacterService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/nos/character")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping(value = "newcharacter", consumes = APPLICATION_JSON_VALUE)
    public void addCharacter(@RequestBody NewCharacterDto newCharacter) {
        characterService.addCharacter(newCharacter);
    }
}
