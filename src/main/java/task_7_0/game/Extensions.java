package task_7_0.game;

import java.util.Random;

/**
 * Класс расширение
 */
public class Extensions {
    /**
     * Функция рандома, нижняя граница 0 включительно
     *
     * @param bottomLine верхняя граница включительно
     * @return случайное число от 0..bottomLine
     */
    public int customRandom(int bottomLine) {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(bottomLine + 1);
    }
}
