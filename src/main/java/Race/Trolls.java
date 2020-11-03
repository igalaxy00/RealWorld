package Race;

import java.util.Random;

public class Trolls {//раса тролей
    Random random = new Random();
    private  int intelligence  = 6 + random.nextInt(18 - 6);
    private   int strength  = 6 + random.nextInt(17 - 6);
    private   int dexterity  = 8 + random.nextInt(19 - 8);
    private   int Constitution = 10 + random.nextInt(18 - 10);
    private boolean regeneration = true;
    private int age=0;
    private int maxAge= 240;
}
