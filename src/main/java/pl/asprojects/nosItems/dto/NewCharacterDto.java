package pl.asprojects.nosItems.dto;

public class NewCharacterDto {
    private String name;
    private String account;
    private CharacterClassDto characterClassDto;

    public NewCharacterDto() {
    }

    public NewCharacterDto(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public CharacterClassDto getCharacterClassDto() {
        return characterClassDto;
    }

    public void setCharacterClassDto(CharacterClassDto characterClassDto) {
        this.characterClassDto = characterClassDto;
    }
}
