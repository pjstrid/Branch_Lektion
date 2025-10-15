public class Person {

    private String name;

    private int age;

    private Pet pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
