import java.awt.*;
import javax.swing.*;

public class BackPanel extends JPanel {

    private Image backgroundImage = null;

    public BackPanel() {
        super();
    }

    public void setBackgroundImage(Image image) {
        backgroundImage = image;
        repaint();
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImage, 0, 0, 1280, 720, this);
    }
}
