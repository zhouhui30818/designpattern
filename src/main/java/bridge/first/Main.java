package bridge.first;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/14 17:09
 */
public class Main {

    /**
     * 桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化。
     * 实现系统可能有多个角度分类，每一种角度都可能变化，那么把这种多角度分类给分离出来让他们独立变化，减少他们之间耦合。
     *
     *  就是把具体实现都分开，简单的实现，桥接来做业务实现，本例子体现了抽象和实现分开，但是没有体现多角度。
     *  具体看第2个例子
     */
    public static void main(String[] args) {
        Bridge bridge = new Bridge(new SourceSub2());
        bridge.execute();
    }
}
