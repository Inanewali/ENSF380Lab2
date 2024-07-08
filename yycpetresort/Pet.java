package yycpetresort;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private String medicalHistory;

    public Pet(String name, String breed, int age, String medicalHistory) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
