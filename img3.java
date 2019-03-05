import java.awt.*;
import javax.swing.*;

public class img3 extends  JPanel {
    public void paintComponent(Graphics g) {
        Image image3 = new ImageIcon( "res/sir.jpeg" ).getImage();
        g.drawImage( image3, 0, 0, 100, 100, this );
    }
}