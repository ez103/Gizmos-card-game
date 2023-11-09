
public class Marble {
    private String color;
    private BufferedImage marbleImage;
    private int x;
    private int y;

    public Marble(String color) {
        if (color = "g")
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    private void convert(String color) {
        this.color = color;
    }
    private String getColor() {
        return color;
    }
    private BufferedImage getImage() {
        return image;
    }
}
