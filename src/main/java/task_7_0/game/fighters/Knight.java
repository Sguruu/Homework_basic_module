package task_7_0.game.fighters;

import task_7_0.game.human.HumanFightingArmor;

/**
 * Рыцарь имеет самый высокий показатель брони
 */
public class Knight extends HumanFightingArmor {
    public static final String NAME_CLASS_FIGHTERS = "Рыцарь";

    public Knight(String name, int age) {
        super(name, age);
        setArmor(50);
    }
}
