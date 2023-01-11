import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFrame extends JDialog implements WindowListener {

    JPanel mainPanel = new JPanel();
    GamePanel P1 = new GamePanel();
    GamePanel2 P2 = new GamePanel2();
    GamePanel3 P3 = new GamePanel3();
    GamePanel4 P4 = new GamePanel4();
    GamePanel5 P5 = new GamePanel5();
    GamePanel6 P6 = new GamePanel6();
    GamePanel7 P7 = new GamePanel7();
    GamePanel8 P8 = new GamePanel8();
    GamePanel9 P9 = new GamePanel9();
    GamePanel10 P10 = new GamePanel10();
    CardLayout CL = new CardLayout();
    public static GameChar snowMan;
    public static int currentLevel = 1;

    Image PSR = (new ImageIcon(getClass().getResource("/PlayerStandingRight.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    ImageIcon IIPSR = new ImageIcon(PSR);

    public GameFrame(Window w, String s, ModalityType m) {
        super(w, s, m);
        snowMan = new GameChar(15, 560, IIPSR.getImage());
        initUI();
    }

    private void initUI() {
        setTitle("Play Snow Run");

        mainPanel.setLayout(CL);
        this.add(mainPanel);

        mainPanel.add(P1);
        mainPanel.add(P2);
        mainPanel.add(P3);
        mainPanel.add(P4);
        mainPanel.add(P5);
        mainPanel.add(P6);
        mainPanel.add(P7);
        mainPanel.add(P8);
        mainPanel.add(P9);
        mainPanel.add(P10);

        P1.T.start();

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        this.addWindowListener(this);
    }

    public void goNextLevel() {
        currentLevel++;

        if (currentLevel == 2) {
            P2.setVisible(true);
            resetCharacter(15, 480);
            P1.T.stop();
            P2.T.start();
        }
        if (currentLevel == 3) {
            P3.setVisible(true);
            resetCharacter(15, 480);
            P2.T.stop();
            P3.T.start();
        }
        if (currentLevel == 4) {
            P4.setVisible(true);
            resetCharacter(15, 480);
            P3.T.stop();
            P4.T.start();
        }
        if (currentLevel == 5) {
            P5.setVisible(true);
            resetCharacter(15, 480);
            P4.T.stop();
            P5.T.start();
        }
        if (currentLevel == 6) {
            P6.setVisible(true);
            resetCharacter(15, 480);
            P5.T.stop();
            P6.T.start();
        }
        if (currentLevel == 7) {
            P7.setVisible(true);
            resetCharacter(15, 400);
            P6.T.stop();
            P7.T.start();
        }
        if (currentLevel == 8) {
            P8.setVisible(true);
            resetCharacter(735, 560);
            P7.T.stop();
            P8.T.start();
        }
        if (currentLevel == 9) {
            P9.setVisible(true);
            resetCharacter(15, 160);
            P8.T.stop();
            P9.T.start();
        }
        if (currentLevel == 10) {
            P10.setVisible(true);
            resetCharacter(615, 240);
            P9.T.stop();
            P10.T.start();
        }
        if (currentLevel == 11) {
            resetCharacter(15, 560);
            P10.T.stop();
            new GameEndDialog('w', GameChar.score, GameChar.lives, currentLevel - 1);
            resetGame(1);
            GameLevel.gameEnd = true;
            this.dispose();
        }

        CL.next(mainPanel);
    }

    private void resetCharacter(int spawnX, int spawnY) {
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
        GameFrame.snowMan.img = PSR;
    }

    private void resetGame(int curlvl) {
        currentLevel = curlvl;
        GameFrame.snowMan.lives = 3;
        GameFrame.snowMan.score = 0;
    }

    private void resetTimer() {
        if (currentLevel == 1) {
            P1.T.stop();
        }
        if (currentLevel == 2) {
            P2.T.stop();
        }
        if (currentLevel == 3) {
            P3.T.stop();
        }
        if (currentLevel == 4) {
            P4.T.stop();
        }
        if (currentLevel == 5) {
            P5.T.stop();
        }
        if (currentLevel == 6) {
            P6.T.stop();
        }
        if (currentLevel == 7) {
            P7.T.stop();
        }
        if (currentLevel == 8) {
            P8.T.stop();
        }
        if (currentLevel == 9) {
            P9.T.stop();
        }
        if (currentLevel == 10) {
            P10.T.stop();
        }
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
        if (GameLevel.gameEnd == false) {
            resetCharacter(15, 560);
            resetTimer();
            new GameEndDialog('e', GameChar.score, GameChar.lives, currentLevel);
            resetGame(1);
        } else {
            GameLevel.gameEnd = false;
        }
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}
