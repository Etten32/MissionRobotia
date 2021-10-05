//J+M+J
// Class is extended by all specific mission instructions
// Empty functions can be filled out in children and are called at appropriate times
public abstract class MissionCode {
    // all lists of things needed <-- TO WRITE
    MissionCode(){

    }
    // before mission loads. outputs results to user in textbox if != null
    public abstract String preMission();
    // when player moves to a specially marked tile. outputs results to user in textbox if != null
    public abstract String specialTile(Tile tlName);
    // when entering different rooms
    public abstract String displayMissionText(Room rmName);
    // after mission ends. outputs results to user in textbox if != null
    public abstract String aftMission();

}
