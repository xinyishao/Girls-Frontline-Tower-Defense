package battlefield;

import java.io.*;

import player.Player;

public class GameLevelGenerator {
    private static final String FILE_NAME = "GameLevel-3";
    private Battlefield battlefield = new Battlefield();
    private Player player = new Player();

    public void wirteBattlefield() {

        try {
            //String path = getClass().getClassLoader().getResource()
            FileOutputStream fileOutput = new FileOutputStream(FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(fileOutput);

            out.writeObject(battlefield);

            out.close();
        } catch (IOException e) {
            System.out.println("Cannot write file");
            e.printStackTrace();
        }
    }

    public void readBattlefield() {
        try {
            //String path = getClass().getClassLoader().getResource(FILE_NAME).toString();
            //System.out.println(path);
            FileInputStream fileInput = new FileInputStream(FILE_NAME);
            ObjectInputStream in = new ObjectInputStream(fileInput);

            Battlefield battlefield = (Battlefield) in.readObject();

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Cannot find file");
            e.printStackTrace();
        }
    }

    public void saveGame() {
        try {
            FileOutputStream fileOutput = new FileOutputStream("save");
            ObjectOutputStream out = new ObjectOutputStream(fileOutput);

            out.writeObject(player);

            out.close();
        } catch (IOException e) {
            System.out.println("Cannot write file");
            e.printStackTrace();
        }
    }

    public void loadGame() {
        try {
            FileInputStream fileInput = new FileInputStream("save");
            ObjectInputStream in = new ObjectInputStream(fileInput);

            in.readObject();

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Cannot find file");
            e.printStackTrace();
        }
    }
}
