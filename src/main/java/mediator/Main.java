package mediator;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 15:07
 */
public class Main {

    /**
     * 中介模式的功能，就是改变同事类之间网状的引用为星状，即中介类是星状的中心。
     * 这样的好处是，简化引用，每个同事类只需要维护和中介类的关系就可以了。
     * 缺点是，系统严重依赖中介类，如果中介类出现问题，将出现严重的问题。
     */
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
