package nursalim.dev.data;

public enum Gender {
    MALE("Male Gender"),
    FEMALE("Female Gender"),
    OTHER("Not specified");

    private String description;
    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
