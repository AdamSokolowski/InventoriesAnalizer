package pl.asprojects.nosItems.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVENTORY")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "character_id")
    private CharacterEntity owner;
    @OneToMany
    private List<InventoryItemEntity> itemList;

    public InventoryEntity() {
    }

    public InventoryEntity(int id, CharacterEntity owner, List<InventoryItemEntity> itemList) {
        this.id = id;
        this.owner = owner;
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CharacterEntity getOwner() {
        return owner;
    }

    public void setOwner(CharacterEntity owner) {
        this.owner = owner;
    }

    public List<InventoryItemEntity> getItemList() {
        return itemList;
    }

    public void setItemList(List<InventoryItemEntity> itemList) {
        this.itemList = itemList;
    }
}
