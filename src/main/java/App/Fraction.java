package App;

import Race.NameOfRace;

public class Fraction {
    int day=0;//дни существования фракции
    Object race;
    Fraction(Object race){//создаём фракцию с определенной рассой
        this.race= race;
    }
    public Object getRace() {
        return race;
    }

}
