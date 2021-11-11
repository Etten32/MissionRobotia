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

                ProgramWindow mainWindow = new ProgramWindow(); // Make window to host the game/GUI in
                mainWindow.setSize(xResolution, yResolution );



                // make menu /gui stuffs


                BoardDisplay gameboard = new BoardDisplay(); // make a gameboard
                JScrollPane scrollframe = new JScrollPane(); // make a scrollPane to house the gameboard
                scrollframe.setViewportView(gameboard); // set the scrollframe to display the gameboard
                scrollframe.setWheelScrollingEnabled(true); // allow mouse wheel to scroll
                // make scrollbars
                JScrollBar updownslider = scrollframe.getVerticalScrollBar();
                JScrollBar rightleftslider = scrollframe.getHorizontalScrollBar();
                //
                JPanel boardhousing = new JPanel();// make jpanel to house scrolling board
                boardhousing.setLayout(new BorderLayout());
                // add scrolling board and scrollbars to the jpanel
                boardhousing.add(scrollframe,BorderLayout.CENTER);
                boardhousing.add(rightleftslider,BorderLayout.SOUTH);
                boardhousing.add(updownslider,BorderLayout.EAST);
                //




                mainWindow.add(boardhousing);
                mainWindow.setVisible(true); // set to visible
            }
        });
    }

}
