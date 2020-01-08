package pl.asprojects.nosItems.dto;

public class NewCharacterClassDto {
    private String className;

    public NewCharacterClassDto() {
    }

    public NewCharacterClassDto(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
