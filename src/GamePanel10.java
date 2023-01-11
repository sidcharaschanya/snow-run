import java.awt.*;
import javax.swing.*;
import java.util.logging.*;

public class GamePanel10 extends GameLevel {

    public static GameObstacle block[] = new GameObstacle[17];
    public static GameObstacle door;
    public static GameObstacle key[] = new GameObstacle[5];
    public static GameObstacle token[] = new GameObstacle[9];
    public static GameObstacle diamond[] = new GameObstacle[2];
    public static GameObstacle acid[] = new GameObstacle[6];
    public static GameObstacle spikes[] = new GameObstacle[6];
    public static GameObstacle blackLife[] = new GameObstacle[2];
    public static GameObstacle halfBlock[] = new GameObstacle[2];
    public static GameObstacle halfAcid[] = new GameObstacle[2];
    public static GameObstacle bluePortal;
    public static GameObstacle pinkPortal;

    ImageIcon LBG = new ImageIcon(getClass().getResource("/BackgroundLevel10.png"));

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

    Image BP = (new ImageIcon(getClass().getResource("/BluePortal.png"))).getImage().getScaledInstance(80, 120, Image.SCALE_SMOOTH);
    ImageIcon IIBP = new ImageIcon(BP);

    Image PP = (new ImageIcon(getClass().getResource("/PinkPortal.png"))).getImage().getScaledInstance(80, 120, Image.SCALE_SMOOTH);
    ImageIcon IIPP = new ImageIcon(PP);

    Image OD = (new ImageIcon(getClass().getResource("/OpenDoor.png"))).getImage().getScaledInstance(80, 160, Image.SCALE_SMOOTH);

    public GamePanel10() {
        ImageIcon PSR = new ImageIcon(getClass().getResource("/PlayerStandingRight.png"));

        ImageIcon B = new ImageIcon(getClass().getResource("/Block.png"));
        ImageIcon BN = new ImageIcon(getClass().getResource("/BlockWithNails.png"));
        ImageIcon SB = new ImageIcon(getClass().getResource("/SnowBlock.png"));
        ImageIcon SBN = new ImageIcon(getClass().getResource("/SnowBlockWithNails.png"));

        ImageIcon G = new ImageIcon(getClass().getResource("/Ground.png"));

        ImageIcon K = new ImageIcon(getClass().getResource("/Key.png"));
        ImageIcon SK = new ImageIcon(getClass().getResource("/SnowKey.png"));

        ImageIcon TO = new ImageIcon(getClass().getResource("/Token.png"));
        ImageIcon ST = new ImageIcon(getClass().getResource("/SnowToken.png"));

        ImageIcon D = new ImageIcon(getClass().getResource("/Diamond.png"));

        ImageIcon A = new ImageIcon(getClass().getResource("/Acid.png"));

        ImageIcon SPN = new ImageIcon(getClass().getResource("/SpikesWithNails.png"));
        ImageIcon SPR = new ImageIcon(getClass().getResource("/SpikesRight.png"));
        ImageIcon SPL = new ImageIcon(getClass().getResource("/SpikesLeft.png"));

        ImageIcon BL = new ImageIcon(getClass().getResource("/BlackLife.png"));

        ImageIcon HB = new ImageIcon(getClass().getResource("/HalfBlock.png"));

        ImageIcon HA = new ImageIcon(getClass().getResource("/HalfAcid.png"));

        block[0] = new GameObstacle(80 * 0, 80 * 7, B.getImage());
        block[1] = new GameObstacle(80 * 0, 80 * 4, SBN.getImage());
        block[2] = new GameObstacle(80 * 3, 80 * 3, SBN.getImage());
        block[3] = new GameObstacle(80 * 5, 80 * 3, BN.getImage());
        block[4] = new GameObstacle(80 * 5, 80 * 2, SB.getImage());
        block[5] = new GameObstacle(80 * 6, 80 * 7, B.getImage());
        block[6] = new GameObstacle(80 * 6, 80 * 6, SB.getImage());
        block[7] = new GameObstacle(80 * 7, 80 * 4, SBN.getImage());
        block[8] = new GameObstacle(80 * 8, 80 * 4, SBN.getImage());
        block[9] = new GameObstacle(80 * 9, 80 * 7, B.getImage());
        block[10] = new GameObstacle(80 * 9, 80 * 6, SB.getImage());
        block[11] = new GameObstacle(80 * 10, 80 * 3, BN.getImage());
        block[12] = new GameObstacle(80 * 10, 80 * 2, SB.getImage());
        block[13] = new GameObstacle(80 * 12, 80 * 3, SBN.getImage());
        block[14] = new GameObstacle(80 * 15, 80 * 7, B.getImage());
        block[15] = new GameObstacle(80 * 15, 80 * 4, SBN.getImage());
        block[16] = new GameObstacle(-6, 640, 1292, 86, G.getImage());

        door = new GameObstacle((80 * 7) + 40, 80 * 2, 80, 160, IICD.getImage());

        key[0] = new GameObstacle(80 * 0, 80 * 6, K.getImage());
        key[1] = new GameObstacle((80 * -1) - 5, (80 * -1) - 5, SK.getImage());
        key[2] = new GameObstacle((80 * -1) - 5, (80 * -1) - 5, SK.getImage());
        key[3] = new GameObstacle((80 * -1) - 5, (80 * -1) - 5, SK.getImage());
        key[4] = new GameObstacle((80 * -1) - 5, (80 * -1) - 5, SK.getImage());

        token[0] = new GameObstacle(80 * 0, 80 * 1, ST.getImage());
        token[1] = new GameObstacle(80 * 3, 80 * 6, TO.getImage());
        token[2] = new GameObstacle(80 * 3, 80 * 2, ST.getImage());
        token[3] = new GameObstacle(80 * 6, 80 * 1, ST.getImage());
        token[4] = new GameObstacle((80 * 7) + 40, 80 * 1, ST.getImage());
        token[5] = new GameObstacle(80 * 9, 80 * 1, ST.getImage());
        token[6] = new GameObstacle(80 * 12, 80 * 6, TO.getImage());
        token[7] = new GameObstacle(80 * 12, 80 * 2, ST.getImage());
        token[8] = new GameObstacle(80 * 15, 80 * 1, ST.getImage());

        diamond[0] = new GameObstacle(80 * 4, 80 * 4, D.getImage());
        diamond[1] = new GameObstacle(80 * 11, 80 * 4, D.getImage());

        acid[0] = new GameObstacle(80 * 4, 80 * 7, A.getImage());
        acid[1] = new GameObstacle(80 * 5, 80 * 7, A.getImage());
        acid[2] = new GameObstacle(80 * 7, 80 * 7, A.getImage());
        acid[3] = new GameObstacle(80 * 8, 80 * 7, A.getImage());
        acid[4] = new GameObstacle(80 * 10, 80 * 7, A.getImage());
        acid[5] = new GameObstacle(80 * 11, 80 * 7, A.getImage());

        spikes[0] = new GameObstacle(80 * 1, 80 * 7, SPR.getImage());
        spikes[1] = new GameObstacle(80 * 2, 80 * 7, SPL.getImage());
        spikes[2] = new GameObstacle(80 * 4, 80 * 3, SPN.getImage());
        spikes[3] = new GameObstacle(80 * 11, 80 * 3, SPN.getImage());
        spikes[4] = new GameObstacle(80 * 13, 80 * 7, SPR.getImage());
        spikes[5] = new GameObstacle(80 * 14, 80 * 7, SPL.getImage());

        blackLife[0] = new GameObstacle((80 * 2) + 10, (80 * 3) + 10, 60, 60, BL.getImage());
        blackLife[1] = new GameObstacle((80 * 13) + 10, (80 * 3) + 10, 60, 60, BL.getImage());

        halfBlock[0] = new GameObstacle(80 * 3, 80 * 7, 40, 80, HB.getImage());
        halfBlock[1] = new GameObstacle((80 * 12) + 40, 80 * 7, 40, 80, HB.getImage());

        halfAcid[0] = new GameObstacle((80 * 3) + 40, 80 * 7, 40, 80, HA.getImage());
        halfAcid[1] = new GameObstacle(80 * 12, 80 * 7, 40, 80, HA.getImage());

        bluePortal = new GameObstacle(80 * 9, (80 * 4) + 40, 80, 120, IIBP.getImage());

        pinkPortal = new GameObstacle(80 * 6, (80 * 4) + 40, 80, 120, IIPP.getImage());
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        Graphics2D g2d = (Graphics2D) G;

        g2d.drawImage(LBG.getImage(), 0, 0, 1280, 720, this);

        g2d.drawImage(BA.getImage(), 0, 0, 1280, 80, this);

        g2d.drawImage(IIBP.getImage(), 80 * 0, (80 * 2) + 40, 80, 120, this);

        g2d.drawImage(IIPP.getImage(), 80 * 15, (80 * 2) + 40, 80, 120, this);

        for (int i = 0; i < (block.length - 1); i++) {
            g2d.drawImage(block[i].getImg(), block[i].getX(), block[i].getY(), this);
        }

        g2d.drawImage(door.getImg(), door.getX(), door.getY(), this);

        for (int i = 0; i < key.length; i++) {
            g2d.drawImage(key[i].getImg(), key[i].getX(), key[i].getY(), this);
        }

        for (int i = 0; i < token.length; i++) {
            g2d.drawImage(token[i].getImg(), token[i].getX(), token[i].getY(), this);
        }

        for (int i = 0; i < diamond.length; i++) {
            g2d.drawImage(diamond[i].getImg(), diamond[i].getX(), diamond[i].getY(), this);
        }

        for (int i = 0; i < spikes.length; i++) {
            g2d.drawImage(spikes[i].getImg(), spikes[i].getX(), spikes[i].getY(), this);
        }

        for (int i = 0; i < blackLife.length; i++) {
            g2d.drawImage(blackLife[i].getImg(), blackLife[i].getX(), blackLife[i].getY(), this);
        }

        for (int i = 0; i < halfBlock.length; i++) {
            g2d.drawImage(halfBlock[i].getImg(), halfBlock[i].getX(), halfBlock[i].getY(), this);
        }

        g2d.drawImage(bluePortal.getImg(), bluePortal.getX(), bluePortal.getY(), this);

        g2d.drawImage(pinkPortal.getImg(), pinkPortal.getX(), pinkPortal.getY(), this);

        g2d.drawImage(GameFrame.snowMan.getImg(), GameFrame.snowMan.getX(), GameFrame.snowMan.getY(), this);

        for (int i = 0; i < acid.length; i++) {
            g2d.drawImage(acid[i].getImg(), acid[i].getX(), acid[i].getY(), this);
        }

        for (int i = 0; i < halfAcid.length; i++) {
            g2d.drawImage(halfAcid[i].getImg(), halfAcid[i].getX(), halfAcid[i].getY(), this);
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
        for (int i = 0; i < spikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(spikes[i].getBottom()) && GameFrame.snowMan.dy < 0) {
                GameFrame.snowMan.dy = 0;
                return true;
            }
        }
        for (int i = 0; i < halfBlock.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfBlock[i].getTop()) && GameFrame.snowMan.dy > 0) {
                GameFrame.snowMan.isFalling = false;
                GameFrame.snowMan.canJump = true;
                GameFrame.snowMan.dy = 0;
                return true;
            } else {
                GameFrame.snowMan.isFalling = true;
            }
            if (GameFrame.snowMan.getBounds().intersects(halfBlock[i].getBottom()) && GameFrame.snowMan.dy < 0) {
                GameFrame.snowMan.dy = 0;
                return true;
            }
        }
        for (int i = 0; i < halfAcid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfAcid[i].getBottom()) && GameFrame.snowMan.dy < 0) {
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
        for (int i = 0; i < spikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(spikes[i].getSmallerRight()) && GameFrame.snowMan.dx < 0) {
                return true;
            }
            if (GameFrame.snowMan.getBounds().intersects(spikes[i].getSmallerLeft()) && GameFrame.snowMan.dx > 0) {
                return true;
            }
        }
        for (int i = 0; i < halfBlock.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfBlock[i].getRight()) && GameFrame.snowMan.dx < 0) {
                return true;
            }
            if (GameFrame.snowMan.getBounds().intersects(halfBlock[i].getLeft()) && GameFrame.snowMan.dx > 0) {
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
        if (GameFrame.snowMan.getBounds().intersects(key[0].getSmallerBounds())) {
            key[0].x = -85;
            key[0].y = -85;
            key[1].x = 80 * 10;
            key[1].y = 80 * 1;
        }
        if (GameFrame.snowMan.getBounds().intersects(key[1].getSmallerBounds())) {
            key[1].x = -85;
            key[1].y = -85;
            key[2].x = 80 * 15;
            key[2].y = 80 * 6;
        }
        if (GameFrame.snowMan.getBounds().intersects(key[2].getSmallerBounds())) {
            key[2].x = -85;
            key[2].y = -85;
            key[3].x = 80 * 5;
            key[3].y = 80 * 1;
        }
        if (GameFrame.snowMan.getBounds().intersects(key[3].getSmallerBounds())) {
            key[3].x = -85;
            key[3].y = -85;
            key[4].x = 80 * 12;
            key[4].y = 80 * 1;
        }
        if (GameFrame.snowMan.getBounds().intersects(key[4].getSmallerBounds())) {
            key[4].x = -85;
            key[4].y = -85;
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
        for (int i = 0; i < diamond.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(diamond[i].getSmallerBounds())) {
                diamond[i].x = -85;
                diamond[i].y = -85;
                GameFrame.snowMan.score += 50;
            }
        }
        for (int i = 0; i < acid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(acid[i].getVerticalCenter())) {
                GameFrame.snowMan.x = 615;
                GameFrame.snowMan.y = 240;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < spikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(spikes[i].getVerticalQuarter())) {
                GameFrame.snowMan.x = 615;
                GameFrame.snowMan.y = 240;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < blackLife.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(blackLife[i].getSmallerBounds())) {
                blackLife[i].x = -85;
                blackLife[i].y = -85;
                GameFrame.snowMan.x = 615;
                GameFrame.snowMan.y = 240;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < halfAcid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfAcid[i].getVerticalCenter())) {
                GameFrame.snowMan.x = 615;
                GameFrame.snowMan.y = 240;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        if (GameFrame.snowMan.getBounds().intersects(bluePortal.getSmallerBounds())) {
            GameFrame.snowMan.x = (80 * 0) + 15;
            GameFrame.snowMan.y = 80 * 3;
        }
        if (GameFrame.snowMan.getBounds().intersects(pinkPortal.getSmallerBounds())) {
            GameFrame.snowMan.x = (80 * 15) + 15;
            GameFrame.snowMan.y = 80 * 3;
        }
    }
}
