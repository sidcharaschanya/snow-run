import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameChar extends GameSprite {

    double dx, dy;
    char direction = 'r';

    double gravity = 0.15, maxDY = 4;
    public static int lives = 3, score = 0;
    boolean isFalling = false, canJump = true, walking = false, jumping = false, hasKey = false;

    Image PSR = (new ImageIcon(getClass().getResource("/PlayerStandingRight.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    Image PSL = (new ImageIcon(getClass().getResource("/PlayerStandingLeft.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    Image PWR = (new ImageIcon(getClass().getResource("/PlayerWalkingRight.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    Image PWL = (new ImageIcon(getClass().getResource("/PlayerWalkingLeft.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    Image PJR = (new ImageIcon(getClass().getResource("/PlayerJumpingRight.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
    Image PJL = (new ImageIcon(getClass().getResource("/PlayerJumpingLeft.png"))).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);

    public GameChar(int x, int y, Image i) {
        super(x, y, i.getScaledInstance(50, 80, Image.SCALE_SMOOTH));
    }

    public void jumpImage(double jumpHeight) {
        if (canJump == true && hasVerCol()) {
            dy -= jumpHeight;
            canJump = false;
        }
    }

    public void moveImage() {
        if (!hasHorCol()) {
            x += dx;
        }
        if (!hasVerCol()) {
            y += dy;
        }
    }

    public void fall() {
        if (isFalling == true) {
            dy += gravity;
            if (dy >= maxDY) {
                dy = maxDY;
            }
        }
    }

    public boolean hasHorCol() {
        switch (GameFrame.currentLevel) {
            case 1:
                return GamePanel.hasHorizontalCollision();
            case 2:
                return GamePanel2.hasHorizontalCollision();
            case 3:
                return GamePanel3.hasHorizontalCollision();
            case 4:
                return GamePanel4.hasHorizontalCollision();
            case 5:
                return GamePanel5.hasHorizontalCollision();
            case 6:
                return GamePanel6.hasHorizontalCollision();
            case 7:
                return GamePanel7.hasHorizontalCollision();
            case 8:
                return GamePanel8.hasHorizontalCollision();
            case 9:
                return GamePanel9.hasHorizontalCollision();
            case 10:
                return GamePanel10.hasHorizontalCollision();
            default:
                return false;
        }
    }

    public boolean hasVerCol() {
        switch (GameFrame.currentLevel) {
            case 1:
                return GamePanel.hasVerticalCollision();
            case 2:
                return GamePanel2.hasVerticalCollision();
            case 3:
                return GamePanel3.hasVerticalCollision();
            case 4:
                return GamePanel4.hasVerticalCollision();
            case 5:
                return GamePanel5.hasVerticalCollision();
            case 6:
                return GamePanel6.hasVerticalCollision();
            case 7:
                return GamePanel7.hasVerticalCollision();
            case 8:
                return GamePanel8.hasVerticalCollision();
            case 9:
                return GamePanel9.hasVerticalCollision();
            case 10:
                return GamePanel10.hasVerticalCollision();
            default:
                return false;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                dx = 2;
                direction = 'r';
                walking = true;
                img = PWR;
                break;
            case KeyEvent.VK_LEFT:
                dx = -2;
                direction = 'l';
                walking = true;
                img = PWL;
                break;
            case KeyEvent.VK_UP:
                jumping = true;
                if (canJump == true) {
                    isFalling = true;
                    if (direction == 'r') {
                        img = PJR;
                    } else {
                        img = PJL;
                    }
                }
                jumpImage(4);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                dx = 0;
                walking = false;
                if (jumping == true) {
                    img = PJR;
                } else {
                    img = PSR;
                }
                break;
            case KeyEvent.VK_LEFT:
                dx = 0;
                walking = false;
                if (jumping == true) {
                    img = PJL;
                } else {
                    img = PSL;
                }
                break;
            case KeyEvent.VK_UP:
                jumping = false;
                if (direction == 'r') {
                    if (walking == true) {
                        img = PWR;
                    } else {
                        img = PSR;
                    }
                } else {
                    if (walking == true) {
                        img = PWL;
                    } else {
                        img = PSL;
                    }
                }
                break;
        }
    }
}
