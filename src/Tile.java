//J+M+J
public class Tile {
    //picture
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
}
