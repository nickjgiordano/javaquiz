// import libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// implement ActionListener interface
public class Main implements ActionListener
{
    JFrame frmMain;
    static String category;
    static int questionNumber;
    static String answer;
    static int correct;
    static boolean quizEnd;
    
    public Main()
    {
    }
    public static void main( String[] args )
    {
        Menu objMain = new Menu();
    }
    public void actionPerformed(ActionEvent evt)
    {
        String sCmd = evt.getActionCommand();
        frmMain.dispose();
        if( frmMain.getTitle().equals("Main Menu") )
        {
            if( sCmd.equals("Exit") )
            System.exit(0);
            category = sCmd;
            questionNumber = 1;
            new Quiz();
        }
        else if( frmMain.getTitle().equals("Quiz") )
        {
            if( sCmd.equals(answer) )
            correct++;
            if( quizEnd )
            new Results();
            else
            {
                questionNumber++;
                new Quiz();
            }
        }
        else if( frmMain.getTitle().equals("Results") )
        {
            if( sCmd.equals("Exit") )
            System.exit(0);
            quizEnd = false;
            correct = 0;
            questionNumber = 1;
            if( sCmd.equals("Retry") )
            new Quiz();
            else if( sCmd.equals("Main Menu") )
            new Menu();
        }
    }
}