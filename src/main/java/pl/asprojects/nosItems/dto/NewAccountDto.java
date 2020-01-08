package pl.asprojects.nosItems.dto;

public class NewAccountDto {
    private String login;

    public NewAccountDto() {
    }

    public NewAccountDto(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
