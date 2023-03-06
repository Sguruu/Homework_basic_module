package task_7_0.game.fighters;

import task_7_0.game.human.HumanFighting;

public class Assassin extends HumanFighting {
    public static final String NAME_CLASS_FIGHTERS = "Ассасин";
    public Assassin(String name, int age) {
        super(name, age);
        setStamina(getStamina() + (getAge() / 2));
    }

    /**
     * Потратить стамину, assasin тратит стамины меньше
     */
    @Override
    protected void toSpend() {
        setStamina(getStamina() - 3);
    }

    /**
     * Ассасин восстанавливвает на еденицу стамины больше
     */
    @Override
    protected void restoreStamina() {
        super.restoreStamina();
        setStamina(3);
    }
}
