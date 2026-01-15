public class Clinic {

    public static void main(String[] args) {

        PetRecord dogRecord = new PetRecord("D1", "Buddy", PetFactory.createPet("dog", "Welsh Corgi"));
        PetRecord catRecord = new PetRecord("C1", "Whiskers", PetFactory.createPet("cat", 9));

        dogRecord.displayInfo();
        catRecord.displayInfo();

    }

}
