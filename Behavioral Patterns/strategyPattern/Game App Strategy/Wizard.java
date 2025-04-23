public class Wizard implements Character{

    private final AttackStrategy attackStrategy = new CastSpell();
    private final DefenseStrategy defenseStrategy = new CreateBarrier();

    @Override
    public void attack() {
        System.out.println("Wizard" +  attackStrategy.attack());
    }

    @Override
    public void defend() {
        System.out.println("Wizard" +  defenseStrategy.defend());
    }

}
