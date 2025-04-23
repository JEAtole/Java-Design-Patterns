import java.util.Arrays;
import java.util.List;

public class Knight implements Character{

    private final AttackStrategy attackStrategy = new SwingSword();
    private final List<DefenseStrategy> defenseStrategies = Arrays.asList(new Shield(), new Dodge(), new CreateBarrier());

    @Override
    public void attack() {
        System.out.println("Knight" +  attackStrategy.attack());
    }

    @Override
    public void defend() {
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            System.out.println("Knight" + defenseStrategy.defend());
        }
    }

}
