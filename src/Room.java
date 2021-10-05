//J+M+J
public class Room {
    private Tile[][] roomMap;
    private DoorOut[] allDOuts;
    private String label; // to reference room when door needs to find it
    private Unit[] allUnits; // all units including user
    private Unit[][] unitMap; // holds map of units <<<-----MANAGE COLLISION CASE!!!!
    // <<<-----REMOVE USER FROM []'S ON USER EXIT!!!!
}
