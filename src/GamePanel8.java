import java.awt.*;
import javax.swing.*;
import java.util.logging.*;

public class GamePanel8 extends GameLevel {

    public static GameObstacle block[] = new GameObstacle[13];
    public static GameObstacle door;
    public static GameObstacle key;
    public static GameObstacle token[] = new GameObstacle[7];
    public static GameObstacle diamond[] = new GameObstacle[2];
    public static GameObstacle acid[] = new GameObstacle[3];
    public static GameObstacle spikes[] = new GameObstacle[6];
    public static GameObstacle blackLife[] = new GameObstacle[2];
    public static GameObstacle halfBlock[] = new GameObstacle[3];
    public static GameObstacle halfSpikes[] = new GameObstacle[3];

    ImageIcon LBG = new ImageIcon(getClass().getResource("/BackgroundLevel8.png"));

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

    public GamePanel8() {
        ImageIcon PSR = new ImageIcon(getClass().getResource("/PlayerStandingRight.png"));

        ImageIcon B = new ImageIcon(getClass().getResource("/Block.png"));
        ImageIcon BN = new ImageIcon(getClass().getResource("/BlockWithNails.png"));
        ImageIcon SB = new ImageIcon(getClass().getResource("/SnowBlock.png"));
        ImageIcon SBN = new ImageIcon(getClass().getResource("/SnowBlockWithNails.png"));

        ImageIcon G = new ImageIcon(getClass().getResource("/Ground.png"));

        ImageIcon SK = new ImageIcon(getClass().getResource("/SnowKey.png"));

        ImageIcon TO = new ImageIcon(getClass().getResource("/Token.png"));
        ImageIcon ST = new ImageIcon(getClass().getResource("/SnowToken.png"));

        ImageIcon D = new ImageIcon(getClass().getResource("/Diamond.png"));
        ImageIcon SD = new ImageIcon(getClass().getResource("/SnowDiamond.png"));

        ImageIcon A = new ImageIcon(getClass().getResource("/Acid.png"));

        ImageIcon SPN = new ImageIcon(getClass().getResource("/SpikesWithNails.png"));
        ImageIcon SPRN = new ImageIcon(getClass().getResource("/SpikesRightWithNails.png"));
        ImageIcon SPLN = new ImageIcon(getClass().getResource("/SpikesLeftWithNails.png"));
        ImageIcon SPBN = new ImageIcon(getClass().getResource("/SpikesBothWithNails.png"));
        ImageIcon SPR = new ImageIcon(getClass().getResource("/SpikesRight.png"));
        ImageIcon SPL = new ImageIcon(getClass().getResource("/SpikesLeft.png"));

        ImageIcon BL = new ImageIcon(getClass().getResource("/BlackLife.png"));

        ImageIcon SHB = new ImageIcon(getClass().getResource("/SnowHalfBlock.png"));
        ImageIcon SHBN = new ImageIcon(getClass().getResource("/SnowHalfBlockWithNails.png"));

        ImageIcon HSP = new ImageIcon(getClass().getResource("/HalfSpikes.png"));
        ImageIcon HSPN = new ImageIcon(getClass().getResource("/HalfSpikesWithNails.png"));

        block[0] = new GameObstacle(80 * 6, 80 * 7, SB.getImage());
        block[1] = new GameObstacle(80 * 4, 80 * 7, B.getImage());
        block[2] = new GameObstacle(80 * 3, 80 * 7, B.getImage());
        block[3] = new GameObstacle(80 * 3, 80 * 6, SB.getImage());
        block[4] = new GameObstacle(80 * 2, 80 * 7, B.getImage());
        block[5] = new GameObstacle(80 * 2, 80 * 6, B.getImage());
        block[6] = new GameObstacle(80 * 2, 80 * 5, SB.getImage());
        block[7] = new GameObstacle(80 * 11, 80 * 3, SBN.getImage());
        block[8] = new GameObstacle(80 * 13, 80 * 7, B.getImage());
        block[9] = new GameObstacle(80 * 13, 80 * 6, B.getImage());
        block[10] = new GameObstacle(80 * 13, 80 * 5, B.getImage());
        block[11] = new GameObstacle(80 * 13, 80 * 4, B.getImage());
        block[12] = new GameObstacle(-6, 640, 1292, 86, G.getImage());

        door = new GameObstacle(80 * 11, 80 * 1, 80, 160, IICD.getImage());

        key = new GameObstacle(80 * 0, 80 * 3, SK.getImage());

        token[0] = new GameObstacle(80 * 6, 80 * 6, ST.getImage());
        token[1] = new GameObstacle(80 * 7, 80 * 2, ST.getImage());
        token[2] = new GameObstacle(80 * 15, 80 * 6, ST.getImage());
        token[3] = new GameObstacle(80 * 15, 80 * 5, ST.getImage());
        token[4] = new GameObstacle(80 * 15, 80 * 4, ST.getImage());
        token[5] = new GameObstacle(80 * 15, 80 * 3, ST.getImage());
        token[6] = new GameObstacle(80 * 15, 80 * 2, ST.getImage());

        diamond[0] = new GameObstacle(80 * 8, 80 * 4, D.getImage());
        diamond[1] = new GameObstacle(80 * 15, 80 * 1, SD.getImage());

        acid[0] = new GameObstacle(80 * 5, 80 * 7, A.getImage());
        acid[1] = new GameObstacle(80 * 1, 80 * 7, A.getImage());
        acid[2] = new GameObstacle(80 * 0, 80 * 7, A.getImage());

        spikes[0] = new GameObstacle(80 * 8, 80 * 3, SPRN.getImage());
        spikes[1] = new GameObstacle(80 * 9, 80 * 3, SPBN.getImage());
        spikes[2] = new GameObstacle(80 * 10, 80 * 3, SPLN.getImage());
        spikes[3] = new GameObstacle(80 * 12, 80 * 3, SPN.getImage());
        spikes[4] = new GameObstacle(80 * 14, 80 * 7, SPR.getImage());
        spikes[5] = new GameObstacle(80 * 15, 80 * 7, SPL.getImage());

        blackLife[0] = new GameObstacle((80 * 7) + 10, (80 * 7) + 10, 60, 60, BL.getImage());
        blackLife[1] = new GameObstacle((80 * 9) + 10, (80 * 4) + 10, 60, 60, BL.getImage());

        halfBlock[0] = new GameObstacle((80 * 4) + 40, 80 * 4, 40, 80, SHBN.getImage());
        halfBlock[1] = new GameObstacle((80 * 7) + 40, 80 * 3, 40, 80, SHBN.getImage());
        halfBlock[2] = new GameObstacle(80 * 13, 80 * 3, 40, 80, SHB.getImage());

        halfSpikes[0] = new GameObstacle(80 * 4, 80 * 4, 40, 80, HSPN.getImage());
        halfSpikes[1] = new GameObstacle(80 * 7, 80 * 3, 40, 80, HSPN.getImage());
        halfSpikes[2] = new GameObstacle((80 * 13) + 40, 80 * 3, 40, 80, HSP.getImage());
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        Graphics2D g2d = (Graphics2D) G;

        g2d.drawImage(LBG.getImage(), 0, 0, 1280, 720, this);

        g2d.drawImage(BA.getImage(), 0, 0, 1280, 80, this);

        g2d.drawImage(IICD.getImage(), 720, 480, this);

        for (int i = 0; i < (block.length - 1); i++) {
            g2d.drawImage(block[i].getImg(), block[i].getX(), block[i].getY(), this);
        }

        g2d.drawImage(door.getImg(), door.getX(), door.getY(), this);

        g2d.drawImage(key.getImg(), key.getX(), key.getY(), this);

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

        for (int i = 0; i < halfSpikes.length; i++) {
            g2d.drawImage(halfSpikes[i].getImg(), halfSpikes[i].getX(), halfSpikes[i].getY(), this);
        }

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
        for (int i = 0; i < halfSpikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfSpikes[i].getBottom()) && GameFrame.snowMan.dy < 0) {
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
        for (int i = 0; i < halfSpikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfSpikes[i].getSmallerRight()) && GameFrame.snowMan.dx < 0) {
                return true;
            }
            if (GameFrame.snowMan.getBounds().intersects(halfSpikes[i].getSmallerLeft()) && GameFrame.snowMan.dx > 0) {
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
        for (int i = 0; i < diamond.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(diamond[i].getSmallerBounds())) {
                diamond[i].x = -85;
                diamond[i].y = -85;
                GameFrame.snowMan.score += 50;
            }
        }
        for (int i = 0; i < acid.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(acid[i].getVerticalCenter())) {
                GameFrame.snowMan.x = 735;
                GameFrame.snowMan.y = 560;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel8.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < spikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(spikes[i].getVerticalQuarter())) {
                GameFrame.snowMan.x = 735;
                GameFrame.snowMan.y = 560;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel8.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < blackLife.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(blackLife[i].getSmallerBounds())) {
                blackLife[i].x = -85;
                blackLife[i].y = -85;
                GameFrame.snowMan.x = 735;
                GameFrame.snowMan.y = 560;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel8.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
        for (int i = 0; i < halfSpikes.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(halfSpikes[i].getVerticalQuarter())) {
                GameFrame.snowMan.x = 735;
                GameFrame.snowMan.y = 560;
                GameFrame.snowMan.lives--;
                if (GameFrame.snowMan.lives != 0) {
                    T.stop();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel8.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    T.start();
                }
            }
        }
    }
}
