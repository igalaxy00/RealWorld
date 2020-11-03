package World;

import java.util.Random;

public enum Building {//постройки
    BASICHOUSE , EMPTY;
    private static final Building[] VALUES = values();//массив, содержащий список всех констант перечисления.
    private static final int SIZE = VALUES.length;//колличество переменных
    private static final Random RANDOM = new Random();//для работы рандома
    public static Building getRandomBuilding()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}

