/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21sidc
 */
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
