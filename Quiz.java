// import libraries
import java.awt.*;
import javax.swing.*;

// inherit variables and methods from GUI class
public class Quiz extends GUI
{
    public Quiz()
    {
        getFrame("Quiz");
        getQuestion();
        getAnswers();
        setFrame();
    }
    private void getQuestion()
    {
        new Question();
        getLabel(questionNumber + ". " + question);
        lblMain.setPreferredSize( new Dimension(imageSize*arAnswers.size(), titleSize) );
        lblMain.setFont(lblMain.getFont().deriveFont(18.0f));
    }
    public void getAnswers()
    {
        pnlMain = new JPanel( new GridLayout( 1, arAnswers.size() ) );
        for(int i = 0 ; i < arAnswers.size() ; i++)
        {
            JPanel pnlAnswer = new JPanel( new BorderLayout() );
            pnlAnswer.setBackground(Color. black);
            pnlAnswer.add(new JLabel(new ImageIcon(category + "/" + arAnswers.get(i) + ".jpg")), BorderLayout.NORTH);
            getButton( arAnswers.get(i) );
            pnlAnswer.add(btnMain, BorderLayout.CENTER);
            pnlMain.add(pnlAnswer);
        }
    }
}