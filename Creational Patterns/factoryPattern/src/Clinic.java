public class Clinic {

    public static void main(String[] args) {

        Pet dog = PetFactory.createPet("dog", "Welsh Corgi");
        Pet cat = PetFactory.createPet("cat", 9);

        PetRecord dogRecord = new PetRecord("D1", "Buddy", dog);
        PetRecord catRecord = new PetRecord("C1", "Whiskers", cat);

        dogRecord.displayInfo();
        catRecord.displayInfo();
    }

}
