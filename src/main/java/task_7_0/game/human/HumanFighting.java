package task_7_0.game.human;

import task_7_0.game.Extensions;

/**
 * Class Боевой человек
 */
public class HumanFighting extends Human {
    private Skill skill;
    private int stamina;

    /**
     * Сила
     */
    private int strength;
    private int damage;

    private int armor = 0;

    public HumanFighting(String name, int age) {
        super(name, age);
        changeSkill();
        changeStamina();
        changeStrength();
        changeDamage();
    }

    /* fun */

    /**
     * Получить урон
     */
    public void takeDamage(int damage) {
        int numberLives = getLife() - damage;
        setLife(numberLives);
    }

    /**
     * Ударить
     *
     * @return нанесенный урон
     */
    public int bop() {
        if (stamina <= 0) {
            restoreStamina();
            return 1;
        } else {
            toSpend();
            return damage;
        }
    }

    /**
     * Защититься
     */
    public void defend() {
        restoreStamina();
    }

    /**
     * Увернуться от атаки
     *
     * @return true персонаж увернулся
     */
    public boolean dodge() {
        Extensions extensions = new Extensions();
        int dodgeBlow = getSpeed() + getStamina();
        if (dodgeBlow <= extensions.customRandom(100) && getStamina() > 0) {
            setStamina(-2);
            return true;
        } else {
            setStamina(1);
            return false;
        }

    }

    /**
     * Востановить стамину
     */
    protected void restoreStamina() {
        setStamina(3);
    }

    /**
     * Потратить стамину
     */
    protected void toSpend() {
        setStamina(-5);
    }

    /* private */

    /**
     * Установить мастерство
     */
    private void changeSkill() {
        if (getAge() <= 24) {
            this.skill = Skill.JUNIOR;
        } else if (getAge() <= 30) {
            this.skill = Skill.MIDDLE;
        } else {
            this.skill = Skill.SENIOR;
        }
    }

    /**
     * Установить стамину
     */
    private void changeStamina() {
        this.stamina = getSpeed();
    }

    /**
     * Установить силу
     */
    protected void changeStrength() {
        if (checkYouth()) {
            this.strength = ((getLife() / 5));
        } else {
            this.strength = (int) ((getLife() / 5) * (2.8 * (MAX_AGE - this.getAge())) / 100);
        }
    }

    /**
     * Установить урон
     */
    private void changeDamage() {
        int DAMAGE_JUNIOR = 1;
        int DAMAGE_MIDDLE = 2;
        int DAMAGE_SENIOR = 3;
        switch (skill) {
            case JUNIOR:
                damage = DAMAGE_JUNIOR;
                break;
            case MIDDLE:
                damage = DAMAGE_MIDDLE;
                break;
            case SENIOR:
                damage = DAMAGE_SENIOR;
                break;
        }
        damage = damage + strength;
    }

    /* get */
    public Skill getSkill() {
        return skill;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    /* set */

    protected void setStrength(int strength) {
        this.strength = strength;
    }

    protected void setStamina(int stamina) {
        if (stamina <= 0) {
            this.stamina = 0;
        } else {
            this.stamina = stamina;
        }
    }

    protected void setArmor(int armor) {
        this.armor = armor;
    }
}
