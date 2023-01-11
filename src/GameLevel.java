import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameLevel extends JPanel implements ActionListener, KeyListener {

    private final int DELAY = 8;
    public Timer T = new Timer(DELAY, this);
    public static boolean gameEnd = false;

    GameLevel() {
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        this.addKeyListener(this);
    }

    public void reset(int spawnX, int spawnY, int curlvl) {
        GameFrame.snowMan.dx = 0;
        GameFrame.snowMan.dy = 0;
        GameFrame.snowMan.direction = 'r';
        GameFrame.snowMan.gravity = 0.15;
        GameFrame.snowMan.maxDY = 4;
        GameFrame.snowMan.isFalling = false;
        GameFrame.snowMan.canJump = true;
        GameFrame.snowMan.walking = false;
        GameFrame.snowMan.jumping = false;
        GameFrame.snowMan.hasKey = false;
        GameFrame.snowMan.x = spawnX;
        GameFrame.snowMan.y = spawnY;
        T.stop();
        GameFrame.currentLevel = curlvl;
        GameFrame.snowMan.lives = 3;
        GameFrame.snowMan.score = 0;
        gameEnd = true;
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    public void actionPerformed(ActionEvent e) {
        if (GameFrame.snowMan.lives == 0) {
            new GameEndDialog('l', GameChar.score, GameChar.lives, GameFrame.currentLevel);
            reset(15, 560, 1);
        }

        int x = GameFrame.snowMan.getX();
        int y = GameFrame.snowMan.getY();

        if (x >= 0 && x <= 1230) {
            GameFrame.snowMan.moveImage();
        } else {
            if (x > 1230) {
                GameFrame.snowMan.x = 1230;
            } else {
                GameFrame.snowMan.x = 0;
            }

            GameFrame.snowMan.moveImage();
        }

        if (y >= 0 && y <= 640) {
            GameFrame.snowMan.moveImage();
        } else {
            GameFrame.snowMan.y = 0;

            GameFrame.snowMan.dy = 0;
            GameFrame.snowMan.moveImage();
        }

        GameFrame.snowMan.fall();

        repaint();
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
    }

    public Dimension getPreferredSize() {
        return new Dimension(1280, 740);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        GameFrame.snowMan.keyPressed(e);

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            new GameEndDialog('e', GameChar.score, GameChar.lives, GameFrame.currentLevel);
            reset(15, 560, 1);
        }
    }

    public void keyReleased(KeyEvent e) {
        GameFrame.snowMan.keyReleased(e);
    }
}
