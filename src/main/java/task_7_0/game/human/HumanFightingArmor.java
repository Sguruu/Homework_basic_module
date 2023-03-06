package task_7_0.game.human;

public class HumanFightingArmor extends HumanFighting {
    private int armor = 30;

    public HumanFightingArmor(String name, int age) {
        super(name, age);
        setArmor(armor);
    }

    /**
     * Переопределение метода, добавление проверки на броню, урон не получается пока есть броня
     * @param damage вернуть получаемый урон
     */
    @Override
    public void takeDamage(int damage) {
        reduceArmor(damage);
        boolean armorBroken = armor <= 0;
        if (armorBroken) {
            super.takeDamage(damage);
        }
    }

    /**
     * Переопределение метода, люди с броней больше тратят стамину
     */
    @Override
    protected void toSpend() {
        setStamina(getStamina() - (armor / 10));
        super.toSpend();
    }

    /* private */

    /**
     * Уменьшить броню
     *
     * @param value значение для уменьшения брони
     */
    private void reduceArmor(int value) {
        armor -= value;
    }


    /* get */
    public int getArmor() {
        return armor;
    }

    /* set */
    public void setArmor(int armor) {
        this.armor = armor;
    }
}
