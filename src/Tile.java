import javax.swing.*;

//J+M+J
public class Tile {
    //picture
    private ImageIcon tilePic;
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
        // if it is simple block
        if(Character.isDigit(label.charAt(0))) tilePic = new ImageIcon("../tileImages/" + label + ".png");
        // if it is complex block
        else { tilePic = new ImageIcon("../tileImages/UNKNOWN.png"); }
    }
    // getPic
    public ImageIcon getTilePic(){ return tilePic;}
}
