import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


//J+M+J
public class Tile {
    //picture
    private BufferedImage tilePic;
    //if user can go on it
    private boolean passible; // true/false for doors if it unlocked or not
    private String label;
    //
    public Tile(String label, boolean passible){
        this.label = label;
        this.passible = passible;
    }
    // set stuff according to type
    public Tile(String creationString){

    }
    public void setUpFrom(String creationString){

    }
    public void setPassible(boolean passible){
        this.passible = passible;
    }
    // calculates the name of picture
    public void calcPic(){
        try {
            // if it is simple block
            //System.out.println("../tileImages/essential/" + label + ".png"); // debugging
            if (Character.isDigit(label.charAt(0))) tilePic = ImageIO.read(new File("../tileImages/essential/" + label + ".png"));
                // if it is complex block
            else {
                tilePic = ImageIO.read(new File("../tileImages/essential/UNKNOWN.png"));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    // getPic
    public BufferedImage getTilePic(){ return tilePic;}
}
