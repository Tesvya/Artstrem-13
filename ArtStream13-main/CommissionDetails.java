import javax.swing.*;

import java.awt.*;


public class CommissionDetails extends JFrame {

    private Container con = getContentPane();
    private JPanel[] panelsBorder = new JPanel[2];
    private JLabel header = new JLabel("Art Commission Request Form");
    private JLabel name = new JLabel("Name");
    private JTextField nameField = new JTextField();
    private JLabel email = new JLabel("Email");
    private JTextField emailField = new JTextField();
    private JLabel contact = new JLabel("Contact");
    private JTextField contactField = new JTextField();
    private JLabel artDescription = new JLabel("Describe what you want");
    private JTextArea artDescriptionText = new JTextArea();

    private String[] sizes =
    {
        "Select",
        "Small - ₱1000.00",
        "Medium - ₱1200.00",
        "Large - ₱1500.00"
    };
    private JLabel sizeLabel = new JLabel("Select Size");
    private JComboBox<String> sizeOfArt =  new JComboBox<>(sizes);

    protected String[] medium = 
    {
        "Select",
        "Adobe Photoshop - ₱1000.00",
        "Corel Painter - ₱1900.00",
        "Procreate - ₱2500.00"
    }; 
    private JLabel mediumLabel = new JLabel("Select Medium");
    protected JComboBox<String> mediumBox =  new JComboBox<>(medium);

    
    private ButtonGroup frameOrNot = new ButtonGroup();
    private JLabel frame = new JLabel("I would like it");
    private JRadioButton frameButton = new JRadioButton("Frame-500");
    private JRadioButton notFrameButton = new JRadioButton("Unframed-No Charge");

    private JLabel artistMessage = new JLabel("Message the artist");
    private JTextArea artistMessageText = new JTextArea();
    private JButton submit = new JButton("Submit");



    public CommissionDetails()
    {
        super("Commission Details");
        setSize(500,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        con.setLayout(new BorderLayout());

        frameOrNot.add(frameButton);
        frameOrNot.add(notFrameButton);

        



        for(int i = 0; i < panelsBorder.length; ++i)
        {
            if(i == 0)
            {
                panelsBorder[i] = new JPanel();
                panelsBorder[i].setLayout(new FlowLayout());
                panelsBorder[i].add(header);
                con.add(panelsBorder[i],BorderLayout.NORTH);
            }else{
                panelsBorder[i] = new JPanel();
                panelsBorder[i].setLayout(new BoxLayout(panelsBorder[i], BoxLayout.Y_AXIS));
                panelsBorder[i].add(name);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                nameField.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(nameField);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(email);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                emailField.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(emailField);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(contact);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                contactField.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(contactField);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(artDescription);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                artDescriptionText.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(artDescriptionText);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(sizeLabel);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                sizeOfArt.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(sizeOfArt);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(mediumLabel);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                mediumBox.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(mediumBox);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(frame);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                frameButton.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(frameButton);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(notFrameButton);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                panelsBorder[i].add(artistMessage);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                artistMessageText.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(artistMessageText);
                panelsBorder[i].add(Box.createRigidArea(new Dimension(10, 10)));
                submit.setMaximumSize(new Dimension(200,30));
                panelsBorder[i].add(submit);
                con.add(panelsBorder[i],BorderLayout.CENTER);
            }
        }



        setVisible(true);

    }

    public String[] getSetMedium()
    {
        return medium;
    }




}
