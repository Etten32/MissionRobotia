// J+M+J

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// panel in which the board is stored and displayed
public class BoardDisplay extends JPanel {
    // holds current display
    Tile[][] currentDisplay;


    // constructor
    public BoardDisplay(){

        this.setLayout(new BorderLayout());
        main(null); // initialize the tile array
        Canvas imageBoard = new Canvas();// make a canvas to draw board images on
        JPanel scrollableBoard = new JPanel(); // make a jpannel to be scrollable and contain the board
        scrollableBoard.add(imageBoard);

        JScrollPane scrollFrame = new JScrollPane(scrollableBoard);// make a scrolable pannel and add the scollableboard to it

        this.add(scrollFrame, BorderLayout.CENTER);// add the scrollframe to the BoardDisplay

        // add scrolbars to the current Jpanel
        this.add(scrollFrame.getHorizontalScrollBar(), BorderLayout.SOUTH);
        this.add(scrollFrame.getVerticalScrollBar(), BorderLayout.EAST);
        //








    }

    // sendTiles - sends array to set in currentDisplay[][]
    public void sendTiles(Tile[][] toSet){
        currentDisplay = toSet;
    }



    // refresh board - paints/repaints this. panel with the current contents of currentDisplay[][]
    public void paint(Graphics g){
        super.paint(g);
        int xres=0, yres=0; // resolution of the images

        for(int y=0; y<currentDisplay.length; y++){// iterate over the y dirrection of the tile array
            for(int x=0; x<currentDisplay[y].length; x++){// iterate over the x dirrection of the tile array
                Tile currentTile = currentDisplay[y][x]; // load current tile from array
                BufferedImage image = loadimage(currentTile);//get image

                // determine the resolution
                xres = Settings.getTileSize()*image.getWidth()/50; // sets the scaling of the board size
                yres = Settings.getTileSize()*image.getHeight()/50; // divides by the original size of the images 50*50
                //

                Image draw = image.getScaledInstance(xres,yres, Image.SCALE_SMOOTH); // scale the tile size by Settings paramater

                g.drawImage(draw,xres*x,yres*y,null); // currently does not like this. I believe it is because it is an image icon instead of a buffered image.


            }
        }
    }
    public void update(Graphics g){

        //g.drawImage();// image xposition, yposition
    }

    public BufferedImage loadimage(Tile tile){
        tile.calcPic();
        BufferedImage pic = tile.getTilePic();
        return pic;
    }


    // use Settings.getTileSize to get size of each tile
    // (work with getting it working with pixel size 10 and then try getting alternate sizes working)
    public void refreshBoard(){

    }

    // testing main
    public void main(String[] args){
        // BASIC TEST ROOM
        Tile[][] currentDisplay = {
                {new Tile("3CNWL", false), new Tile("1WALL", false), new Tile("1WALL", false), new Tile("4CNWL", false), new Tile("0WALL", false), },
                {new Tile("4WALL", false), new Tile("0FLOR", true), new Tile("0FLOR", true), new Tile("2CNFL", false), new Tile("4CNWL", false), },
                {new Tile("DRi00", false), new Tile("OUT00", true), new Tile("OUT01", true), new Tile("0FLOR", true), new Tile("2WALL", false), },
                {new Tile("2CNWL", false), new Tile("3WALL", false), new Tile("DRi01", false), new Tile("3WALL", false), new Tile("1CNWL", false), }
        };
        this.currentDisplay = currentDisplay;


    }



}
