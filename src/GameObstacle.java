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

public class GameObstacle extends GameSprite {

    int dx, dy;

    public GameObstacle(int x, int y, Image i) {
        super(x, y, i.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
    }

    public GameObstacle(int x, int y, int w, int h, Image i) {
        super(x, y, i.getScaledInstance(w, h, Image.SCALE_SMOOTH));
    }
}
