import java.awt.*;
import javax.swing.*;
import java.util.logging.*;

public class GamePanel3 extends GameLevel {

    public static GameObstacle block[] = new GameObstacle[27];
    public static GameObstacle door;
    public static GameObstacle key;
    public static GameObstacle token[] = new GameObstacle[7];
    public static GameObstacle diamond;
    public static GameObstacle acid[] = new GameObstacle[11];
    public static GameObstacle blackLife;
    public static GameObstacle life;

    ImageIcon LBG = new ImageIcon(getClass().getResource("/BackgroundLevel3.png"));

    ImageIcon BA = new ImageIcon(getClass().getResource("/Banner.png"));

    Image ST = (new ImageIcon(getClass().getResource("/ScoreText.png"))).getImage().getScaledInstance(320, 80, Image.SCALE_SMOOTH);
    ImageIcon IIST = new ImageIcon(ST);

    Image KT = (new ImageIcon(getClass().getResource("/KeyText.png"))).getImage().getScaledInstance(240, 80, Image.SCALE_SMOOTH);
    ImageIcon IIKT = new ImageIcon(KT);

    Image CD = (new ImageIcon(getClass().getResource("/ClosedDoor.png"))).getImage().getScaledInstance(80, 160, Image.SCALE_SMOOTH);
    ImageIcon IICD = new ImageIcon(CD);

    Image DL = (new ImageIcon(getClass().getResource("/DisabledLife.png"))).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    ImageIcon IIDL = new ImageIcon(DL);

    Image L = (new ImageIcon(getClass().getResource("/Life.png"))).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    ImageIcon IIL = new ImageIcon(L);

    Image DK = (new ImageIcon(getClass().getResource("/DisabledKey.png"))).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    ImageIcon IIDK = new ImageIcon(DK);

    Image K = (new ImageIcon(getClass().getResource("/Key.png"))).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    ImageIcon IIK = new ImageIcon(K);

    Image OD = (new ImageIcon(getClass().getResource("/OpenDoor.png"))).getImage().getScaledInstance(80, 160, Image.SCALE_SMOOTH);

    public GamePanel3() {
        ImageIcon PSR = new ImageIcon(getClass().getResource("/PlayerStandingRight.png"));

        ImageIcon B = new ImageIcon(getClass().getResource("/Block.png"));
        ImageIcon BN = new ImageIcon(getClass().getResource("/BlockWithNails.png"));
        ImageIcon SB = new ImageIcon(getClass().getResource("/SnowBlock.png"));
        ImageIcon SBN = new ImageIcon(getClass().getResource("/SnowBlockWithNails.png"));

        ImageIcon G = new ImageIcon(getClass().getResource("/Ground.png"));

        ImageIcon SK = new ImageIcon(getClass().getResource("/SnowKey.png"));

        ImageIcon TO = new ImageIcon(getClass().getResource("/Token.png"));
        ImageIcon ST = new ImageIcon(getClass().getResource("/SnowToken.png"));

        ImageIcon SD = new ImageIcon(getClass().getResource("/SnowDiamond.png"));

        ImageIcon A = new ImageIcon(getClass().getResource("/Acid.png"));
        ImageIcon AN = new ImageIcon(getClass().getResource("/AcidWithNails.png"));

        ImageIcon BL = new ImageIcon(getClass().getResource("/BlackLife.png"));

        ImageIcon L = new ImageIcon(getClass().getResource("/Life.png"));

        block[0] = new GameObstacle(0, 560, B.getImage());
        block[1] = new GameObstacle(320, 560, B.getImage());
        block[2] = new GameObstacle(480, 560, B.getImage());
        block[3] = new GameObstacle(1040, 560, B.getImage());
        block[4] = new GameObstacle(1200, 560, B.getImage());
        block[5] = new GameObstacle(880, 480, SBN.getImage());
        block[6] = new GameObstacle(640, 480, BN.getImage());
        block[7] = new GameObstacle(640, 400, B.getImage());
        block[8] = new GameObstacle(560, 400, BN.getImage());
        block[9] = new GameObstacle(480, 320, SBN.getImage());
        block[10] = new GameObstacle(400, 320, SBN.getImage());
        block[11] = new GameObstacle(320, 240, SBN.getImage());
        block[12] = new GameObstacle(240, 240, BN.getImage());
        block[13] = new GameObstacle(240, 160, SB.getImage());
        block[14] = new GameObstacle(160, 240, BN.getImage());
        block[15] = new GameObstacle(80, 240, BN.getImage());
        block[16] = new GameObstacle(0, 240, BN.getImage());
        block[17] = new GameObstacle(0, 160, SB.getImage());
        block[18] = new GameObstacle(560, 160, SBN.getImage());
        block[19] = new GameObstacle(800, 160, SBN.getImage());
        block[20] = new GameObstacle(960, 240, SBN.getImage());
        block[21] = new GameObstacle(1040, 240, SBN.getImage());
        block[22] = new GameObstacle(1120, 320, BN.getImage());
        block[23] = new GameObstacle(1120, 240, SB.getImage());
        block[24] = new GameObstacle(1200, 320, BN.getImage());
        block[25] = new GameObstacle(1200, 240, SB.getImage());
        block[26] = new GameObstacle(-6, 640, 1292, 86, G.getImage());

        door = new GameObstacle(1200, 80, 80, 160, IICD.getImage());

        key = new GameObstacle(240, 80, SK.getImage());

        token[0] = new GameObstacle(0, 320, TO.getImage());
        token[1] = new GameObstacle(160, 320, TO.getImage());
        token[2] = new GameObstacle(320, 320, TO.getImage());
        token[3] = new GameObstacle(1040, 320, TO.getImage());
        token[4] = new GameObstacle(880, 240, ST.getImage());
        token[5] = new GameObstacle(320, 160, ST.getImage());
        token[6] = new GameObstacle(960, 160, ST.getImage());

        diamond = new GameObstacle(0, 80, SD.getImage());

        acid[0] = new GameObstacle(80, 560, A.getImage());
        acid[1] = new GameObstacle(160, 560, A.getImage());
        acid[2] = new GameObstacle(240, 560, A.getImage());
        acid[3] = new GameObstacle(400, 560, A.getImage());
        acid[4] = new GameObstacle(1120, 560, A.getImage());
        acid[5] = new GameObstacle(720, 480, AN.getImage());
        acid[6] = new GameObstacle(800, 480, AN.getImage());
        acid[7] = new GameObstacle(80, 160, A.getImage());
        acid[8] = new GameObstacle(160, 160, A.getImage());
        acid[9] = new GameObstacle(640, 160, AN.getImage());
        acid[10] = new GameObstacle(720, 160, AN.getImage());

        blackLife = new GameObstacle(890, 170, 60, 60, BL.getImage());

        life = new GameObstacle(1210, 490, 60, 60, L.getImage());
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        Graphics2D g2d = (Graphics2D) G;

        g2d.drawImage(LBG.getImage(), 0, 0, 1280, 720, this);

        g2d.drawImage(BA.getImage(), 0, 0, 1280, 80, this);

        g2d.drawImage(IICD.getImage(), 0, 400, this);

        for (int i = 0; i < (block.length - 1); i++) {
            g2d.drawImage(block[i].getImg(), block[i].getX(), block[i].getY(), this);
        }

        g2d.drawImage(door.getImg(), door.getX(), door.getY(), this);

        g2d.drawImage(key.getImg(), key.getX(), key.getY(), this);

        for (int i = 0; i < token.length; i++) {
            g2d.drawImage(token[i].getImg(), token[i].getX(), token[i].getY(), this);
        }

        g2d.drawImage(diamond.getImg(), diamond.getX(), diamond.getY(), this);

        g2d.drawImage(blackLife.getImg(), blackLife.getX(), blackLife.getY(), this);

        g2d.drawImage(life.getImg(), life.getX(), life.getY(), this);

        g2d.drawImage(GameFrame.snowMan.getImg(), GameFrame.snowMan.getX(), GameFrame.snowMan.getY(), this);

        for (int i = 0; i < acid.length; i++) {
            g2d.drawImage(acid[i].getImg(), acid[i].getX(), acid[i].getY(), this);
        }

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2d.drawImage(IIST.getImage(), 240, 0, this);
        g2d.setColor(Color.white);
        g2d.setFont(new Font("Monaco", Font.PLAIN, 72));
        g2d.setRenderingHints(rh);
        g2d.drawString(String.valueOf(GameFrame.snowMan.score), 560, 70);

        if (GameFrame.snowMan.lives == 3) {
            g2d.drawImage(IIL.getImage(), 10, 10, this);
            g2d.drawImage(IIL.getImage(), 90, 10, this);
            g2d.drawImage(IIL.getImage(), 170, 10, this);
        } else {
            if (GameFrame.snowMan.lives == 2) {
                g2d.drawImage(IIL.getImage(), 10, 10, this);
                g2d.drawImage(IIL.getImage(), 90, 10, this);
                g2d.drawImage(IIDL.getImage(), 170, 10, this);
            } else {
                g2d.drawImage(IIL.getImage(), 10, 10, this);
                g2d.drawImage(IIDL.getImage(), 90, 10, this);
                g2d.drawImage(IIDL.getImage(), 170, 10, this);
            }
        }

        g2d.drawImage(IIKT.getImage(), 960, 0, this);
        if (GameFrame.snowMan.hasKey == true) {
            g2d.drawImage(IIK.getImage(), 1180, 0, this);
        } else {
            g2d.drawImage(IIDK.getImage(), 1180, 0, this);
        }

        hasCollision();

        Toolkit.getDefaultToolkit().sync();
    }

    public static boolean hasVerticalCollision() {
        for (int i = 0; i < block.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(block[i].getTop()) && GameFrame.snowMan.dy > 0) {
                GameFrame.snowMan.isFalling = false;
                GameFrame.snowMan.canJump = true;
                GameFrame.snowMan.dy = 0;
                return true;
            } else {
                GameFrame.snowMan.isFalling = true;
            }
            if (GameFrame.snowMan.getBounds().intersects(block[i].getBottom()) && GameFrame.snowMan.dy < 0) {
                GameFrame.snowMan.dy = 0;
                return true;
            }
        }
        for (int i = 0; i < acid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(acid[i].getBottom()) && GameFrame.snowMan.dy < 0) {
                GameFrame.snowMan.dy = 0;
                return true;
            }
        }
        return false;
    }

    public static boolean hasHorizontalCollision() {
        for (int i = 0; i < block.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(block[i].getRight()) && GameFrame.snowMan.dx < 0) {
                return true;
            }
            if (GameFrame.snowMan.getBounds().intersects(block[i].getLeft()) && GameFrame.snowMan.dx > 0) {
                return true;
            }
        }
        return false;
    }

    public void hasCollision() {
        if (GameFrame.snowMan.getBounds().intersects(door.getSmallerBounds()) && GameFrame.snowMan.hasKey == true) {
            GameFrame F = (GameFrame) SwingUtilities.windowForComponent(this);
            F.goNextLevel();
        }
        if (GameFrame.snowMan.getBounds().intersects(key.getSmallerBounds())) {
            key.x = -85;
            key.y = -85;
            GameFrame.snowMan.hasKey = true;
            door.setImg(OD);
        }
        for (int i = 0; i < token.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(token[i].getSmallerBounds())) {
                token[i].x = -85;
                token[i].y = -85;
                GameFrame.snowMan.score += 10;
            }
        }
        if (GameFrame.snowMan.getBounds().intersects(diamond.getSmallerBounds())) {
            diamond.x = -85;
            diamond.y = -85;
            GameFrame.snowMan.score += 50;
        }
        for (int i = 0; i < acid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(acid[i].getVerticalCenter())) {
                GameFrame.snowMan.x = 15;
                GameFrame.snowMan.y = 480;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        if (GameFrame.snowMan.getBounds().intersects(blackLife.getSmallerBounds())) {
            blackLife.x = -85;
            blackLife.y = -85;
            GameFrame.snowMan.x = 15;
            GameFrame.snowMan.y = 480;
            GameFrame.snowMan.lives--;
            if (GameFrame.snowMan.lives != 0) {
                T.stop();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GamePanel3.class.getName()).log(Level.SEVERE, null, ex);
                }
                T.start();
            }
        }
        if (GameFrame.snowMan.getBounds().intersects(life.getSmallerBounds())) {
            if (GameFrame.snowMan.lives != 3) {
                life.x = -85;
                life.y = -85;
                GameFrame.snowMan.lives++;
            }
        }
    }
}
