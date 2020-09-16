// import libraries
import java.util.*;
import java.awt.*;
import javax.swing.*;

// inherit variables and methods from Main class
public class GUI extends Main
{
    Container cpMain;
    JLabel   lblMain;
    JButton  btnMain;
    JPanel   pnlMain;
    static ArrayList<String> arCategory;
    static String question;
    static ArrayList<String> arAnswers;
    int imageSize = 300;
    int titleSize = 50;
    
    public GUI()
    {
        arCategory = new ArrayList<String>();
        arAnswers  = new ArrayList<String>();
    }
    public void getFrame(String frmName)
    {
        frmMain = new JFrame(frmName);
         cpMain = frmMain.getContentPane();
         cpMain.setLayout( new BorderLayout() );
    }
    public void getLabel(String lblName)
    {
        lblMain = new JLabel(lblName);
        lblMain.setHorizontalAlignment(JLabel.CENTER);
        lblMain.setOpaque(true);
        lblMain.setBackground(Color.black);
        lblMain.setForeground(Color.white);
        lblMain.setFont(lblMain.getFont().deriveFont(32.0f));
    }
    public void getButton(String btnName)
    {
        btnMain = new JButton(btnName);
        btnMain.addActionListener(this);
    }
    public void setFrame()
    {
         cpMain.add(lblMain, BorderLayout.CENTER);
         cpMain.add(pnlMain, BorderLayout.SOUTH);
        frmMain.pack();
        frmMain.setLocationRelativeTo(null);
        frmMain.setResizable(false);
        frmMain.setVisible(true);
    }
    public void setQuestion(String... args)
    {
        question = args[0];
        answer   = args[1];
        for(int i = 1 ; i < args.length ; i++)
        arAnswers.add(args[i]);
        Collections.shuffle(arAnswers);
    }
}