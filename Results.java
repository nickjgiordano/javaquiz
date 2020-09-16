// import libraries
import java.awt.*;
import javax.swing.*;

// inherit variables and methods from GUI class
public class Results extends GUI
{
    public Results()
    {
        getFrame("Results");
        getResults();
        getButtons();
        setFrame();
    }
    public void getResults()
    {
        getLabel("");
        lblMain.setPreferredSize( new Dimension(imageSize*4, titleSize + imageSize) );
        if(correct == 0)
        {
            lblMain.setText("Did you do that on purpose? You didn't get anything right!");
            lblMain.setForeground(Color.red);
        }
        else if(100*correct / questionNumber < 25)
        {
            lblMain.setText("I'll be honest -- you didn't do well. You got " + correct + " out of " + questionNumber + " right.");
            lblMain.setForeground(Color.orange);
        }
        else if(100*correct / questionNumber < 50)
        {
            lblMain.setText("Not a bad effort, but you won't turn any heads scoring " + correct + " out of " + questionNumber + ".");
            lblMain.setForeground(Color.yellow);
        }
        else if(100*correct / questionNumber < 75)
        {
            lblMain.setText("Good! You got " + correct + " out of " + questionNumber + " correct. You have potential, I guess.");
            lblMain.setForeground(Color.green);
        }
        else if(100*correct / questionNumber < 100)
        {
            lblMain.setText("Impressive! " + correct + " out of " + questionNumber + "!");
            lblMain.setForeground(Color.cyan);
        }
        else if(correct == questionNumber)
        {
            lblMain.setText("100%. Perfecto. You have my respect.");
            lblMain.setForeground(Color.blue);
        }
    }
    public void getButtons()
    {
        pnlMain = new JPanel( new GridLayout(1, 3) );
        getButton("Retry");
        pnlMain.add(btnMain);
        getButton("Main Menu");
        pnlMain.add(btnMain);
        getButton("Exit");
        pnlMain.add(btnMain);
    }
}