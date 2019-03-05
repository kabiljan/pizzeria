import java.awt.*;
import javax.swing.*;

public class imgs extends  JPanel{
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon( "res/grib1.jpg" ).getImage();
        g.drawImage( image, 0, 0, 100, 100, this );
    }
}




