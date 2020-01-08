package pl.asprojects.nosItems.dto;

public class CharacterClassDto {
    private int id;
    private String className;

    public CharacterClassDto() {
    }

    public CharacterClassDto(int id, String className) {
        this.id = id;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
