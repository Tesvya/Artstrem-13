import javax.swing.*;
public class Test {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(()->{
            new CommissionDigital();
            new CommissionCharcoal();
            new CommissionLandscape();
            new CommissionPortrait();
        });

    }
}
