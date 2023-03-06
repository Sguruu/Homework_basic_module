package task_7_0.game.fighters;

import task_7_0.game.human.HumanFightingArmor;

public class Archer extends HumanFightingArmor {

    public static final String NAME_CLASS_FIGHTERS = "Лучник";
    private int ammunition = 10;

    public Archer(String name, int age) {
        super(name, age);
        setArmor(19);
    }

    /**
     * Удар лучника расходует ammunition и наносит на 1 еденицу урона больше, если aammunition == 0 то наносит
     * по еденице урона
     *
     * @return нанесенный урон
     */
    @Override
    public int bop() {
        if (ammunition != 0) {
            ammunition -= 1;
            return super.bop() + 1;
        } else {
            return 1;
        }
    }

    /**
     * Защититься, при защите лучник также восстанавливает снаряды
     */
    @Override
    public void defend() {
        ammunition += 1;
        super.defend();
    }
}
