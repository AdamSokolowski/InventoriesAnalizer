package pl.asprojects.nosItems.model;

import javax.persistence.*;

@Entity
@Table(name = "CHARACTER_CLASS")
public class CharacterClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public CharacterClassEntity() {
    }

    public CharacterClassEntity(int id, String name) {
        this.id = id;
        this.name = name.toUpperCase();
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
        this.name = name.toUpperCase();
    }
}
