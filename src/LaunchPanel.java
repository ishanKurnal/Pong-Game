import java.awt.*;
import javax.swing.*;

public class LaunchPanel extends JPanel {

    Image image;
    
    LaunchPanel() {
        
        this.setLayout(null);
        image = new ImageIcon("space.jpg").getImage();
        this.setPreferredSize(new Dimension(700,700));

    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(image, 0, 0, null);

        g2d.setPaint(Color.GREEN);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 100));
        g2d.drawString("PING PONG", 50, 100);

    }

}


