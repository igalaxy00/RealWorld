package World;

/**
 * ячейка мира
 */
public class Tile {//тайл мира
public BelongTo belong;//принадлежность тайла
public TileType type;//тип тайла
public Building building;// построки на тайле

    public void setTile(BelongTo belong , TileType type, Building building) {
        this.belong = belong;
        this.type = type;
        this.building = building;
    }

}
