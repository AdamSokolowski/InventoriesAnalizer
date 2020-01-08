package pl.asprojects.nosItems.dto;

public class AccountDto {
    private int id;
    private String login;

    public AccountDto() {
    }

    public AccountDto(int id, String login) {
        this.id = id;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
