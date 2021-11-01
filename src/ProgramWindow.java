import javax.swing.*;
import java.awt.*;

public class ProgramWindow extends JFrame{

    private static int xResolution = 1300;
    private static int yResolution = 700;

    // get and set the resolution of the program window
    public int getxResolution(){
        return xResolution;
    }
    public int getyResolution(){
        return yResolution;
    }
    public void setxResolution(int xResolution){
        this.xResolution = xResolution;
    }
    public void setyResolution(int yResolution){
        this.yResolution = yResolution;
    }
    // end get and set of program window resolution


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ProgramWindow mainWindow = new ProgramWindow(); // Make window to host the game in
                mainWindow.setSize(xResolution, yResolution );
                mainWindow.setVisible(true); // set to visible


                // make menu /gui stuffs



                mainWindow.add(new BoardDisplay()); // board game pannel to add to window to display the board
            }
        });
    }

}
