import java.awt.*;
import javax.swing.*;

public class GamePanel9 extends GameLevel {

    public static GameObstacle block[] = new GameObstacle[32];
    public static GameObstacle door;
    public static GameObstacle key;
    public static GameObstacle token[] = new GameObstacle[73];
    public static GameObstacle diamond[] = new GameObstacle[2];
    public static GameObstacle life;

    ImageIcon LBG = new ImageIcon(getClass().getResource("/BackgroundLevel9.png"));

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

    public GamePanel9() {
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

        ImageIcon L = new ImageIcon(getClass().getResource("/Life.png"));

        block[0] = new GameObstacle(80 * 0, 80 * 7, B.getImage());
        block[1] = new GameObstacle(80 * 0, 80 * 6, B.getImage());
        block[2] = new GameObstacle(80 * 0, 80 * 5, B.getImage());
        block[3] = new GameObstacle(80 * 0, 80 * 4, B.getImage());
        block[4] = new GameObstacle(80 * 0, 80 * 3, SB.getImage());
        block[5] = new GameObstacle(80 * 2, 80 * 6, BN.getImage());
        block[6] = new GameObstacle(80 * 2, 80 * 5, B.getImage());
        block[7] = new GameObstacle(80 * 2, 80 * 4, B.getImage());
        block[8] = new GameObstacle(80 * 2, 80 * 3, B.getImage());
        block[9] = new GameObstacle(80 * 2, 80 * 2, B.getImage());
        block[10] = new GameObstacle(80 * 2, 80 * 1, SB.getImage());
        block[11] = new GameObstacle(80 * 4, 80 * 7, B.getImage());
        block[12] = new GameObstacle(80 * 4, 80 * 3, BN.getImage());
        block[13] = new GameObstacle(80 * 4, 80 * 2, SB.getImage());
        block[14] = new GameObstacle(80 * 6, 80 * 6, SBN.getImage());
        block[15] = new GameObstacle(80 * 7, 80 * 6, BN.getImage());
        block[16] = new GameObstacle(80 * 7, 80 * 5, B.getImage());
        block[17] = new GameObstacle(80 * 7, 80 * 2, SBN.getImage());
        block[18] = new GameObstacle(80 * 8, 80 * 5, BN.getImage());
        block[19] = new GameObstacle(80 * 8, 80 * 4, SB.getImage());
        block[20] = new GameObstacle(80 * 9, 80 * 4, BN.getImage());
        block[21] = new GameObstacle(80 * 9, 80 * 3, SB.getImage());
        block[22] = new GameObstacle(80 * 12, 80 * 5, SBN.getImage());
        block[23] = new GameObstacle(80 * 13, 80 * 6, BN.getImage());
        block[24] = new GameObstacle(80 * 13, 80 * 4, BN.getImage());
        block[25] = new GameObstacle(80 * 13, 80 * 3, SB.getImage());
        block[26] = new GameObstacle(80 * 15, 80 * 7, B.getImage());
        block[27] = new GameObstacle(80 * 15, 80 * 6, B.getImage());
        block[28] = new GameObstacle(80 * 15, 80 * 5, B.getImage());
        block[29] = new GameObstacle(80 * 15, 80 * 4, B.getImage());
        block[30] = new GameObstacle(80 * 15, 80 * 3, SB.getImage());
        block[31] = new GameObstacle(-6, 640, 1292, 86, G.getImage());

        door = new GameObstacle(80 * 15, 80 * 1, 80, 160, IICD.getImage());

        key = new GameObstacle(80 * 4, 80 * 1, SK.getImage());

        token[0] = new GameObstacle(80 * 1, 80 * 6, ST.getImage());
        token[1] = new GameObstacle(80 * 1, 80 * 5, ST.getImage());
        token[2] = new GameObstacle(80 * 1, 80 * 4, ST.getImage());
        token[3] = new GameObstacle(80 * 1, 80 * 3, ST.getImage());
        token[4] = new GameObstacle(80 * 1, 80 * 2, ST.getImage());
        token[5] = new GameObstacle(80 * 1, 80 * 1, ST.getImage());
        token[6] = new GameObstacle(80 * 2, 80 * 7, TO.getImage());
        token[7] = new GameObstacle(80 * 3, 80 * 7, ST.getImage());
        token[8] = new GameObstacle(80 * 3, 80 * 6, ST.getImage());
        token[9] = new GameObstacle(80 * 3, 80 * 5, ST.getImage());
        token[10] = new GameObstacle(80 * 3, 80 * 4, ST.getImage());
        token[11] = new GameObstacle(80 * 3, 80 * 2, ST.getImage());
        token[12] = new GameObstacle(80 * 3, 80 * 1, ST.getImage());
        token[13] = new GameObstacle(80 * 4, 80 * 6, TO.getImage());
        token[14] = new GameObstacle(80 * 4, 80 * 5, TO.getImage());
        token[15] = new GameObstacle(80 * 4, 80 * 4, TO.getImage());
        token[16] = new GameObstacle(80 * 5, 80 * 7, ST.getImage());
        token[17] = new GameObstacle(80 * 5, 80 * 6, ST.getImage());
        token[18] = new GameObstacle(80 * 5, 80 * 5, ST.getImage());
        token[19] = new GameObstacle(80 * 5, 80 * 4, ST.getImage());
        token[20] = new GameObstacle(80 * 5, 80 * 3, ST.getImage());
        token[21] = new GameObstacle(80 * 5, 80 * 2, ST.getImage());
        token[22] = new GameObstacle(80 * 5, 80 * 1, ST.getImage());
        token[23] = new GameObstacle(80 * 6, 80 * 7, TO.getImage());
        token[24] = new GameObstacle(80 * 6, 80 * 5, ST.getImage());
        token[25] = new GameObstacle(80 * 6, 80 * 4, ST.getImage());
        token[26] = new GameObstacle(80 * 6, 80 * 3, ST.getImage());
        token[27] = new GameObstacle(80 * 6, 80 * 2, ST.getImage());
        token[28] = new GameObstacle(80 * 6, 80 * 1, ST.getImage());
        token[29] = new GameObstacle(80 * 7, 80 * 7, TO.getImage());
        token[30] = new GameObstacle(80 * 7, 80 * 4, TO.getImage());
        token[31] = new GameObstacle(80 * 7, 80 * 3, TO.getImage());
        token[32] = new GameObstacle(80 * 7, 80 * 1, ST.getImage());
        token[33] = new GameObstacle(80 * 8, 80 * 7, TO.getImage());
        token[34] = new GameObstacle(80 * 8, 80 * 6, TO.getImage());
        token[35] = new GameObstacle(80 * 8, 80 * 3, ST.getImage());
        token[36] = new GameObstacle(80 * 8, 80 * 2, ST.getImage());
        token[37] = new GameObstacle(80 * 8, 80 * 1, ST.getImage());
        token[38] = new GameObstacle(80 * 9, 80 * 7, TO.getImage());
        token[39] = new GameObstacle(80 * 9, 80 * 6, TO.getImage());
        token[40] = new GameObstacle(80 * 9, 80 * 5, TO.getImage());
        token[41] = new GameObstacle(80 * 9, 80 * 2, ST.getImage());
        token[42] = new GameObstacle(80 * 9, 80 * 1, ST.getImage());
        token[43] = new GameObstacle(80 * 10, 80 * 7, ST.getImage());
        token[44] = new GameObstacle(80 * 10, 80 * 6, ST.getImage());
        token[45] = new GameObstacle(80 * 10, 80 * 5, ST.getImage());
        token[46] = new GameObstacle(80 * 10, 80 * 4, ST.getImage());
        token[47] = new GameObstacle(80 * 10, 80 * 3, ST.getImage());
        token[48] = new GameObstacle(80 * 10, 80 * 2, ST.getImage());
        token[49] = new GameObstacle(80 * 10, 80 * 1, ST.getImage());
        token[50] = new GameObstacle(80 * 11, 80 * 7, ST.getImage());
        token[51] = new GameObstacle(80 * 11, 80 * 6, ST.getImage());
        token[52] = new GameObstacle(80 * 11, 80 * 5, ST.getImage());
        token[53] = new GameObstacle(80 * 11, 80 * 4, ST.getImage());
        token[54] = new GameObstacle(80 * 11, 80 * 3, ST.getImage());
        token[55] = new GameObstacle(80 * 11, 80 * 2, ST.getImage());
        token[56] = new GameObstacle(80 * 11, 80 * 1, ST.getImage());
        token[57] = new GameObstacle(80 * 12, 80 * 7, TO.getImage());
        token[58] = new GameObstacle(80 * 12, 80 * 6, TO.getImage());
        token[59] = new GameObstacle(80 * 12, 80 * 4, ST.getImage());
        token[60] = new GameObstacle(80 * 12, 80 * 3, ST.getImage());
        token[61] = new GameObstacle(80 * 12, 80 * 2, ST.getImage());
        token[62] = new GameObstacle(80 * 12, 80 * 1, ST.getImage());
        token[63] = new GameObstacle(80 * 13, 80 * 7, TO.getImage());
        token[64] = new GameObstacle(80 * 13, 80 * 2, ST.getImage());
        token[65] = new GameObstacle(80 * 13, 80 * 1, ST.getImage());
        token[66] = new GameObstacle(80 * 14, 80 * 7, ST.getImage());
        token[67] = new GameObstacle(80 * 14, 80 * 6, ST.getImage());
        token[68] = new GameObstacle(80 * 14, 80 * 5, ST.getImage());
        token[69] = new GameObstacle(80 * 14, 80 * 4, ST.getImage());
        token[70] = new GameObstacle(80 * 14, 80 * 3, ST.getImage());
        token[71] = new GameObstacle(80 * 14, 80 * 2, ST.getImage());
        token[72] = new GameObstacle(80 * 14, 80 * 1, ST.getImage());

        diamond[0] = new GameObstacle(80 * 3, 80 * 3, SD.getImage());
        diamond[1] = new GameObstacle(80 * 13, 80 * 5, D.getImage());

        life = new GameObstacle((80 * 1) + 10, (80 * 7) + 10, 60, 60, L.getImage());
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        Graphics2D g2d = (Graphics2D) G;

        g2d.drawImage(LBG.getImage(), 0, 0, 1280, 720, this);

        g2d.drawImage(BA.getImage(), 0, 0, 1280, 80, this);

        g2d.drawImage(IICD.getImage(), 0, 80, this);

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

        g2d.drawImage(life.getImg(), life.getX(), life.getY(), this);

        g2d.drawImage(GameFrame.snowMan.getImg(), GameFrame.snowMan.getX(), GameFrame.snowMan.getY(), this);

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
        for (int i = 0; i < diamond.length; i++) {
            if (GameFrame.snowMan.getBounds().intersects(diamond[i].getSmallerBounds())) {
                diamond[i].x = -85;
                diamond[i].y = -85;
                GameFrame.snowMan.score += 50;
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
