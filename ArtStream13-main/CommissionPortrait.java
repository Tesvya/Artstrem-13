

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class CommissionPortrait extends  CommissionDetails {
     
    
    public CommissionPortrait()
    {
        for(int i = 0; i < medium.length; ++i)
        {
            if(i == 1)
            {
                medium[i] = "one";
            }else if(i == 2)
            {
                medium[i] = "two";
            }else if(i == 3)
            {
                medium[i] = "three";

            }
        }
  mediumBox = new JComboBox<>(medium);
        setVisible(true);
    }
    
}
