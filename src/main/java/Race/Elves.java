package Race;

import java.util.Random;

public class Elves {//раса эльфов
    Random random = new Random();
    private  int intelligence  = 8 + random.nextInt(18 - 8);
    private   int strength  = 3 + random.nextInt(18 - 3);
    private   int dexterity  = 7 + random.nextInt(19 - 7);
    private   int Constitution = 6 + random.nextInt(17 - 6);
    private boolean regeneration = false;
    private int age=0;
    private int maxAge= 1100;
}
