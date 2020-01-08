package pl.asprojects.nosItems.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int act;
    private String pictureUrl;
    private String inventoryType;
    @ManyToOne(cascade = CascadeType.ALL)
    private CategoryEntity category;

    public ItemEntity() {}

    public ItemEntity(int id, String name, int act, String pictureUrl, String inventoryType, CategoryEntity category) {
        this.id = id;
        this.name = name;
        this.act = act;
        this.pictureUrl = pictureUrl;
        this.inventoryType = inventoryType;
        this.category = category;
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

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }
}


