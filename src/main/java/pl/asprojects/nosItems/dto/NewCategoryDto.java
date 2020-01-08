package pl.asprojects.nosItems.dto;

public class NewCategoryDto {
    private String name;

    public NewCategoryDto() {
    }

    public NewCategoryDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
