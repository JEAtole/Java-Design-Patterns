public class Archer implements  Character{

    private final AttackStrategy attackStrategy = new ShootArrow();
    private final DefenseStrategy defenseStrategy = new Dodge();

    @Override
    public void attack() {
        System.out.println("Archer" +  attackStrategy.attack());
    }

    @Override
    public void defend() {
        System.out.println("Archer" +  defenseStrategy.defend());
    }

}
