import java.awt.*;
import javax.swing.*;

public class img2 extends  JPanel {
    public void paintComponent(Graphics g) {
        Image image2 = new ImageIcon( "res/kurica.jpg" ).getImage();
        g.drawImage( image2, 0, 0, 100, 100, this );
    }
}
