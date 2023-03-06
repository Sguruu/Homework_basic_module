package task_7_0.game.fighters;

import task_7_0.game.human.HumanFighting;

public class Mage extends HumanFighting {
    public static final String NAME_CLASS_FIGHTERS = "Маг";
    public Mage(String name, int age) {
        super(name, age);
    }

    /**
     * Переопределения установки силы для мага, сила мага не зависит от молодости
     */
    @Override
    protected void changeStrength() {
        setStrength(getLife()/4);
    }

    /**
     * Установка жизней, жизни мага не зависит от молодости
     */
    @Override
    protected void changeLife() {
        setLife(getAge());
    }

}
