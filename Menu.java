// import libraries
import java.awt.*;
import javax.swing.*;

// inherit variables and methods from GUI class
public class Menu extends GUI
{
    int rowCategory = 1;
    
    public Menu()
    {
        getFrame("Main Menu");
        getMessage();
        getButtons();
        setFrame();
    }
    public void getMessage()
    {
        getLabel("Welcome to Nick's Java Quiz! Choose your category...");
        new Question();
        if( rowCategory > arCategory.size() )
        rowCategory = arCategory.size();
        lblMain.setPreferredSize( new Dimension(imageSize*4, titleSize + imageSize - (rowCategory-1)*26) );
    }
    public void getButtons()
    {
        pnlMain = new JPanel( new BorderLayout() );
        JPanel pnlCategory = new JPanel( new GridLayout(rowCategory, arCategory.size() / rowCategory) );
        for(int i = 0 ; i < arCategory.size()  ; i++)
        {
            getButton( arCategory.get(i) );
            pnlCategory.add(btnMain);
        }
        pnlMain.add(pnlCategory, BorderLayout.CENTER);
        getButton("Exit");
        pnlMain.add(btnMain, BorderLayout.EAST);
    }
}