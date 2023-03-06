package task_7_0.game.human;


public class Human  {

    final int MAX_AGE = 70;

    final int AGE_YOUTH = 35;

    private final double COEFFICIENT_AGE = 2.8;
    private String name;
    private int life;
    private int age;
    private int speed;

    private boolean dead = false;

    public Human(String name, int age) {
        this.name = name;
        setAge(age);
        changeLife();
        changeSpeed();
    }

    /**
     * Проверка человека на молодость
     *
     * @return true человек молод, false человек стар
     */
    boolean checkYouth() {
        return age <= AGE_YOUTH;
    }

    /**
     * Установить жизни
     * Максимум 35
     */
    protected void changeLife() {
        if (checkYouth()) {
            this.life = age;
        } else {
            this.life = (int) (age * ((COEFFICIENT_AGE * (MAX_AGE - age)) / 100));
        }
    }

    /* private */

    /**
     * Установить скорость
     * Максимум 35
     */
    private void changeSpeed() {
        if (checkYouth()) {
            this.speed = age;
        } else {
            this.speed = (int) ((age * 2) * ((COEFFICIENT_AGE * (MAX_AGE - age)) / 100));
        }
    }

    private void changeDead() {
        this.dead = life <= 0;
    }

    /* get */

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getDead() {
        return dead;
    }

    /* set */

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
        changeDead();
    }

    private void setAge(int age) {
        if (age > 70) {
            this.age = 1;
        } else if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }
}
