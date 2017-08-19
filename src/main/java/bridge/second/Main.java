package bridge.second;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 17:25
 */
public class Main {

    /**
     * 抽象和实现分开，Black和White分别实现简单的Color类，Circular和Square实现简单的Shape类
     * 两个维度。
     * 由抽象实现交叉的部分，这是桥接去做的。
     */
    public static void main(String[] args) {
        Color color = new White();
        Shape shape = new Circular();

        shape.setColor(color);
        shape.draw();
    }
}
