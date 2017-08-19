package visitor;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:52
 */
public class MyVisitor implements Visitor{

    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
