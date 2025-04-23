public class Dog implements Pet {
    private String breed;

    public Dog (String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Aw, aw!");
    }

    @Override
    public void play() {
        System.out.println("Plays fetch!");
    }

    public String getBreed() {
        return breed;
    }

}
