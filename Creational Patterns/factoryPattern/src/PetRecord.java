class PetRecord {
    private String petId;
    private String petName;
    private Pet pet;

    public PetRecord(String petId, String petName, Pet pet) {
        this.petId = petId;
        this.petName = petName;
        this.pet = pet;
    }

    public void displayInfo() {
        System.out.println("Pet ID: " + petId);
        System.out.println("Pet Name: " + petName);
        System.out.println("Pet Type: " + pet.getClass().getSimpleName());

        if (pet instanceof Dog) {
            System.out.println("Breed: " + ((Dog) pet).getBreed());
        } else if (pet instanceof Cat) {
            System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
        }

        pet.makeSound();
        pet.play();

        System.out.println("------------------------------");
    }
}