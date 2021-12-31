import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// I really like Swing for UIs. I don't know why. Sure, it's clunky and messy but it works, and I know how to use it. JavaFX doesn't work too well with openJDK.
// Maybe I'll put these into arrays in the future. Maybe.

public class GUI {
    static boolean genMiddleName = false;

    public static void createGUI(){
        Color panelColour =  Color.decode(Lists.coloursMap.get("Lavender"));
        Color mainColour =  Color.decode(Lists.coloursMap.get("Azure"));
        ArrayList<JTextField> textBoxes = new ArrayList<>();

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        window.setTitle("Basic Character Generator --- Version 1.0.0");

        JLabel nameLabel = new JLabel("Name: ");
        //JLabel nameSliderLabel = new JLabel("Name \"Bias\": ");
       // JLabel nameSliderValueLabel = new JLabel("Value: ");
        JLabel genderLabel = new JLabel("Gender: ");
        JLabel sexualityLabel = new JLabel("Sexuality: ");
        JLabel posTraitsLabel = new JLabel("Positive Traits: ");
        JLabel negTraitsLabel = new JLabel("Negative Traits: ");
        JLabel eyeColourLabel = new JLabel("Eye Colour: ");

        JPanel namePanel = new RoundedPanel(5, panelColour);
        JPanel nameSliderPanel = new RoundedPanel(5, panelColour);
        JPanel mainPanel = new RoundedPanel(10, mainColour);
        JPanel genderPanel = new RoundedPanel(5, panelColour);
        JPanel sexualityPanel = new RoundedPanel(5, panelColour);
        JPanel posTraitsPanel = new RoundedPanel(5, panelColour);
        JPanel negTraitsPanel = new RoundedPanel(5, panelColour);
        JPanel eyeColourPanel = new RoundedPanel(5,panelColour);
        JPanel optionsPanel = new RoundedPanel(5, panelColour);
        JPanel eyeColour = new RoundedPanel(5);

        JCheckBox middleNameCheck = new JCheckBox("Generate Middle Name.");

        JTextField nameSliderValue = new JTextField();
        JTextField nameBox = new JTextField();
        JTextField genderBox = new JTextField();
        JTextField sexualityBox = new JTextField();
        JTextField posTraitsBox = new JTextField();
        JTextField negTraitsBox = new JTextField();
        JTextField eyeColourBox = new JTextField();

        textBoxes.add(nameSliderValue);
        textBoxes.add(nameBox);
        textBoxes.add(genderBox);
        textBoxes.add(sexualityBox);
        textBoxes.add(posTraitsBox);
        textBoxes.add(negTraitsBox);
        textBoxes.add(eyeColourBox);

        JSlider nameSlider = new JSlider();
        JPanel backgroundPanel = new JPanel();

        JButton generate = new JButton("Make me a character!");
        //nameSlider.addChangeListener(ce -> nameSliderValue.setText(Integer.toString(nameSlider.getValue())));

        ActionListener middleCheckDo = e ->{
            genMiddleName = middleNameCheck.isSelected();
        };

        nameLabel.setBounds(20, 25, 100, 25);
       // nameSliderLabel.setBounds(20, 60, 100, 25);
        //nameSliderValueLabel.setBounds(20, 78, 50, 25);
        genderLabel.setBounds(20, 125, 75, 25);
        sexualityLabel.setBounds(320, 125, 75, 25);
        posTraitsLabel.setBounds(20, 160, 100, 25);
        negTraitsLabel.setBounds(20, 195, 100, 25);
        eyeColourLabel.setBounds(20, 230, 100, 25);

        nameBox.setBounds(75, 26, 500, 25);
        genderBox.setBounds(75, 126, 225, 25);
        sexualityBox.setBounds(380, 126, 225, 25);
        posTraitsBox.setBounds(125, 161, 450, 25);
        negTraitsBox.setBounds(125, 196, 450, 25);
        eyeColourBox.setBounds(125, 231, 300, 25);

        genderPanel.setBounds(15, 123, 295, 30);
        sexualityPanel.setBounds(315, 123, 295, 30);
        posTraitsPanel.setBounds(15, 158, 595, 30);
        negTraitsPanel.setBounds(15, 193, 595, 30);
        eyeColourPanel.setBounds(15, 228, 595, 30);
        optionsPanel.setBounds(15, 300, 595, 90);

        middleNameCheck.setBounds(20, 310, 200, 20);

        //nameSliderValue.setBounds(60, 80, 50, 20);
        //nameSlider.setBounds(120, 60, 475, 50);
        namePanel.setBounds(15,23, 595, 30);
        //nameSliderPanel.setBounds(15, 58, 595, 60);
        eyeColour.setBounds(450, 233, 150, 20);
        generate.setBounds(15,  397, 595, 30);

        mainPanel.setBounds(5, 5, 615,430);
        backgroundPanel.setBounds(0,0,640, 480);
        backgroundPanel.setBackground(Color.white);

       // nameSlider.setBackground(panelColour);
       // nameSlider.setPaintTicks(true);
       // nameSlider.setPaintTrack(true);
      ///  nameSlider.setSnapToTicks(true);
       // nameSlider.setMinimum(0);
       // nameSlider.setMaximum(100);

        for (JTextField textBox : textBoxes) {
            textBox.setEditable(false);
            textBox.setBackground(panelColour);
            textBox.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        }

        middleNameCheck.setBackground(panelColour);
        middleNameCheck.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        nameSliderPanel.setToolTipText("<html>Set the \"bias\" of the generated name. <br> Set higher for more female sounding names, lower for more male sounding names. <br> In the middle will be 50-50. This works independent of the generated gender.</html>");
        eyeColourPanel.setToolTipText("<html>If you see an eye colour here that makes you question if it really should be an eye colour, please do let me know. <br> I can easily remove things in a minor update.</html>");

        nameSlider.setMajorTickSpacing(5);
        nameSlider.setMinorTickSpacing(1);

        ActionListener buttonDo = e -> {
            //System.out.println(nameSlider.getValue());
            String name = "";
            if(!genMiddleName) {
                name = Generate.getFemaleName() + " " + Generate.getSurname();
            } else {
                name = Generate.getFemaleName() + " " + Generate.getFemaleName()  + " " + Generate.getSurname();
            }
            nameBox.setText(name);
            Generate.getName(nameSlider.getValue());
            genderBox.setText(Generate.getGender());
            sexualityBox.setText(Generate.getSexuality());

            String[] eyeColourArr = Generate.getColour();
            eyeColour.setBackground(Color.decode(eyeColourArr[1]));
            eyeColourBox.setText(eyeColourArr[0] + " \t " + eyeColourArr[1]);
        };
        generate.addActionListener(buttonDo);
        middleNameCheck.addActionListener(middleCheckDo);

        window.add(nameBox);
        window.add(genderBox);
        window.add(sexualityBox);
        window.add(posTraitsBox);
        window.add(negTraitsBox);
        window.add(eyeColourBox);

        window.add(nameSlider);
        window.add(eyeColour);
        window.add(middleNameCheck);

        window.add(nameLabel);
        //window.add(nameSliderLabel);
       // window.add(nameSliderValueLabel);
        window.add(genderLabel);
        window.add(sexualityLabel);
        window.add(posTraitsLabel);
        window.add(negTraitsLabel);
        window.add(eyeColourLabel);

        window.add(namePanel);
        window.add(nameSliderPanel);
        window.add(genderPanel);
        window.add(sexualityPanel);
        window.add(posTraitsPanel);
        window.add(negTraitsPanel);
        window.add(eyeColourPanel);
        window.add(optionsPanel);

       // window.add(nameSliderValue);

        window.add(generate);
        window.add(mainPanel);

        window.add(backgroundPanel);

        window.setSize(640, 480);
        window.setResizable(false);
        window.setLayout(null);// using no layout managers
        window.setVisible(true);// making the frame visible
    }
}
