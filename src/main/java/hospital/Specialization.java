package hospital;

public enum Specialization {
    CARDIOLOGIST("cardiologist"), MIDWIFE("midwife"), INTERNIST("internist");

    private final String description;

    Specialization(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
