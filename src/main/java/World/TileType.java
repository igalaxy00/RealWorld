package World;

import java.util.Random;

public enum TileType {//тип тайла мира
    FLAT, MOUNTAINS, LAKE;

    private static final TileType[] VALUES = values();//массив, содержащий список всех констант перечисления.
    private static final int SIZE = VALUES.length;//колличество переменных
    private static final Random RANDOM = new Random();//для работы рандома

    public static TileType getRandomType() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
