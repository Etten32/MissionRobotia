// J+M+J

import javax.swing.*;

// panel in which the board is stored and displayed
public class BoardDisplay extends JPanel {
    // holds current display
    Tile[][] currentDisplay;

    // constructor
    public BoardDisplay(){

    }

    // sendTiles - sends array to set in currentDisplay[][]
    public void sendTiles(Tile[][] toSet){
        currentDisplay = toSet;
    }

    // refresh board - paints/repaints this. panel with the current contents of currentDisplay[][]
    // use Settings.getTileSize to get size of each tile
    // (work with getting it working with pixel size 10 and then try getting alternate sizes working)
    public void refreshBoard(){

    }

    // testing main
    public static void main(String[] args){
        // BASIC TEST ROOM
        Tile[][] testArray = {
                {new Tile("3CNWL", false), new Tile("1WALL", false), new Tile("1WALL", false), new Tile("4CNWL", false), new Tile("0WALL", false), },
                {new Tile("4WALL", false), new Tile("0FLOR", true), new Tile("0FLOR", true), new Tile("2CNFL", false), new Tile("4CNWL", false), },
                {new Tile("DRi00", false), new Tile("OUT00", true), new Tile("OUT01", true), new Tile("0FLOR", true), new Tile("2WALL", false), },
                {new Tile("2CNWL", false), new Tile("3WALL", false), new Tile("DRi01", false), new Tile("3WALL", false), new Tile("1CNWL", false), }
        };
    }



}
