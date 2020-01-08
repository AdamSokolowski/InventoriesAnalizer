package pl.asprojects.nosItems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.asprojects.nosItems.dto.AccountDto;
import pl.asprojects.nosItems.dto.NewAccountDto;
import pl.asprojects.nosItems.service.CharacterService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/nos/account")
public class AccountController {

    @Autowired
    CharacterService characterService;

    @PostMapping(value = "newaccount", consumes = APPLICATION_JSON_VALUE)
    public void addAccount(@RequestBody NewAccountDto newAccount) {
        characterService.addAccount(newAccount);
    }

    @GetMapping("getaccounts")
    public List<AccountDto> getAccounts(){
        return characterService.getAllAccountsAsDTO();
    }
}
