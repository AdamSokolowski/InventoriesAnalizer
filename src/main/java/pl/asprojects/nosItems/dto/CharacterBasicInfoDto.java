package pl.asprojects.nosItems.dto;

public class CharacterBasicInfoDto {
    private int id;
    private String name;
    private String account;

    public CharacterBasicInfoDto(int id, String name, String account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public CharacterBasicInfoDto() {
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
