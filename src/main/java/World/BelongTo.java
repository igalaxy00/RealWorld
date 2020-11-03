package World;

import java.util.Random;

public enum BelongTo {//принадлежность какой либо расы
    DwarveOwn, ElveOwn , TrollOwn, EMPTY;

    private static final BelongTo[] VALUES = values();//массив, содержащий список всех констант перечисления.
    private static final int SIZE = VALUES.length;//колличество переменных
    private static final Random RANDOM = new Random();//для работы рандома

    public static BelongTo getRandomBelong()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
