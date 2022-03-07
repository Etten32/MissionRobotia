//J+M+J
// settings file to host deal with various setting configurations
public class Settings {
    private static int tileSize = 100;
    public static int getTileSize(){
        return tileSize;
    }
    public static void setTileSize(int tileSize){
        Settings.tileSize = tileSize;
    }
}
