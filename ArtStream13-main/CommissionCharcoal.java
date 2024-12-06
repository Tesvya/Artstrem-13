
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.*;

public class CommissionCharcoal extends CommissionDetails {
    

    public CommissionCharcoal()
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
