package pl.asprojects.nosItems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.asprojects.nosItems.dto.CharacterBasicInfoDto;
import pl.asprojects.nosItems.dto.NewItemDto;
import pl.asprojects.nosItems.service.CharacterService;
import pl.asprojects.nosItems.service.ItemService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/nos/inventory")
public class InventoryController {

    @Autowired
    CharacterService characterService;

    @Autowired
    ItemService itemService;

    @GetMapping("finditem")
    public List<CharacterBasicInfoDto> findProductOwners(@RequestParam("itemName") String itemName){
        return characterService.findItemOwnersAsDTO(itemName);
    }

    @PostMapping(value = "newitem", consumes = APPLICATION_JSON_VALUE)
    public void addItem(@RequestBody NewItemDto newItem) {
        itemService.addItem(newItem);
    }

}
