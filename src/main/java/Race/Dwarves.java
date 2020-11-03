package Race;

import java.util.Random;

public class Dwarves {//раса дварфов
    Random random = new Random();
    int num = 36 + random.nextInt(100 - 36);
    private  int intelligence  = 3 + random.nextInt(18 - 3);//рандом интеллект 3-18
    private   int strength  = 8 + random.nextInt(18 - 8);
    private   int dexterity  = 3 + random.nextInt(18 - 3);
    private   int Constitution = 12 + random.nextInt(19 - 12);
    private boolean regeneration = false;
    private int age=0;
    private int maxAge= 500;
}
