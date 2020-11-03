package App;
import World.*;
import Race.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.*;

import java.util.Random;

public class New extends Application {
    static final int TILE_SIZE = 100; //размер тайла
    private static final int WIDTH = 8;
    private static final int HEIGHT = 8;
    public Parent createContent() {
        AnchorPane root = new AnchorPane ();
        ToggleButton lightBtn = new ToggleButton("Light");
        Label stateLbl = new Label();
        lightBtn.setOnAction(event -> {//кнопка
            if(lightBtn.isSelected()){
                for (int i=0 ; i<100000 ; i++){
                    //System.out.println(1);
                    Random random = new Random();
                    int num = 36 + random.nextInt(100 - 36);
                    if (num<36||num>100)
                        System.out.println(num);
                }

                stateLbl.setText("Light on!");
            }
            else{
                stateLbl.setText("Light off...");
            }
        });

        World world1 = new World();//создается обьект мир
        world1.createWorld();//создается сам мир
        System.out.println(world1.field[0][0].belong);
        //System.out.println(world1.toString());
        for (int x = 0; x < 10; x++) {//цикл по проверки принадлежностей ячеек
            for (int y = 0; y < 10; y++) {
                //System.out.println(world1.field[x][y].belong);
                System.out.println(world1.field[x][y].belong);
            }
        }
        Dwarves dw = new Dwarves();//обьект дворф
        Fraction a = new Fraction(NameOfRace.DWARVE);//обьект фракция дворфов государство
     //   System.out.println(a.getRace());//проверка правильно ли создались дворфы
        root.setPrefSize((WIDTH) * TILE_SIZE, (HEIGHT) * TILE_SIZE);
        root.getChildren().addAll(lightBtn, stateLbl);
        return root;
    }














    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Шашки");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
