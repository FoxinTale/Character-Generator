import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// I really like Swing for UIs. I don't know why. Sure, it's clunky and messy but it works, and I know how to use it. JavaFX doesn't work too well with openJDK.
// Maybe I'll put these into arrays in the future. Maybe.

public class GUI {
    static boolean genMiddleName = false;
    static boolean useNaturalHair = true;
    static boolean doSexuality = true;
    static int posTraitsCount = 2;
    static int negTraitsCount = 2;
    static String[] hairColourInfo;

    public static void createGUI(){
        Color panelColour =  Color.decode(Lists.coloursMap.get("Lavender"));
        Color mainColour =  Color.decode(Lists.coloursMap.get("Azure"));
        ArrayList<JTextField> textBoxes = new ArrayList<>();

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        window.setTitle("Basic Character Generator  Version 1.0.0");

        JLabel nameLabel = new JLabel("Name: ");
        JLabel genderLabel = new JLabel("Gender: ");
        JLabel sexualityLabel = new JLabel("Sexuality: ");
        JLabel posTraitsLabel = new JLabel("Positive Traits: ");
        JLabel negTraitsLabel = new JLabel("Negative Traits: ");
        JLabel eyeColourLabel = new JLabel("Eye Colour: ");
        JLabel hairColourLabel = new JLabel("Hair Colour: ");

        JPanel namePanel = new RoundedPanel(5, panelColour);
        JPanel mainPanel = new RoundedPanel(10, mainColour);
        JPanel genderPanel = new RoundedPanel(5, panelColour);
        JPanel sexualityPanel = new RoundedPanel(5, panelColour);
        JPanel posTraitsPanel = new RoundedPanel(5, panelColour);
        JPanel negTraitsPanel = new RoundedPanel(5, panelColour);
        JPanel eyeColourPanel = new RoundedPanel(5,panelColour);
        JPanel hairColourPanel = new RoundedPanel(5, panelColour);
        JPanel optionsPanel = new RoundedPanel(5, panelColour);

        JPanel eyeColour = new RoundedPanel(5);
        JPanel hairColour = new RoundedPanel(5);

        JCheckBox middleNameCheck = new JCheckBox("Generate Middle Name.");
        JCheckBox naturalHairCheck = new JCheckBox("Natural Hair Colours.", true);

        JTextField nameBox = new JTextField();
        JTextField genderBox = new JTextField();
        JTextField sexualityBox = new JTextField();
        JTextField posTraitsBox = new JTextField();
        JTextField negTraitsBox = new JTextField();
        JTextField eyeColourBox = new JTextField();
        JTextField hairColourBox = new JTextField();

        textBoxes.add(nameBox);
        textBoxes.add(genderBox);
        textBoxes.add(sexualityBox);
        textBoxes.add(posTraitsBox);
        textBoxes.add(negTraitsBox);
        textBoxes.add(eyeColourBox);
        textBoxes.add(hairColourBox);

        JPanel backgroundPanel = new JPanel();

        JButton generate = new JButton("Make me a character!");

        ActionListener middleCheckDo = e ->{
            genMiddleName = middleNameCheck.isSelected();
        };

        ActionListener naturalHairDo = e -> {
            useNaturalHair = naturalHairCheck.isSelected();
            hairColour.setVisible(!useNaturalHair);
        };

        nameLabel.setBounds(20, 25, 100, 25);
        genderLabel.setBounds(20, 60, 75, 25);
        sexualityLabel.setBounds(320, 60, 75, 25);
        posTraitsLabel.setBounds(20, 95, 100, 25);
        negTraitsLabel.setBounds(20, 130, 100, 25);
        eyeColourLabel.setBounds(20, 165, 100, 25);
        hairColourLabel.setBounds(20, 200, 100, 25);

        nameBox.setBounds(75, 26, 500, 25);
        genderBox.setBounds(75, 61, 225, 25);
        sexualityBox.setBounds(380, 61, 225, 25);
        posTraitsBox.setBounds(125, 96, 450, 25);
        negTraitsBox.setBounds(125, 131, 450, 25);
        eyeColourBox.setBounds(125, 166, 300, 25);
        hairColourBox.setBounds(125, 201, 300, 25);

        genderPanel.setBounds(15, 58, 295, 30);
        sexualityPanel.setBounds(315, 58, 295, 30);
        posTraitsPanel.setBounds(15, 93, 595, 30);
        negTraitsPanel.setBounds(15, 128, 595, 30);
        eyeColourPanel.setBounds(15, 163, 595, 30);
        hairColourPanel.setBounds(15, 198, 595, 30);
        optionsPanel.setBounds(15, 300, 595, 90);

        middleNameCheck.setBounds(20, 310, 200, 20);
        naturalHairCheck.setBounds(220, 310, 200, 20);

        namePanel.setBounds(15,23, 595, 30);
        eyeColour.setBounds(450, 168, 150, 20);
        hairColour.setBounds(450, 203, 150, 20);
        generate.setBounds(15,  397, 595, 30);

        mainPanel.setBounds(5, 5, 615,430);
        backgroundPanel.setBounds(0,0,640, 480);
        backgroundPanel.setBackground(Color.white);

        for (JTextField textBox : textBoxes) {
            textBox.setEditable(false);
            textBox.setBackground(panelColour);
            textBox.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        }

        middleNameCheck.setBackground(panelColour);
        middleNameCheck.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        naturalHairCheck.setBackground(panelColour);
        naturalHairCheck.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        eyeColourPanel.setToolTipText("<html>If you see an eye colour here that makes you question if it really should be an eye colour, please do let me know. <br> I can easily remove things in a minor update.</html>");
        naturalHairCheck.setToolTipText("<html>Leave selected for \"natural\" hair colours. <br> Uncheck to use the entire RGB spectrum for hair colours.</html>");

        ActionListener buttonDo = e -> {
            nameBox.setText(Generate.getName());
            genderBox.setText(Generate.getGender());
            sexualityBox.setText(Generate.getSexuality());

            String[] eyeColourArr = Generate.getColour();
            eyeColour.setBackground(Color.decode(eyeColourArr[1]));
            eyeColourBox.setText(eyeColourArr[0] + " \t " + eyeColourArr[1]);

            if(useNaturalHair){
                hairColourBox.setText(Generate.getNaturalHair());
            } else{
                hairColourInfo = Generate.getHairColour();
                String hairString = String.format("RGB Value: %s, %s, %s \t Hex Value: %s", hairColourInfo[0], hairColourInfo[1], hairColourInfo[2], hairColourInfo[3]);
                hairColour.setBackground(Color.decode(hairColourInfo[3]));
                hairColourBox.setText(hairString);
            }
        };
        generate.addActionListener(buttonDo);
        middleNameCheck.addActionListener(middleCheckDo);
        naturalHairCheck.addActionListener(naturalHairDo);

        hairColour.setVisible(false);

        window.add(nameBox);
        window.add(genderBox);
        window.add(sexualityBox);
        window.add(posTraitsBox);
        window.add(negTraitsBox);
        window.add(eyeColourBox);
        window.add(hairColourBox);

        window.add(eyeColour);
        window.add(hairColour);
        window.add(middleNameCheck);
        window.add(naturalHairCheck);

        window.add(nameLabel);
        window.add(genderLabel);
        window.add(sexualityLabel);
        window.add(posTraitsLabel);
        window.add(negTraitsLabel);
        window.add(eyeColourLabel);
        window.add(hairColourLabel);

        window.add(namePanel);
        window.add(genderPanel);
        window.add(sexualityPanel);
        window.add(posTraitsPanel);
        window.add(negTraitsPanel);
        window.add(eyeColourPanel);
        window.add(hairColourPanel);
        window.add(optionsPanel);

        window.add(generate);
        window.add(mainPanel);

        window.add(backgroundPanel);

        window.setSize(640, 480);
        window.setResizable(false);
        window.setLayout(null);// using no layout managers
        window.setVisible(true);// making the frame visible
    }
}
