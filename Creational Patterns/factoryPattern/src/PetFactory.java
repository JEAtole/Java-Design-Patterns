public class PetFactory {

    public static Pet createPet(String type, Object info) {

        switch (type.toLowerCase()) {
            case "dog" -> { return new Dog((String) info); }
            case "cat" -> { return new Cat((Integer) info); }
            default -> { throw new IllegalArgumentException("Unknown pet type"); }
        }

    }

}
