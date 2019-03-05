import java.awt.*;
import javax.swing.*;

public class img4 extends  JPanel {
    public void paintComponent(Graphics g) {
        Image image4 = new ImageIcon( "res/more.jpeg" ).getImage();
        g.drawImage( image4,0,0,100,100,this );
    }

}

