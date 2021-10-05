//J+M+J
public class Door extends Tile{
    private String destRoomLabel;
    private String destDoorLabel;
    private int doorType;

    public Door(String creationString){
        super(creationString);
        setPassible(false); // initially locked
        // find door file and load rest of door stats
    }
}
