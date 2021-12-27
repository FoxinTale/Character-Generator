import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void createGUI(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        window.setTitle("Basic Character Generator");

        Color panelColour =  Color.decode(Lists.coloursMap.get("Powder Blue"));
        Color mainColour =  Color.decode(Lists.coloursMap.get("Azure"));

        JLabel nameLabel = new JLabel("Name: ");
        JPanel namePanel = new RoundedPanel(5, panelColour);
        JPanel mainPanel = new RoundedPanel(10, mainColour);
        JPanel backgroundPanel = new JPanel();


        // Some jpanel bullsh*t to make pixelated hearts?
        nameLabel.setBounds(20, 25, 100, 25);
        namePanel.setBounds(15,23, 120, 30);
        mainPanel.setBounds(5, 5, 615,430);
        backgroundPanel.setBounds(0,0,640, 480);
        backgroundPanel.setBackground(Color.white);

        window.add(nameLabel);
        window.add(namePanel);
        window.add(mainPanel);
        window.add(backgroundPanel);

        window.setSize(640, 480);
        //window.setBackground(backgroundColour);
        window.setResizable(false);
        window.setLayout(null);// using no layout managers
        window.setVisible(true);// making the frame visible
    }
}
