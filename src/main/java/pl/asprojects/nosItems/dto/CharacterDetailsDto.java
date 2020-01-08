package pl.asprojects.nosItems.dto;

import pl.asprojects.nosItems.model.AccountEntity;
import pl.asprojects.nosItems.model.CharacterClassEntity;

public class CharacterDetailsDto {
    private int id;
    private String name;
    private int lvl;
    private int jlvl;
    private int clvl;
    private CharacterClassEntity characterClassEntity;
    private AccountEntity account;

    public CharacterDetailsDto() {
    }

    public CharacterDetailsDto(int id, String name, int lvl, int jlvl, int clvl, CharacterClassEntity characterClassEntity, AccountEntity account) {
        this.id = id;
        this.name = name;
        this.lvl = lvl;
        this.jlvl = jlvl;
        this.clvl = clvl;
        this.characterClassEntity = characterClassEntity;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getJlvl() {
        return jlvl;
    }

    public void setJlvl(int jlvl) {
        this.jlvl = jlvl;
    }

    public int getClvl() {
        return clvl;
    }

    public void setClvl(int clvl) {
        this.clvl = clvl;
    }

    public CharacterClassEntity getCharacterClassEntity() {
        return characterClassEntity;
    }

    public void setCharacterClassEntity(CharacterClassEntity characterClassEntity) {
        this.characterClassEntity = characterClassEntity;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }
}
