public class PetFactory {

    public static Pet createPet(String type, Object info) {
        if (type.equalsIgnoreCase("dog") && info instanceof String) {
            return new Dog((String) info);
        } else if (type.equalsIgnoreCase("cat") && info instanceof Integer){
            return new Cat((Integer) info);
        }
        throw new IllegalArgumentException("Invalid pet type or info");
    }

}
