package visitor;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 14:52
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}
