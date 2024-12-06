import java.util.ArrayList;
import javax.swing.*;

public interface ArtistsMethodInterface  {
    
    public static ArrayList <JPanel> digi = new ArrayList<>();
    public static ArrayList <JPanel> charc = new ArrayList<>();
    public static ArrayList <JPanel> land = new ArrayList<>();
    public static ArrayList <JPanel> portrait = new ArrayList<>();


    void addArtists(JPanel panel);
    int getArraySize();
    
    
}
