package bridge.second;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 17:19
 */
public abstract class Shape {

    private Color color;

    public abstract void draw();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
