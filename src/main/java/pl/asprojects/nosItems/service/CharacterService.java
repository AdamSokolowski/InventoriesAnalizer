package pl.asprojects.nosItems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pl.asprojects.nosItems.dto.*;
import pl.asprojects.nosItems.mapper.AccountMapper;
import pl.asprojects.nosItems.mapper.CharacterMapper;
import pl.asprojects.nosItems.model.AccountEntity;
import pl.asprojects.nosItems.model.CharacterClassEntity;
import pl.asprojects.nosItems.model.CharacterEntity;
import pl.asprojects.nosItems.model.InventoryEntity;
import pl.asprojects.nosItems.repository.AccountRepository;
import pl.asprojects.nosItems.repository.CharacterClassRepository;
import pl.asprojects.nosItems.repository.CharacterRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    CharacterMapper characterMapper;

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    CharacterClassRepository characterClassRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    InventoryService inventoryService;

    public List<CharacterEntity> findItemOwners(String itemName){
        Query query = entityManager.createQuery("SELECT DISTINCT character FROM CharacterEntity character" +
                " JOIN CharacterEntity.inventory inventory JOIN inventory.itemList itemList" +
                " JOIN itemList.item item" +
                " where item.name = :itemName");
        query.setParameter("itemName", itemName);
        return query.getResultList();
    }

    public List<CharacterBasicInfoDto> findItemOwnersAsDTO(String itemName){
        return characterMapper.basicInfoListDto(findItemOwners(itemName));
    }

    public CharacterEntity addCharacter(NewCharacterDto newCharacter) {
        CharacterEntity result = characterRepository.save(new CharacterEntity(0, newCharacter.getName(), 0, 0, 0, getCharacterClass(newCharacter.getCharacterClassDto()), getAccount(newCharacter.getAccount()), null));
         inventoryService.createEmptyInventory(result);
        return result;
    }

    public CharacterClassEntity addCharacterClass(String className) {
        return characterClassRepository.save(new CharacterClassEntity(0, className.toUpperCase()));
    }

    public CharacterClassEntity getCharacterClass(CharacterClassDto characterClassDto) {
        return characterClassRepository.findById(characterClassDto.getId()).get();
    }

    public CharacterClassEntity getCharacterClassByName(String name) {
        return characterClassRepository.findByName(name.toUpperCase());
    }

    public CharacterClassEntity getOrCreateCharacterClass(CharacterClassDto characterClassDto) {
        CharacterClassEntity result = getCharacterClassByName(characterClassDto.getClassName());
        if(result == null){
            result = addCharacterClass(characterClassDto.getClassName());
        }
        return result;
    }

    public AccountEntity getAccount(String login) {
        return accountRepository.findByLogin(login);
    }

    public AccountEntity addAccount(NewAccountDto newAccountDto) {
        return accountRepository.save(new AccountEntity(0, newAccountDto.getLogin()));
    }

    public List<AccountEntity> getAllAccounts() { return  accountRepository.findAll();}

    public List<AccountDto> getAllAccountsAsDTO() { return accountMapper.accountListToDto(accountRepository.findAll());}

}
