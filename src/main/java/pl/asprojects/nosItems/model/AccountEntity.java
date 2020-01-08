package pl.asprojects.nosItems.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int id;
    private String login;
    @OneToMany
    private List<CharacterEntity> characterList = new ArrayList<>();

    public AccountEntity() {
    }

    public AccountEntity(int id, String login) {
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

    public List<CharacterEntity> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<CharacterEntity> characterList) {
        this.characterList = characterList;
    }
}
