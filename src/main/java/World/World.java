package World;

import Race.Race;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * поле мира состоящее из ячеек
 */
public class World {
    public int time = 0;
    private final int worldSize = 10; //размер мира
    public Tile[][] field = new Tile[worldSize][worldSize];

    public void setOwn(int x, int y, BelongTo belong) {//функция по заданию принадлежности клетки
        field[x][y].belong = belong;
    }

    public void createWorld() {//создается мир с 3 расами
        createFlatWorld();
        for (int x = 0; x < worldSize; x++) {//заполняются все ячейки
            for (int y = 0; y < worldSize; y++) {
                Tile tileToPlace = new Tile();
                tileToPlace.building = Building.EMPTY;
                tileToPlace.type = TileType.getRandomType();
                tileToPlace.belong = BelongTo.EMPTY;
                field[x][y] = tileToPlace;
            }
        }//рандомно расставляются начальныен ячейки расы
        field[(int) (0 + Math.random() * 9)][(int) (0 + Math.random() * 9)].belong = BelongTo.DwarveOwn;//расставляются в рандмное место рассы
        field[(int) (0 + Math.random() * 9)][(int) (0 + Math.random() * 9)].belong = BelongTo.ElveOwn;
        field[(int) (0 + Math.random() * 9)][(int) (0 + Math.random() * 9)].belong = BelongTo.TrollOwn;
        int amountOfRaces = 0;
        for (int x = 0; x < worldSize; x++) {//проверяет создались ли все 3 расы
            for (int y = 0; y < worldSize; y++) {
                if (field[x][y].belong != BelongTo.EMPTY)
                    amountOfRaces += 1;
            }
        }
        if (amountOfRaces != 3) {
            createWorld();
        }

    }

    public void createFlatWorld() {//создаём пустой плоский мир
        for (int x = 0; x < worldSize; x++) {
            for (int y = 0; y < worldSize; y++) {
                Tile tileToPlace = new Tile();
                tileToPlace.building = Building.EMPTY;
                tileToPlace.belong = BelongTo.EMPTY;
                tileToPlace.type = TileType.FLAT;
                field[x][y] = tileToPlace;
            }
        }
    }

    public void findTileToConq(ArrayList<Pair> tileToConq, BelongTo belong) {//ищутся клетки соприкасающиися с клетками расы . Эти клетки могут быть захвачены
        for (int x = 0; x < worldSize; x++) {
            for (int y = 0; y < worldSize; y++) {
                if ((field[x + 1][y].belong == belong || field[x - 1][y].belong == belong ||
                        field[x][y + 1].belong == belong || field[x][y - 1].belong == belong)
                        && field[x][y].belong != belong)
                    tileToConq.add(new Pair(x, y));
            }
        }
    }

    public void NewDay() {
        time += 1;
        ArrayList<Pair> tilesToConqDwarves = new ArrayList<>();
        ArrayList<Pair> tilesToConqElves = new ArrayList<>();
        ArrayList<Pair> tilesToConqTrolls = new ArrayList<>();
        findTileToConq(tilesToConqDwarves, BelongTo.DwarveOwn);
        findTileToConq(tilesToConqElves, BelongTo.ElveOwn);
        findTileToConq(tilesToConqTrolls, BelongTo.TrollOwn);

    }
}
