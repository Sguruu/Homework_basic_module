package task_7_0.game.fighters;

import task_7_0.game.human.HumanFightingArmor;

public class Swordsman extends HumanFightingArmor {
    public static final String NAME_CLASS_FIGHTERS = "Мечник";
    public Swordsman(String name, int age) {
        super(name, age);
    }

    /**
     * Ударить, мечник наносит на 5 едениц урона больше
     * @return нанесенный урон
     */
    @Override
    public int bop() {
        return super.bop() + 5;
    }
}
