package pl.asprojects.nosItems.dto;

import pl.asprojects.nosItems.model.CategoryEntity;

public class ItemDto {
    private int id;
    private String name;
    private int act;
    private String pictureUrl;
    private String inventoryType;
    private CategoryDto category;

    public ItemDto() {
    }

    public ItemDto(int id, String name, int act, String pictureUrl, String inventoryType, CategoryDto category) {
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

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
