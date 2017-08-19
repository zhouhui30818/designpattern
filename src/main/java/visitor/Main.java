package visitor;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:54
 */
public class Main {

    /**
     * 访问者模式
     */
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
