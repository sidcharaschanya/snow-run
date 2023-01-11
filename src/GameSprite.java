import java.awt.Image;
import java.awt.Rectangle;

public class GameSprite {

    Image img;
    int x, y, w, h;

    public GameSprite(int x, int y, Image i) {
        this.x = x;
        this.y = y;
        img = i;
        w = img.getWidth(null);
        h = img.getHeight(null);
    }

    public void setImg(Image i) {
        img = i.getScaledInstance(w, h, Image.SCALE_SMOOTH);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return img.getWidth(null);
    }

    public int getH() {
        return img.getHeight(null);
    }

    public Image getImg() {
        return img;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, img.getWidth(null), img.getHeight(null));
    }

    public Rectangle getSmallerBounds() {
        return new Rectangle(x + 6, y + 6, img.getWidth(null) - 12, img.getHeight(null) - 12);
    }

    public Rectangle getTop() {
        return new Rectangle(x + 5, y, img.getWidth(null) - 10, 5);
    }

    public Rectangle getBottom() {
        return new Rectangle(x + 5, y + img.getHeight(null) - 5, img.getWidth(null) - 10, 5);
    }

    public Rectangle getRight() {
        return new Rectangle(x + img.getWidth(null) - 5, y + 5, 5, img.getHeight(null) - 10);
    }

    public Rectangle getLeft() {
        return new Rectangle(x, y + 5, 5, img.getHeight(null) - 10);
    }

    public Rectangle getVerticalCenter() {
        return new Rectangle(x + 5, y + 40, img.getWidth(null) - 10, 5);
    }

    public Rectangle getVerticalQuarter() {
        return new Rectangle(x + 5, y + 20, img.getWidth(null) - 10, 5);
    }

    public Rectangle getSmallerRight() {
        return new Rectangle(x + img.getWidth(null) - 5, y + 25, 5, img.getHeight(null) - 30);
    }

    public Rectangle getSmallerLeft() {
        return new Rectangle(x, y + 25, 5, img.getHeight(null) - 30);
    }
}
