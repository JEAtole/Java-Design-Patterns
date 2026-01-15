public class Cat implements Pet {
    private final int noOfLives;

    public Cat (int noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow, meow!");
    }

    @Override
    public void play() {
        System.out.println("Plays with yarn!");
    }

    public int getNoOfLives() {
        return noOfLives;
    }
}
