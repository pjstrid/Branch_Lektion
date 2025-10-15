public class Person {

    private String name;

    private int age;

    private String socialNumber;
  
    private Pet pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String socialNumber) {
        this.name = name;
        this.age = age;
        this.socialNumber = socialNumber;
    }
  
    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
  
      public Person(String name, int age, Pet pet, String socialNumber) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.socialNumber = socialNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSocialNumber() {
        return socialNumber;
    }
  
    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
